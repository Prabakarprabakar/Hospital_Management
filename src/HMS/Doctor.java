package HMS;

public class Doctor {
    private String name;
    private String specialization;
    private String phoneNumber;

    // Constructor
    public Doctor(String name, String specialization, String phoneNumber) {
        this.name = name;
        this.specialization = specialization;
        this.phoneNumber = phoneNumber;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter methods (if needed)
    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Override toString() method to display doctor information
    @Override
    public String toString() {
        return "Name: " + name + "\nSpecialization: " + specialization + "\nPhone Number: " + phoneNumber;
    }
}

