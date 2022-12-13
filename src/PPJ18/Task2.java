package PPJ18;

public class Task2 {
    public static void swap (int[]tab, int source, int destination){
        int temp = tab[destination];
        tab[destination] = tab[source];
        tab[source] = temp;
    }
}
