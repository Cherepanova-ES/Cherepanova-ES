package course2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class Kindergarten extends JFrame {

    private List<Group> groups = new ArrayList<>();

    public Kindergarten() {
        setTitle("Детский сад");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel groupNameLabel = new JLabel("Название группы:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(groupNameLabel, constraints);

        JTextField groupNameField = new JTextField(20);
        constraints.gridx = 1;
        panel.add(groupNameField, constraints);

        JLabel groupNumberLabel = new JLabel("Номер группы:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(groupNumberLabel, constraints);

        JTextField groupNumberField = new JTextField(20);
        constraints.gridx = 1;
        panel.add(groupNumberField, constraints);

        JButton addGroupButton = new JButton("Добавить группу");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        addGroupButton.addActionListener(e -> {
            String groupName = groupNameField.getText();
            String groupNumber = groupNumberField.getText();
            Group group = new Group(groupName, Integer.parseInt(groupNumber));
            groups.add(group);
            System.out.println("Группа " + groupName + " добавлена под номер " + groupNumber);
        });
        panel.add(addGroupButton, constraints);

        JLabel childNameLabel = new JLabel("Имя ребенка:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        panel.add(childNameLabel, constraints);

        JTextField childNameField = new JTextField(20);
        constraints.gridx = 1;
        panel.add(childNameField, constraints);

        JButton addChildButton = new JButton("Добавить ребенка");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        addChildButton.addActionListener(e -> {
            String childName = childNameField.getText();
            String groupIndex = (String) JOptionPane.showInputDialog(null, "Выберите группу:",
                    "Добавить ребенка в группу", JOptionPane.QUESTION_MESSAGE, null,
                    groups.toArray(), groups.get(0));
            if(groupIndex != null) {
                ArrayList children = groups.get(groupIndex);
                children.add(childName);
                groups.put(groupIndex, children);
                System.out.println("Ребенок " + childName + " добавлен в группу " + groupIndex);
            }
        });
        panel.add(addChildButton, constraints);

        JTextArea groupInfoArea = new JTextArea(10, 30);
        groupInfoArea.setEditable(false);
        JScrollPane groupInfoScrollPane = new JScrollPane(groupInfoArea);
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        panel.add(groupInfoScrollPane, constraints);

        JButton viewGroupInfoButton = new JButton("Показать информацию по группе");
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        viewGroupInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedGroup = (String) JOptionPane.showInputDialog(null, "Выберите группу:",
                        "Показать информацию по группе", JOptionPane.QUESTION_MESSAGE, null,
                        groups.keySet().toArray(), groups.keySet().toArray()[0]);
                if(selectedGroup != null) {
                    ArrayList children = groups.get(selectedGroup);
                    StringBuilder groupInfo = new StringBuilder("Группа: " + selectedGroup + "\n");
                    groupInfo.append("Ребенок: \n");
                    for(String child : children) {
                        groupInfo.append(child).append("\n");
                    }
                    groupInfoArea.setText(groupInfo.toString());
                }
            }
        });
        panel.add(viewGroupInfoButton, constraints);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Kindergarten().setVisible(true);
            }
        });
    }
}