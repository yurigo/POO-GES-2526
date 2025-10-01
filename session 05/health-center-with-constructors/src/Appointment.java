import java.util.Date;

public class Appointment {
    private static int numAppointments;
    private final int id;
    private final Date date;
    private final Doctor doctor;
    private final Diagnosis diagnosis;
    private final Patient patient;

    // Constructor
    public Appointment(Date date, Doctor doctor, Patient patient, Diagnosis diagnosis) {
        this.date = date;
        this.doctor = doctor;
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.numAppointments++;
        this.id = numAppointments;
    }

    public static int getNumAppointments() {
        return numAppointments;
    }


    public void showInfo() {
        System.out.println("Appointment id: " + this.id);
        System.out.println("Appointment Date: " + this.date);
        System.out.println("Appointment Doctor: " + this.doctor.getName());
        System.out.println("Appointment Speciality: " + this.doctor.getSpecialty());
        System.out.println("Appointment Patient: " + this.patient.getName());

    }
}

