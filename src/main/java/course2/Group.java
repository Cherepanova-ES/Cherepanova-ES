package course2;
import java.util.*;
public class Group {
    private String name;
    private int number;
    private List children;

    public Group(String name, int number) {
        this.name = name;
        this.number = number;
        this.children = new ArrayList<>();
    }

    public void addChild(Child child) {
        children.add(child);
    }



}


