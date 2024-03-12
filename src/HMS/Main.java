package HMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HospitalManagementSystem hospital = new HospitalManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Example: Add a patient
        System.out.println("Enter patient details:");
        System.out.print("Name: ");
        String patientName = scanner.nextLine();
        System.out.print("Age: ");
        int patientAge = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the");
        Patient patient = new Patient(patientName, patientAge, "Male", "Address", "1234567890");
        hospital.addPatient(patient);

        hospital.displayPatients();

        // Close scanner
        scanner.close();
    }
}
