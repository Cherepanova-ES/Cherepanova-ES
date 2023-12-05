package course2.ui.dialog;

import course2.model.Group;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.NumberFormat;

public class GroupDialog {

    // диалог для добавления группы
    public static Group add(JFrame frame) {
        return getNewGroup(frame, null, "Добавление группы");
    }

    // диалог для реактирования группы
    public static Group edit(JFrame frame, Group oldGroup) {
        return getNewGroup(frame, oldGroup, "Редактирование группы");
    }

    private static Group getNewGroup(JFrame frame, Group oldGroup, String title) {
        // создаем компоненты ввода внутри панели
        var panel = new JPanel(new BorderLayout(10, 10));
        var labels = new JPanel(new GridLayout(0, 1));
        labels.add(new JLabel("Наименование", SwingConstants.RIGHT));
        labels.add(new JLabel("Номер", SwingConstants.RIGHT));
        panel.add(labels, BorderLayout.LINE_START);

        var controls = new JPanel(new GridLayout(0, 1));
        var name = new JTextField();
        var formatter = new NumberFormatter(NumberFormat.getIntegerInstance());
        formatter.setValueClass(Integer.class);
        var number = new JFormattedTextField(formatter);

        controls.add(name);
        controls.add(number);
        panel.add(controls, BorderLayout.CENTER);

        // вводим данные в поля ввода, если редактирование
        if (oldGroup != null) {
            name.setText(oldGroup.getName());
            number.setValue(oldGroup.getNumber());
        }

        // отображаем диалог ввода данных
        var result = JOptionPane.showConfirmDialog(frame, panel, title, JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        // обрабатываем результат
        if (result == 0) {
            if (!name.getText().isBlank() && number.getValue() != null) {
                return new Group(name.getText(), (Integer) number.getValue());
            } else {
                JOptionPane.showMessageDialog(frame, "Данные заполнены некорректно", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }

        return null;
    }
}
