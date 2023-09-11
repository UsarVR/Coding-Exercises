public class StringToInterger {
    public static void main(String[] args) {
        System.out.println("Program to convert String value to integer and integer value to String in Java.");
        String value = "123";
        int convertedValue = Integer.parseInt(value);
        System.out.println(convertedValue);
        int number = 456;
        String convertedNumber = String.valueOf(number);
        System.out.println(convertedNumber);
    }
}
