public class L7Constructor {
    int id;
    String name;
    // Default Constructor
    public L7Constructor() {
        id = 0;
        name = "Default Name";
    }
    // Parameterized Constructor with one parameter
    public L7Constructor(int id) {
        this.id = id;
        this.name = "Unknown";
    }
    // Parameterized Constructor with two parameters
    public L7Constructor(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
    public static void main(String[] args) {
        // Using Default Constructor
        L7Constructor obj1 = new L7Constructor();
        obj1.display(); // Output: ID: 0, Name: Default Name
        // Using Constructor with one parameter
        L7Constructor obj2 = new L7Constructor(101);
        obj2.display(); // Output: ID: 101, Name: Unknown
        // Using Constructor with two parameters
        L7Constructor obj3 = new L7Constructor(102, "Sameer");
        obj3.display(); // Output: ID: 102, Name: Sameer
    }
}
