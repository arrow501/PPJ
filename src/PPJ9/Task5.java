package PPJ9;

public class Task5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();

        for(int i = -size; i <= size; i++ ){
            String temp = "";
            for(int j = -size; j <= size; j++ ){
                if(Math.abs(i) + Math.abs(j) <= size){
                    temp +="*";
                } else{
                    temp +=".";
                }
            }
            System.out.println(temp);
        }
    }
}

