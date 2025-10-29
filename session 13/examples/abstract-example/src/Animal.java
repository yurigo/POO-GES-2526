abstract public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Animal name: " + name);
        System.out.println("Animal age: " + age);
    }

    abstract public void talk();
}
