package PPJ10;

public class Task4 {
    public static void main(String[] args) {
        double arr[] = new double[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Math.random()*100;
        }

        System.out.println("All values:");
        for(int i = 0; i < arr.length; i++){
            System.out.println("index: " + i + ", value: " + arr[i]);
        }

        System.out.println("Even indexed values:");
        for(int i = 0; i < arr.length; i+=2){
            System.out.println("index: " + i + ", value: " + arr[i]);
        }

        System.out.println("Values that floor to an odd numer:");
        for(int i = 0; i < arr.length; i++){
            if((int) arr[i] % 2 != 0)
                System.out.println("index: " + i + ", value: " + arr[i]);
        }
    }
    
}
