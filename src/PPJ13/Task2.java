package PPJ13;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] A, B, C;
        A = Task1.bubbleSort(Task1.getRandomArr(10, 0, 100));
        B = invert(Task1.bubbleSort(Task1.getRandomArr(11, 0, 100)));
        // System.out.println(Arrays.toString(B));
        // C = new int[A.length + B.length];
        // int currentA = 0, currentB = B.length - 1;
        // for (int i = 0; i < C.length; i++) {
        //     if (currentB == -1) C[i] = A[currentA++];
        //     else if (currentA == A.length - 1) C[i] = B[currentB];
        //     else if (A[currentA] <= B[currentB]) {
        //         C[i] = A[currentA++];
        //     } else {
        //         C[i] = B[currentB--];
        //     }
        // }
        C = zipSortedArrays(new int[][]{A,invert(B)});
        
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
        System.out.println("C: " + Arrays.toString(C));
    }

    public static int[] invert(int[] arr) {
        for (int i = 0; i < (arr.length / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
    public static int[] zipSortedArrays(int[][] arrays){
        return zipSortedArrays(arrays, true);
    }
    public static int[] zipSortedArrays(int[][] arrays, boolean validation){
        if(validation){
            // OPTIONAL: Checks if arrays are sorted
            for (int[] arr : arrays) {
                if(arr.length == 0) continue;
                int lastItem = arr[0];
                for (int item: arr) {
                    if(item < lastItem) throw new Error("Provided Arrays aren't sorted correctly");
                    lastItem = item;
                }
            }
        }
        
        int totalLength = 0;
        for (int[] arr: arrays){
            totalLength += arr.length;
        }
        int [] sortedZip = new int[totalLength];
        
        int[] currentIndexes = new int[arrays.length];
        for (int i = 0; i < currentIndexes.length; i++) {
            currentIndexes[i] = 0;
        }

        int firstArrInBounds = 0;
        for (int iZip = 0; iZip < sortedZip.length; iZip++) {
            while(currentIndexes[firstArrInBounds] >= arrays[firstArrInBounds].length){
                firstArrInBounds++;
            }
            int smallestIndex = firstArrInBounds; 
            // smallest value is arrays[smallestIndex] [currentIndexes[smallestIndex]]
            for (int i = 0; i < arrays.length; i++) {
                // finds the index of the arr in arrays which current value is smallest
                if(currentIndexes[i] >= arrays[i].length) continue; // check for out of bound currentIndex
                if(arrays[i][currentIndexes[i]] < arrays[smallestIndex][currentIndexes[smallestIndex]])
                    smallestIndex = i;
            }
            sortedZip[iZip] = arrays[smallestIndex][currentIndexes[smallestIndex]];
            currentIndexes[smallestIndex]++;
            
        }

        return sortedZip;
    }

}
