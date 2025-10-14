public class calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }    
    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }
    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;   
    }
    // Method to divide two numbers
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }// End of divide method

public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.subtract(5, 3));
        System.out.println("Multiplication: " + calc.multiply(5, 3));
        System.out.println("Division: " + calc.divide(5, 1)); // This will throw an exception
    }// End of main method
}
// End of calculator.java


