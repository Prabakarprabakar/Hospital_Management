package HMS;

public class MedicalRecord {
    private Patient patient;
    private String diagnosis;
    private String treatment;

    // Constructor
    public MedicalRecord(Patient patient, String diagnosis, String treatment) {
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    // Getter methods
    public Patient getPatient() {
        return patient;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    // Setter methods (if needed)
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    // Override toString() method to display medical record information
    @Override
    public String toString() {
        return "Patient: " + patient.getName() + "\nDiagnosis: " + diagnosis + "\nTreatment: " + treatment;
    }
}

