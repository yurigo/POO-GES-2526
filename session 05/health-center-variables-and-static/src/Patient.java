public class Patient {

    private final String ESTO_ES_UNA_CONSTANTE = "NOMBRE";
    private String name;
    private String lastName;
    private int cardNumber;
    private boolean isSmoker;
    private double bloodPressure;
    private char sex; // 'F' Female 'M' Male

    // Constructor
    private Patient(String name, String lastName, int cardNumber) {
        this.name = name;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
    }

    public static Patient createNewPatient(String name, String lastName, int cardNumber) {
        return new Patient(name, lastName, cardNumber);
    }

    public String getName() {
        return name;
    }

    /*
        Per si volem mostrar info del pacient:

        public void showVisit() {
            System.out.println("Patient: " + this.name + " " + this.lastName);
            System.out.println("Card Number: " + this.cardNumber);
        }

    */

}
