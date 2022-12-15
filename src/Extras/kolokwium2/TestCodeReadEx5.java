package Extras.kolokwium2;

public class TestCodeReadEx5 {
    public static void main(String[] args) {
        int[] tab = { 1, 2, 3 };
        int[] tabX = tab;
        tab[0] = 9; // 9,2,3
        tab[tab.length - 1] = 8; // 9,2,8
        tabX[0] = 7; // 7,2,8
        tabX[tab.length - 1] = 6; // 7,2,6
        int[][] tabY = { tab, tabX }; //{7,2,6}, {7,2,6}
        for (int[] ints : tabY) {
            for (int i = ints.length - 1; i >= 0; i--) {
                System.out.print(ints[i] + "\t");
            }
            System.out.println();
        }
    }
    // 6    2    7
    // 6    2    7
}
