package Extras.kolokwium2.evenMoreExamples;

public class ArrayShiftAnimation {
    public static void main(String[] args) {
        /*
        int[][] tab = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        */
        int[][] tab = {
            {1,6,4},
            {3,2,8},
            {5,2,9}
        };

        animateDiagonal(tab, 3);
    }
    public static void animateDiagonal(int[][] arr, int frames){
        print(arr);
        for(int i = 0; i < frames - 1; i++){
            shiftDown(arr);
            shiftRight(arr);
            print(arr);
        }
    }
    public static void animateVertical(int[][] arr, int frames){
        print(arr);
        for(int i = 0; i < frames - 1; i++){
            shiftDown(arr);
            print(arr);
        }
    }
    public static void animateHorizontal(int[][] arr, int frames){
        print(arr);
        for(int i = 0; i < frames - 1; i++){
            shiftRight(arr);
            print(arr);
        }
    }
    public static void shiftDown(int[][] arr){
        int lastIndex = arr.length - 1;
        int[] temp = arr[lastIndex];
        for(int i = lastIndex; i > 0 ; i--){
            arr[i] = arr[i-1];    
        }
        arr[0] = temp;
    }
    public static void shiftRight(int[][] arr){
        for(int[] line : arr){
            int lastIndex = line.length - 1;

            int temp = line[lastIndex];
            for(int i = lastIndex; i > 0; i--){
                line[i] = line[i -1];
            }
            line[0] = temp;
        }
    }
    public static void print(int[][] arr){
        for(int[] line : arr){
            for(int i = 0; i < line.length; i++){
                if(i < line.length - 1)
                    System.out.print(line[i] + ", ");
                else
                    System.out.println(line[i]);       
            }
        }
        System.out.println();
    }

}
