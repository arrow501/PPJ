package PPJ14;

public class Task4 {
    public static void main(String[] args) {
        int[][] tab = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // 0,0 -> 0,1  -> 0,2 -> 0,3 -> 
        // 1,3  -> 2,3 -> 3,3 
        // 3,2 -> 3,1 -> 3,0 
        // 2,0 -> 1,0 ->
        // 1,1 -> 1,2 ->
        // 2,2 -> 
        // 2,1

        tab = getSequentialSquare(10);
        for (int[] subArr : tab) {
            for (int i : subArr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        printSpiral(tab);

    }
    public static void printSpiral(int[][] arr){
        for (int[] is : arr) {
            if(is.length != arr.length) throw new Error("Given array has to be square");
        }


        int x = 0, y = 0;
        int segmentLength = arr.length;

        // print first row
        for (int i = 0; i < segmentLength; i++) {
            x = i;
            System.out.print(arr[y][x] + "  ");
        }
        segmentLength--;
        while(segmentLength > 0){
            //print down
            for (int i = 0; i < segmentLength; i++) {
                y++;
                System.out.print(arr[y][x] + "  ");
            }
            // print left
            for (int i = 0; i < segmentLength; i++) {
                x--;
                System.out.print(arr[y][x] + "  ");
            }
            segmentLength--;
            //print up
            for (int i = 0; i < segmentLength; i++) {
                y--;
                System.out.print(arr[y][x] + "  ");
            }
            // print right
            for (int i = 0; i < segmentLength; i++) {
                x++;
                System.out.print(arr[y][x] + "  ");
            }
            segmentLength--;
        }
    }
    public static int[][] getSequentialSquare(int size){
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = i*size + j + 1;
            }
        }
        return arr;
    }
}
