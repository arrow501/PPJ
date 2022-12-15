package Extras.kolokwium2.evenMoreExamples;

public class ConcentricXO{
    public static void main(String[] args){
        int n = 6;
        char[][] concentricArray = new char[n][n];
        fillArray(concentricArray);
        for(char[] line : concentricArray){
            for(char c : line)
                System.out.print(c + " ");
            System.out.println();
        }
    }
    public static void fillArray(char[][] arr){
        fillArray(arr, 0, 'x');
    }
    public static void fillArray(char[][] arr, int layer, char symbol){
        if(layer > arr.length/2) return;

        int side = arr.length - 1;

        for(int i = layer; i < arr.length - layer; i++){
            // top edge
            arr[layer][i] = symbol;
            // bottom edge
            arr[side - layer][i] = symbol;
            // left edge
            arr[i][layer] = symbol;
            //rigth edge
            arr[i][side - layer] = symbol;
        }
        symbol = (symbol == 'x' ? 'o' : 'x');
        fillArray(arr, layer + 1, symbol);
    }
}
