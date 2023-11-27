package course2;
import java.util.ArrayList;
import java.util.List;
public class Group {
    private String name;
    private int number;
    private List<Child> children;

    public Group(String name, int number) {
        this.name = name;
        this.number = number;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void addChild(Child child) {
        children.add(child);
    }

    public void removeChild(Child child) {
        children.remove(child);
    }
}


