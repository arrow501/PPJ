package PPJ10;

public class Task6 {
    public static void main(String[] args) {
        char[] arr = new char[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (Math.random()*26 + 65); // char value in [A - Z]
        }

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char user_input; // user input
        int count;
        boolean allZeros;
        do{
            System.out.print("Input a capital letter:");
            user_input = scanner.next().charAt(0);
            
            // checks how many times given letter appears in the array and replaces each occurance with 0
            count = 0; // count of given letter
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == user_input){
                    count++;
                    arr[i] = 0;
                }
            }
            System.out.println("Found '" + user_input + "' " + count + (count==1?" time.":" times.") );
            
            // Checks if array contains non-zero values
            // if it does -> allZeros = false
            allZeros = true;
            for (char element : arr) {
                if(element != 0){
                    allZeros = false;
                }
            }
        }while(!allZeros); // runs while array contains non-zero values
        scanner.close();
    }
}
