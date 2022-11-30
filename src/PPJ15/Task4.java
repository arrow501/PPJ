package PPJ15;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(findMax(621,21,37));
    }
    public static int findMax(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3) return num1;
        if(num2 > num3) return num2;
        return num3;
    }
}
