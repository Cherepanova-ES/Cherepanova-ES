package course2;
import java.util.HashMap;
import java.util.Map;
public class Main {
    private Map<Integer, Group> groups;

    public Main() {
        this.groups = new HashMap<>();
    }

    public void addGroup(int number, String name) {
        Group group = new Group(name, number);
        groups.put(number, group);
    }

    public void removeGroup(int number) {
        groups.remove(number);
    }

    public void addChildToGroup(int groupNumber, Child child) {
        Group group = groups.get(groupNumber);
        if (group != null) {
            group.addChild(child);
        } else {
            System.out.println("Группа не найдена");
        }
    }

    public void removeChildFromGroup(int groupNumber, Child child) {
        Group group = groups.get(groupNumber);
        if (group != null) {
            group.removeChild(child);
        } else {
            System.out.println("Группа не найдена");
        }
    }

    public void displayGroupInfo(int groupNumber) {
        Group group = groups.get(groupNumber);
        if (group != null) {
            System.out.println("Группа: " + group.getName() + ", номер: " + group.getNumber());
            System.out.println("Дети в группе:");
            for (Child child : group.getChildren()) {
                System.out.println("Имя: " + child.getFullName() + ", пол: " + child.getGender() + ", возраст: " + child.getAge());
            }
        } else {
            System.out.println("Группа не найдена");
        }
    }

    public static void main(String[] args) {
        Main system = new Main();

        system.addGroup(1, "Солнышко");

        Child child1 = new Child("Диана Ашигова", "ж", 4);
        system.addChildToGroup(1, child1);

        Child child2 = new Child("Иван Петров", "м", 3);
        system.addChildToGroup(1, child2);

        system.displayGroupInfo(1);

    }
}