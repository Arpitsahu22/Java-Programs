public class ThrowandThrows {
    // 'throws' declares that this method might throw an exception [1, 7]
    public static void divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            // 'throw' is used to explicitly generate the exception [1, 7]
            throw new ArithmeticException("Cannot divide by zero"); // Exception object is created and thrown [1, 11]
        }
        System.out.println(numerator / denominator);
    }

    public static void main(String[] args) {
        try {
            divide(10, 0); // The caller is responsible for handling the declared exception [3, 14]
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}