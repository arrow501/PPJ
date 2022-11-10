package PPJ10;

public class Task6 {
    public static void main(String[] args) {
        char[] arr = new char[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (Math.random()*26 + 65);
        }

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char c; // user input
        int count;
        boolean allZeros;
        do{
            c = scanner.next().charAt(0);
            
            count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == c){
                    count++;
                    arr[i] = 0;
                }
            }
            System.out.println("Found '" + c + "' " + count + (count==1?" time.":" times.") );
            allZeros = true;
            for (char element : arr) {
                if(element != 0){
                    allZeros = false;
                }
            }
        }while(!allZeros);
        scanner.close();
    }
}
