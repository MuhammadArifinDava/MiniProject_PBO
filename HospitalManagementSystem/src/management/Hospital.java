package management;

import hospital.Patient;
import hospital.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    private static final ArrayList<Patient> patients = new ArrayList<>();
    private static final ArrayList<Doctor> doctors = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            
            do {
                System.out.println("\nHospital Management System");
                System.out.println("1. Add Patient");
                System.out.println("2. Display Patients");
                System.out.println("3. Update Patient");
                System.out.println("4. Delete Patient");
                System.out.println("5. Add Doctor");
                System.out.println("6. Display Doctors");
                System.out.println("7. Update Doctor");
                System.out.println("8. Delete Doctor");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (choice) {
                    case 1:
                        // Add Patient
                        System.out.print("Enter patient name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter patient age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter illness: ");
                        String illness = scanner.nextLine();
                        Patient patient = new Patient(name, age, illness);
                        patients.add(patient);
                        break;
                        
                    case 2:
                        // Display Patients
                        System.out.println("List of Patients:");
                        for (Patient p : patients) {
                            p.displayInfo();
                        }
                        break;
                        
                    case 3:
                        // Update Patient
                        System.out.print("Enter patient name to update: ");
                        String updateName = scanner.nextLine();
                        for (Patient p : patients) {
                            if (p.getName().equalsIgnoreCase(updateName)) {
                                System.out.print("Enter new age: ");
                                int newAge = scanner.nextInt();
                                scanner.nextLine(); // Consume newline
                                System.out.print("Enter new illness: ");
                                String newIllness = scanner.nextLine();
                                p.setAge(newAge);
                                p.setIllness(newIllness);
                                System.out.println("Patient updated successfully.");
                            }
                        }
                        break;
                        
                    case 4:
                        // Delete Patient
                        System.out.print("Enter patient name to delete: ");
                        String deleteName = scanner.nextLine();
                        patients.removeIf(p -> p.getName().equalsIgnoreCase(deleteName));
                        System.out.println("Patient deleted successfully.");
                        break;
                        
                    case 5:
                        // Add Doctor
                        System.out.print("Enter doctor name: ");
                        String docName = scanner.nextLine();
                        System.out.print("Enter specialization: ");
                        String specialization = scanner.nextLine();
                        System.out.print("Enter contact number: ");
                        String contactNumber = scanner.nextLine();
                        Doctor doctor = new Doctor(docName, specialization, contactNumber);
                        doctors.add(doctor);
                        break;
                        
                    case 6:
                        // Display Doctors
                        System.out.println("List of Doctors:");
                        for (Doctor d : doctors) {
                            d.displayInfo();
                        }
                        break;
                        
                    case 7:
                        // Update Doctor
                        System.out.print("Enter doctor name to update: ");
                        String updateDocName = scanner.nextLine();
                        for (Doctor d : doctors) {
                            if (d.getName().equalsIgnoreCase(updateDocName)) {
                                System.out.print("Enter new specialization: ");
                                String newSpecialization = scanner.nextLine();
                                System.out.print("Enter new contact number: ");
                                String newContactNumber = scanner.nextLine();
                                d.setSpecialization(newSpecialization);
                                d.setContactNumber(newContactNumber);
                                System.out.println("Doctor updated successfully.");
                            }
                        }
                        break;
                        
                    case 8:
                        // Delete Doctor
                        System.out.print("Enter doctor name to delete: ");
                        String deleteDocName = scanner.nextLine();
                        doctors.removeIf(d -> d.getName().equalsIgnoreCase(deleteDocName));
                        System.out.println("Doctor deleted successfully.");
                        break;
                        
                    case 0:
                        // Exit
                        System.out.println("Exiting...");
                        break;
                        
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 0);
        }
    }
}
