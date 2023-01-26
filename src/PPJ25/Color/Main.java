package PPJ25.Color;

public class Main {
    public static void main(String[] args) {
        int a = 155, r = 120, g = 230, b = 180;
        System.out.println("a,r,g,b = " + a + " " + r + " " + g  + " " + b);

        int color = packColor( a, r, g, b);
        a=r=g=b=0;

        System.out.println("color= " + color);
        int[] colors = unpackColor(color);
        a = colors[0];
        r = colors[1];
        g = colors[2];
        b = colors[3];
        System.out.println("a,r,g,b = " + a + " " + r + " " + g  + " " + b);

        
    }
    public static int packColor( int a, int r ,int g ,int b){
        int color = 0;
        int[] colors = new int[]{a,r,g,b};

        for (int i = 0; i < colors.length; i++) {
            if( colors[colors.length - 1 - i] > 255 || colors[colors.length - 1 - i] < 0) throw new RuntimeException("Color value out of bounds (0-255)");
            color |= colors[colors.length - 1 - i] << (8*i);
        }

        return color;
    }
    public static int[] unpackColor(int color){
        int[] colors = new int[4];

        int mask = 0x00_00_00_FF;
        // 0xFF = 0b1111_1111
        // 0x11 = 0b0001_0001

        for (int i = 0; i < colors.length; i++) {
            colors[colors.length - i - 1] = (color & (mask << 8*i)) >>> 8*i;
        }
        return colors;
    }

}