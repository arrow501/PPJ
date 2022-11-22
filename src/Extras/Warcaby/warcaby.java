package Extras.Warcaby;

public class warcaby {
    public static void main(String[] args) {
        long pawns = 0;
        pawns = newPawn((byte) 2,(byte)5,true,false,true);
        String binaryString = Long.toBinaryString(pawns);
        String withLeadingZeros = String.format("%64s", binaryString).replace(' ', '0');

        System.out.println(withLeadingZeros);
    }
    public static long newPawn(byte posX, byte posY, boolean color, boolean type, boolean alive){
        long pawn = 0;
        if(!(posX>=0 && posX<9)) throw new Error();
        pawn = (pawn | (long) posX);

        if(!(posY>=0 && posY<9)) throw new Error();
        pawn = (long) (pawn | ((long) posY << 3));

        pawn = (pawn | (color?1l:0l << 6));
        // pawn = (pawn | (type?1l:0l << 7));
        //pawn = alive?(pawn | (1l << 7)):pawn;
        return pawn;
    }
}
