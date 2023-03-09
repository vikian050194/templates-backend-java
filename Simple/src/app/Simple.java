package app;

class Simple {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        // Using Console to input data from user
        String name = System.console().readLine();

        System.out.println("You entered string " + name);
    }
}
