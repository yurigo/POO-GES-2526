public class Patient {
    private String name;
    private String lastName;
    private String cardNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void showVisit(){

    }

    public String getFullName() {
        return this.name + " " + this.lastName;
    }

}
