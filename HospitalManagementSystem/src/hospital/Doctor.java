package hospital;

public class Doctor {
    private String name;
    private String specialization;
    private String contactNumber;

    // Constructor
    public Doctor(String name, String specialization, String contactNumber) {
        this.name = name;
        this.specialization = specialization;
        this.contactNumber = contactNumber;
    }

    // Method to display doctor information
    public void displayInfo() {
        System.out.println("Doctor Name: " + name + ", Specialization: " + specialization + ", Contact: " + contactNumber);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
