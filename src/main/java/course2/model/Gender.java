package course2.model;

public enum Gender {
    MALE("M"),
    FEMALE("Ж");

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
