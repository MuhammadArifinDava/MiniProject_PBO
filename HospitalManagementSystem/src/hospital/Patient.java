package hospital;

public class Patient {
    private String name;
    private int age;
    private String illness;

    // Constructor
    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    // Method to display patient information
    public void displayInfo() {
        System.out.println("Patient Name: " + name + ", Age: " + age + ", Illness: " + illness);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIllness() {
        return illness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
