package HMS;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {
    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Appointment> appointments;

    // Constructor
    public HospitalManagementSystem() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    // Method to add a patient
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to add a doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method to schedule an appointment
    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    // Method to display all patients
    public void displayPatients() {
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    // Method to display all doctors
    public void displayDoctors() {
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    // Method to display all appointments
    public void displayAppointments() {
        System.out.println("Appointments:");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }
}

