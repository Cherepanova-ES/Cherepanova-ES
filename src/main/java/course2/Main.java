package course2;

import course2.model.Child;
import course2.model.Gender;
import course2.model.Group;
import course2.model.Kindergarten;
import course2.ui.Application;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var testData = getTestData();
        // создаем экземпляр класса с тестовыми данными
        var kindergarten = new Kindergarten(testData);
        // запускаем Swing приложение
        SwingUtilities.invokeLater(() -> new Application(kindergarten));
    }

    private static List<Group> getTestData() {
        String[] groupNames = {
                "Солнышко",
                "Тополёк",
                "Незнайка"
        };

        String[] childFullNames = {
                "Мартынов Матвей Михайлович",
                "Кулагин Михаил Кириллович",
                "Нечаева Таисия Анатольевна",
                "Королев Родион Матвеевич",
                "Михайлова Софья Фёдоровна",
                "Тимофеев Даниил Саввич",
                "Емельянова Мадина Савельевна",
                "Павлова Арина Владиславовна",
                "Беляева Алина Сергеевна",
                "Леонова Марьяна Макаровна",
                "Андреев Демид Мартинович",
                "Виноградова Ева Романовна",
                "Андреева Анастасия Савельевна",
                "Воробьева Ева Александровна",
                "Григорьев Фёдор Дмитриевич",
                "Морозов Роман Григорьевич",
                "Бондарев Михаил Макарович",
                "Андреев Тимофей Егорович",
                "Румянцев Михаил Александрович",
                "Басов Илья Алексеевич"
        };

        var maxInGroup = childFullNames.length / 2;
        var minInGroup = 3;
        var maxAge = 7;
        var minAge = 2;

        var rand = new Random();
        List<Group> groups = new ArrayList<>();

        for (int i = 0; i < groupNames.length; i++) {
            var group = new Group(groupNames[i], i + 1);
            var childrenCount = rand.nextInt(maxInGroup - minInGroup + 1) + minInGroup;

            for (int j = 0; j < childrenCount; j++) {
                var index = rand.nextInt(childFullNames.length - 1);
                var fullName = childFullNames[index];
                var gender = fullName.endsWith("а") ? Gender.FEMALE : Gender.MALE;
                var age = rand.nextInt(maxAge - minAge + 1) + minAge;
                var child = new Child(fullName, gender, age);
                group.addChild(child);
            }

            groups.add(group);
        }

        return groups;
    }
}