package PPJ14;

public class Task3 {
    public static void main(String[] args) {
        int size = 4;
        //int[][] arr = Task4.getSequentialSquare(size);
        int failures = 0;
        do{
            int x = (int)(Math.random()*(1.2 + 0.2) - (0.2)) * size;
            int y = (int)(Math.random()*(1.2 + 0.2) - (0.2)) * size;
            if(x<0||x>(size - 1)||y<0||y>(size - 1)){
                System.out.println("coordinates outside array range("+x+","+y+");");
                failures++;
            }
        }while(failures < 20);
    }
}
