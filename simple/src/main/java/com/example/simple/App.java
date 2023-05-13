package com.example.simple;

class App {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        // Using Console to input data from user
        String name = System.console().readLine();

        System.out.println("You entered string " + name);
        
        var calc = new Calculator();
        System.out.println(calc.add(40, 2));
    }
}
