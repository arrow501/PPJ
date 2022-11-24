package PPJ13;

public class Task6 {
    public static void main(String[] args) {
        int[][] tab = new int[3][];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Task1.getRandomArr(randInt(50), 0, 100);
        }
        print2d(tab);
    }
    public static int randInt(int max_val){
        return (int)(Math.random() * (max_val + 1));
    }
    public static void print2d(int[][] arr2d){
        for (int[] arr : arr2d) {
            for (int number : arr) {
                System.out.print(number + ", ");
            }
        }
    }
}
