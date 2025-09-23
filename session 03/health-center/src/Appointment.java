import java.util.Date;

public class Appointment {
    private Date date;
    // private Time time;

    private Doctor doctor;
    private Diagnosis diagnosis;
    private Patient patient;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


    public void ShowInfo(){
        // quiero mostrar: nombre del paciente, nombre del doctor, especialidad del doctor y fecha.
        System.out.println("Appointment Date: " + this.date);
        System.out.println("Appointment Doctor: " + this.doctor.getFullName());
        System.out.println("Doctor Speciality: " + this.doctor.getSpecialty());
        System.out.println("Appointment Patient: " + this.patient.getFullName());

    }
}
