package course2.model;

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

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s (%s)", gender.getValue(), fullName, getAgeAsString(age));
    }

    private String getAgeAsString(int age) {
        if (age == 1) {
            return age + " год";
        } else if (age > 1 && age < 5) {
            return age + " года";
        } else {
            return age + " лет";
        }
    }
}
