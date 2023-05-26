package lessons.Lesson1.model;

public class Human {
    public String name;
    private String gender;
    private int age;
    private Pasport data;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
