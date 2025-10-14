public class User {
    private String username;
    private String name;
    private String lastName;
    private String email;

//    public User(){
//        this.username = "";
//        this.name = "";
//        this.lastName = "";
//        this.email = "";
//    }

    public User(String username, String name, String lastName, String email) {
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
