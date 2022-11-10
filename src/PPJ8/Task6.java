package PPJ8;

public class Task6 {
    public static void main(String[] args) {
        for(int i = 1; i < 3; i++){
            int counter = 1;
            System.out.println("Do While counter is lesser than " + i + ", counter++ :");
            do {
                System.out.println("counter: " + counter);
                counter++;
            }while (counter < i);
            System.out.println("========== END ==========");
            counter = 1;
            System.out.println("While counter is lesser than " + i + ", counter++ :");
            while(counter < i){
                System.out.println("counter: " + counter);
                counter++;
            }
            System.out.println("========== END ==========");
        }
    }
}
