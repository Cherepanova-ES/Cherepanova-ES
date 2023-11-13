package course2;
import java.util.*;
public class Daycare {
    private List groups;

    public Daycare() {
        this.groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }
}
