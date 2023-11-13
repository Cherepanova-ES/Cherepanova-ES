package course2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Daycare daycare = new Daycare();

        Group group1 = new Group("Радуга", 1);
        Group group2 = new Group("Солнышко", 2);

        Child child1 = new Child("Маша Иванова", "ж", 3);
        Child child2 = new Child("Андрей Петров", "м", 4);
        Child child3 = new Child("Ольга Бузова", "ж", 3);

        group1.addChild(child1);
        group1.addChild(child2);
        group2.addChild(child3);

        daycare.addGroup(group1);
        daycare.addGroup(group2);

    }
}