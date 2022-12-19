package Extras.kolokwium2;

public class TestCodeReadEx2 {
    public static void main(String[] args) {
        String result = rec(12, 8);
        System.out.println();
        System.out.println(result);
    }

    public static String rec(int in, int i) {
        if (in == i)
            return "";
        System.out.print(i + " ");
        String result = in + " " + rec(in, i + 2);
        System.out.print(i + " ");
        return result;
    }
    // 8 10 10 8 
    // 12 12
}