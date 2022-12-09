package PPJ16;

public class Task4 {
    public static void main(String[] args) {
        int [][] positions = calculateSquares(35, 30, 10);
        for( int[] coords: positions){
            System.out.println("x: " + coords[0] + "\ty: " + coords[1]);
        }
    }
    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side) {
        int x_squares = 0, y_squares = 0;
        while (screenWidth >= side){
            // counts how many squares fit horizontally
            x_squares++;
            screenWidth-= side;
        }
        while (screenHeight >= side){
            // counts how many squares fit vertically
            y_squares++;
            screenHeight-= side;
        }
        int [][] topLeftCoordinatesOfSquares = new int[x_squares*y_squares][2];
        int currentSquareIndex = 0;
        for (int i = 0; i < x_squares; i++) {
            for (int j = 0; j < y_squares; j++) {
                topLeftCoordinatesOfSquares[currentSquareIndex][0] = i*side; // x
                topLeftCoordinatesOfSquares[currentSquareIndex][1] = side + j*side; // y
                currentSquareIndex++;
            }
        }
        return topLeftCoordinatesOfSquares;
    }
}
