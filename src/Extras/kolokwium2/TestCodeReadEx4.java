package Extras.kolokwium2;

import javax.swing.UIDefaults.ProxyLazyValue;

public class TestCodeReadEx4 {
    public static void main(String[] args) {
        method(5);
        System.out.println();
        nonrecursive();
    }
    public static void method(int n) {
        if (n <= 0){
            System.out.print(n + "\t");
        }
        else {
            method(--n);
            System.out.print(n + "\t");
        }
    }
    public static void nonrecursive(){

        System.out.print(0 + " ");
        System.out.print(0 + " ");
        System.out.print(1 + " ");
        System.out.print(2 + " ");
        System.out.print(3 + " ");
        System.out.print(4 + " ");
    }
    // method(5), method(4), method(3), method(2), method(1), method(0)
    // 0    0   1   2   3   4
}
