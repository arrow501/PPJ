package PPJ17;
import Toolbox.Toolbox;

public class Task5 {
    public static void main(String[] args) {
        int[][] tab = new int[9][9];
        fillArrayLayersInward(tab, 0, 1);
        Toolbox.showArr(tab);

    }
    public static void fillArrayLayersInward(int[][] arr, int layer, int startNumber){
        if(layer > arr.length/2) return;
        int side = arr.length;
        for (int i = layer; i < side - layer; i++) {
            // top row
            arr[layer][i] = layer + startNumber;
            // bottom row
            arr[side - 1 - layer][i] = layer + startNumber;
            // left column
            arr[i][layer] = layer + startNumber;
            // right column
            arr[i][side - 1 - layer] = layer + startNumber;
        }
        fillArrayLayersInward(arr, layer + 1, startNumber);
    }
}
