package PPJ16;

import Toolbox.Toolbox;

public class Task1 {
    public static void main(String[] args) {
        int [][] tab1 = Toolbox.getInt2DArr(4,4);
        int [][] tab2 = Toolbox.getInt2DArr(4,4);
        System.out.println(jestRowna(tab1, tab2));
    }
    public static boolean jestRowna(int[][] array1, int[][] array2){
        if(array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i].length != array2[i].length) return false;
            for (int j = 0; j < array1[i].length; j++) {
                if(array1[i][j] != array2[i][j]) return false;
            }
        }
        return true;
    }
}
