public class math10 {

    public static void main(String[] args) {
        // 1. Absolute value
        double number = -15.67;
        double absoluteValue = Math.abs(number);
        System.out.println("1. Absolute Value: " + absoluteValue);

        // 2. Square root
        double squareRoot = Math.sqrt(25);
        System.out.println("2. Square Root: " + squareRoot);

        // 3. Power
        double powerResult = Math.pow(2, 3);
        System.out.println("3. Power: " + powerResult);

        // 4. Ceiling
        double ceilValue = Math.ceil(7.45);
        System.out.println("4. Ceiling: " + ceilValue);

        // 5. Floor
        double floorValue = Math.floor(7.45);
        System.out.println("5. Floor: " + floorValue);

        // 6. Maximum
        int maxResult = Math.max(10, 20);
        System.out.println("6. Maximum: " + maxResult);

        // 7. Minimum
        int minResult = Math.min(10, 20);
        System.out.println("7. Minimum: " + minResult);

        // 8. Round
        long roundValue = Math.round(15.67);
        System.out.println("8. Round: " + roundValue);

        // 9. Trigonometric functions (sine)
        double sineValue = Math.sin(Math.PI / 2);
        System.out.println("9. Sine: " + sineValue);

        // 10. Random number between 0.0 (inclusive) and 1.0 (exclusive)
        double randomValue = Math.random();
        System.out.println("10. Random: " + randomValue);
    }
}

