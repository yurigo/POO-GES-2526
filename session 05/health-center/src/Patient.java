public class Patient {

    private final String name;
    private final String lastName;
    private final String cardNumber;


    // Constructor
    public Patient(String name, String lastName, String cardNumber) {
        this.name = name;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
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
