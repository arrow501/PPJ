package PPJ11;

public class Task3 {
    public static void main(String[] args) {
        //int[] tab1 = {1,2,3,4,5,6};
        int[] tab = {1,2,3,4,4,3,2,1};

        boolean sameBackwards = true;
        for (int i = 0; i < tab.length ; i++) {
            if(tab[i] != tab[tab.length - i - 1]) sameBackwards = false; 
        }
        System.out.println("sameBackwards = " + sameBackwards);
    }
}
