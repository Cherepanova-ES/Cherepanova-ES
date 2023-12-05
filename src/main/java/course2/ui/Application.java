package course2.ui;

import course2.model.Child;
import course2.model.Group;
import course2.model.Kindergarten;
import course2.ui.dialog.ChildDialog;
import course2.ui.dialog.GroupDialog;
import course2.ui.popup.CustomPopupMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Application {

    private final Kindergarten kindergarten;
    private final JList<Group> groupList;
    private final JList<Child> childList;
    private final JLabel counterLabel;
    private final JFrame frame;

    public Application(Kindergarten kindergarten) {
        this.kindergarten = kindergarten;
        groupList = createGroupList(); // создаем компонент для списка групп
        childList = createChildList(); // создаем компонент для списка детей
        counterLabel = new JLabel("", SwingConstants.RIGHT); // создаем счетчик групп/детей

        // создаем основной frame
        frame = new JFrame("Детский сад");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(createContentPanel());
        frame.setLocationRelativeTo(null); // помещаем в центр экрана
        frame.setVisible(true);

        refreshGroupList(); // обновляем список групп

        // выделяем первую группу если она есть
        if (groupList.getModel().getSize() > 0) {
            groupList.setSelectedIndex(0);
        }
    }

    // метод создания основной панели контента
    private JPanel createContentPanel() {
        var p = new JPanel();
        var padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        p.setBorder(padding);

        var layout = new BorderLayout(5, 5);
        p.setLayout(layout);
        p.add(createButtonPanel(), BorderLayout.PAGE_START);
        p.add(new JScrollPane(groupList), BorderLayout.WEST);
        p.add(new JScrollPane(childList), BorderLayout.CENTER);
        p.add(counterLabel, BorderLayout.SOUTH);
        return p;
    }

    // метод создания верхней панели кнопок
    public JPanel createButtonPanel() {
        var p = new JPanel(new BorderLayout());
        var addGroupBtn = new JButton("Добавить группу");
        addGroupBtn.addActionListener(e -> {
            var group = GroupDialog.add(frame);

            if (group != null) {
                kindergarten.addGroup(group);
                refreshGroupList();
                groupList.setSelectedIndex(groupList.getModel().getSize() - 1);
            }
        });

        var addChildBtn = new JButton("Добавить ребенка");
        addChildBtn.addActionListener(e -> {
            var child = ChildDialog.add(frame);

            if (child != null) {
                var group = groupList.getSelectedValue();
                group.addChild(child);
                refreshChildList();
                childList.setSelectedIndex(childList.getModel().getSize() - 1);
            }
        });
        p.add(addGroupBtn, BorderLayout.WEST);
        p.add(addChildBtn, BorderLayout.EAST);
        return p;
    }

    // метод создания списка групп
    public JList<Group> createGroupList() {
        var jList = new JList<Group>();
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList.setComponentPopupMenu(createGroupListPopupMenu(jList));
        jList.setPreferredSize(new Dimension(150, 10));
        jList.addListSelectionListener(e -> refreshChildList());
        return jList;
    }

    // метод создания списка детей
    public JList<Child> createChildList() {
        var jList = new JList<Child>();
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList.setComponentPopupMenu(createChildListPopupMenu(jList));
        return jList;
    }

    // метод создания всплывающего меню для списка групп
    private JPopupMenu createGroupListPopupMenu(JList<Group> groupList) {
        // обработчик редактирования группы
        ActionListener editListener = e -> {
            var selectedIndex = groupList.getSelectedIndex();

            if (selectedIndex != -1) {
                var oldGroup = groupList.getSelectedValue();
                var newGroup = GroupDialog.edit(frame, oldGroup);
                if (newGroup != null) {
                    oldGroup.setName(newGroup.getName());
                    oldGroup.setNumber(newGroup.getNumber());
                    groupList.updateUI();
                }
            }
        };

        // обработчик удаления группы
        ActionListener deleteListener = e -> {
            var selectedIndex = groupList.getSelectedIndex();

            if (selectedIndex != -1) {
                var group = groupList.getSelectedValue();
                kindergarten.removeGroup(group);
                refreshGroupList();
            }
        };

        return CustomPopupMenu.create(groupList, editListener, deleteListener);
    }

    // метод создания всплывающего меню для списка детей
    private JPopupMenu createChildListPopupMenu(JList<Child> childList) {
        // обработчик редактирования ребенка
        ActionListener editListener = e -> {
            var selectedIndex = childList.getSelectedIndex();

            if (selectedIndex != -1) {
                var oldChild = childList.getSelectedValue();
                var newChild = ChildDialog.edit(frame, oldChild);
                if (newChild != null) {
                    oldChild.setFullName(newChild.getFullName());
                    oldChild.setGender(newChild.getGender());
                    oldChild.setAge(newChild.getAge());
                    childList.updateUI();
                }
            }
        };

        // обработчик удаления ребенка
        ActionListener deleteListener = e -> {
            var selectedIndex = childList.getSelectedIndex();

            if (selectedIndex != -1) {
                var group = groupList.getSelectedValue();
                var child = childList.getSelectedValue();
                group.removeChild(child);
                refreshChildList();
            }
        };

        return CustomPopupMenu.create(childList, editListener, deleteListener);
    }

    // метод обновления списка групп
    public void refreshGroupList() {
        var model = new DefaultListModel<Group>();
        model.addAll(kindergarten.getGroups());
        groupList.setModel(model);
        refreshChildList();
    }

    // метод обновления списка детей
    public void refreshChildList() {
        var group = groupList.getSelectedValue();
        var model = new DefaultListModel<Child>();

        if (group != null) {
            model.addAll(group.getChildren());
        }

        childList.setModel(model);
        refreshCounterLabel();
    }

    // метод обновления счетчика групп/детей
    private void refreshCounterLabel() {
        var groupCount = kindergarten.getGroups().size();
        int childrenCount = 0;

        for (Group group : kindergarten.getGroups()) {
            childrenCount += group.getChildren().size();
        }

        var text = String.format("групп: %d детей: %d", groupCount, childrenCount);
        counterLabel.setText(text);
    }
}
