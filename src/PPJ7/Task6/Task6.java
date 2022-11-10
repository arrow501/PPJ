package PPJ7.Task6;

public class Task6 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();
        
        if(month == 2)
            if((year%4==0 && year%100!=0)|| year%400==0)
                System.out.println("29 days");
            else
                System.out.println("28 days");
        else if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12)
        {
            System.out.println("31 days");
        }
        else if (month>=1 & month <=12){
            System.out.println("30 days");
        }
    }


}
