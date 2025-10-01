import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Doctor dempty1 = new Doctor();
        Doctor dempty2 = new Doctor(null,null,null,0);

        Date now = new Date();
        Doctor doc = new Doctor("Alice", "Doe", "Cardiologist", 12345);
        // Patient p = new Patient("John", "Doe", "123456722CDF");

        // using a factory method
        Patient p = Patient.createNewPatient("John", "Doe", 123456722);

        Diagnosis diagnosis = new Diagnosis("Está muy malito, voy a darle un ibuprofeno");

        Appointment a = new Appointment(now, doc, p, diagnosis);
        Appointment b = new Appointment(now, doc, p, diagnosis);
        Appointment c = new Appointment(now, doc, p, diagnosis);
        Appointment d = new Appointment(now, doc, p, diagnosis);
        Appointment e = new Appointment(now, doc, p, diagnosis);

        System.out.println("Num appointments: " + Appointment.getNumAppointments());

//        Appointment a = new Appointment(new Date(),
//                new  Doctor("Alice", "Doe", "Cardiologist", 12345),
//                new Patient("John", "Doe", "123456722CDF"),
//                new Diagnosis("Está muy malito, voy a darle un ibuprofeno")
//        );

        a.showInfo();
        b.showInfo();
        c.showInfo();
        d.showInfo();
        e.showInfo();
    }
}

