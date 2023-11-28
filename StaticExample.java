public class StaticExample {

    // Static variable shared among all instances of the class
    static int staticVariable = 0;

    // Static method that increments the static variable
    static void incrementStaticVariable() {
        staticVariable++;
    }

    public static void main(String[] args) {
        // Create instances of the class
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        // Call the static method using the class name
        StaticExample.incrementStaticVariable();

        // Access the static variable using the class name or an instance
        System.out.println("Static Variable: " + StaticExample.staticVariable);
        System.out.println("Static Variable from obj1: " + obj1.staticVariable);
        System.out.println("Static Variable from obj2: " + obj2.staticVariable);

        // Calling the static method again
        StaticExample.incrementStaticVariable();

        // Updated static variable value
        System.out.println("Updated Static Variable: " + StaticExample.staticVariable);
    }
}
