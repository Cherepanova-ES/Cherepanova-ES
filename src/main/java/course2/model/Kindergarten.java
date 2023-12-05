package course2.model;

import java.util.List;

public class Kindergarten {

    private final List<Group> groups;

    public Kindergarten(List<Group> groups) {
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void removeGroup(Group group) {
        groups.remove(group);
    }
}
