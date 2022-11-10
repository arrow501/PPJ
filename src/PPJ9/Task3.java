package PPJ9;

public class Task3 {
    public static void main(String[] args) {
        byte number = 14; // range(0;15)
        if(number>15 || number < 0)
            throw new IllegalStateException("Unexpected value: " + number + "\n\rPlease input a value in range 0 - 15.");

        char hexNumber = (number <= 9)
            ? (char) (number + 48) // [0-9]
            : (char) (number + 55); // [A-F]
        System.out.println("hex: " + hexNumber);
    }
}
