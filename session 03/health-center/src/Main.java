import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");


        Doctor d = new Doctor();

        d.setName("Alice");
        d.setLastName("Doe");
        d.setSpecialty("Cardiologist");
        d.setCollegiateNumber(12345);

        Patient p = new Patient();

        p.setName("John");
        p.setLastName("Garcia");
        p.setCardNumber("123434");

        Diagnosis diagnosis = new Diagnosis();
        diagnosis.setContent("Esta muy malito, voy a darle un ibuprofeno");


        Appointment a = new Appointment();

        a.setDate(new Date());
        a.setPatient(p);
        a.setDiagnosis(diagnosis);
        a.setDoctor(d);

        //System.out.println(a);

        a.ShowInfo();

        Doctor d2 = new Doctor();
        d2.setName("Bob");
        d2.setLastName("Doe");
        d2.setSpecialty("Gastrologist");
        d2.setCollegiateNumber(54236);

        Diagnosis diagnosis2 = new Diagnosis();
        diagnosis2.setContent("Tienes Gases");

        Appointment b = new Appointment();
        b.setDate(new Date());
        b.setPatient(p);
        b.setDoctor(d2);
        b.setDiagnosis(diagnosis2);

        b.ShowInfo();
    }
}