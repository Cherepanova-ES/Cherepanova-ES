package course2;

public class Child {
    private String fullName;
    private Gender gender;
    private int age;

    public Child(String fullName, Gender gender, int age) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


}
