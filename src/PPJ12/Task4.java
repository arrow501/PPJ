package PPJ12;

public class Task4 {
    static byte[] board;
    static boolean gameOver = false;
    static char player = 'X';
    static java.util.Scanner in = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Knots and Crosses!");
        newBoard();
        printBoard();
        System.out.print("X goes first! Enter slot number to put X there: ");
        while (!gameOver) {
            board[inputSlot()] = (byte) (player);
            printBoard();
            gameOver = isGameOver();
            if (gameOver) {
                if(player == 'd') //game drawn
                    System.out.println("Game is a Draw!");
                else
                    System.out.println("Player " + player + " has Won!");
                playAgain();
            } else {
                player = (player == 'X') ? 'O' : 'X';
                System.out.print(player + "'s turn. Enter slot number to put " + player + " there: ");
            }
        }
        in.close();
    }
    public static void newBoard() {
        board = new byte[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = (byte) (i + '1'); // range '1' - '9'
        }
    }
    private static int inputSlot() {
        try {
            int slot = in.nextInt();
            if (!(slot >= 1 && slot <= 9)) {
                System.out.println("Invalid input. Please enter a number between 1 and 9");
                return inputSlot();
            }
            slot--; // board starts at 0
            if (board[slot] != (char) (slot + '1')) {
                System.out.println("Slot is already taken. Please choose a different one.");
                return inputSlot();
            }
            return slot;
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number between 1 and 9");
            return inputSlot();
        }
    }
    private static boolean isGameOver() {
        if (board[4] != '5') {
            // check diagonals
            if (board[0] == board[4] && board[0] == board[8])
                return true;
            if (board[2] == board[4] && board[2] == board[6])
                return true;
        }
        for (int i = 0; i < 3; i++) {
            // check horizontals
            if (board[3 * i] == board[3 * i + 1] && board[3 * i] == board[3 * i + 2])
                return true;
            // check verticals
            if (board[i] == board[i + 3] && board[i] == board[i + 6])
                return true;
        }
        //check for draw
        boolean draw = true;
        for (int i = 0; i < board.length; i++) {
            if(board[i] == (byte)(i+'1')) draw = false;
        }
        if(draw){
            player = 'd';
            return true;
        }
        return false;
    }
    public static void printBoard() {
        byte i = 0;
        // prettier-ignore
        System.out.println(
            "\r\n" +
            " " + (char) board[i++] + " | " + (char) board[i++] + " | " + (char) board[i++] + "\r\n"
            + "-----------" + "\r\n" +
            " " + (char) board[i++] + " | " + (char) board[i++] + " | " + (char) board[i++] + "\r\n" +
            "-----------" + "\r\n" +
            " " + (char) board[i++] + " | " + (char) board[i++] + " | " + (char) board[i++] + "\r\n");
    }
    private static void playAgain() {
        System.out.println("Play again? (Y/N)");
        char input = in.next().charAt(0);
        if( input == 'Y' || input == 'Y'){
            newBoard();
            printBoard();
            player = 'X';
            System.out.println("As usual X goes first. Enter slot number to put X there: ");
        }
    }
}

