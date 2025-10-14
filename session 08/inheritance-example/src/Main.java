public class Main {
    public static void main(String[] args) {
        User u = new User("alice", "Alice", "Doe", "alice@contoso.com");
        Doctor d = new Doctor("bob", "Bob", "Doe", "bob@contoso.com", "12345678890");
        Patient p = new Patient("charlie", "Charlie", "Doe", "charlie@contoso.com", 4473285);
        Admin a = new Admin("dave", "Dave", "Doe", "dave@contoso.com", "superUser");


        showName(u);
        showName(d);
        showName(p);
        showName(a);

        showRol(a);
        showRol(d);

    }

    public static void showName(User u){
        System.out.println("Name: " + u.getName() + " " + u.getLastName());
    }

    public static void showRol(Admin a){
        System.out.println("Rol: " + a.getRol());
    }

}