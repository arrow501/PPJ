package PPJ9;

public class Task4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        for(int i = 1; i <= n; i++){
            System.out.println(i*i + "\t" + i*i*i + "\t" + i*i*i*i );
        }
    }
    
}
