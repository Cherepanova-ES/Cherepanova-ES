package course2.ui.dialog;

import course2.model.Child;
import course2.model.Gender;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.NumberFormat;

public class ChildDialog {

    // диалог для добавления ребенка
    public static Child add(JFrame frame) {
        return getNewChild(frame, null, "Добавление ребенка");
    }

    // диалог для реактирования ребенка
    public static Child edit(JFrame frame, Child oldChild) {
        return getNewChild(frame, oldChild, "Редактирование ребенка");
    }

    private static Child getNewChild(JFrame frame, Child oldChild, String title) {
        // создаем компоненты ввода внутри панели
        var panel = new JPanel(new BorderLayout(10, 10));
        var labels = new JPanel(new GridLayout(0, 1));
        labels.add(new JLabel("ФИО", SwingConstants.RIGHT));
        labels.add(new JLabel("Пол", SwingConstants.RIGHT));
        labels.add(new JLabel("Возраст", SwingConstants.RIGHT));
        panel.add(labels, BorderLayout.LINE_START);

        var controls = new JPanel(new GridLayout(0, 1));
        var fullName = new JTextField();

        var gender = new JComboBox<>(Gender.values());

        var formatter = new NumberFormatter(NumberFormat.getIntegerInstance());
        formatter.setValueClass(Integer.class);
        var age = new JFormattedTextField(formatter);

        controls.add(fullName);
        controls.add(gender);
        controls.add(age);
        panel.add(controls, BorderLayout.CENTER);

        // вводим данные в поля ввода, если редактирование
        if (oldChild != null) {
            fullName.setText(oldChild.getFullName());
            gender.setSelectedItem(oldChild.getGender());
            age.setValue(oldChild.getAge());
        }

        // отображаем диалог ввода данных
        var result = JOptionPane.showConfirmDialog(frame, panel, title, JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (result == 0) {
            if (!fullName.getText().isBlank() && age.getValue() != null) {
                return new Child(fullName.getText(), (Gender) gender.getSelectedItem(), (Integer) age.getValue());
            } else {
                JOptionPane.showMessageDialog(frame, "Данные заполнены некорректно", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }

        return null;
    }
}
