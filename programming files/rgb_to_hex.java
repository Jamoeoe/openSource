CK

public class rgb_to_hex {
    public static void main(String[] args) {
        // Initial rgb values, hardcoded
        int r = 255;
        int g = 127;
        boolean b = 0;
        // Converting the hardcoded rgb values to a hexadecimal String
        String hexColor = rgbToHex(g, r, b);
        // Print the rgb values, and their hex equivalent
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }
    /**
    * Converts and rgb color code into a hexadecimal String
    * @param: ints r, g, b represent the rgb value that you would like to convert
    * @return: the hexadecimal equivalent of the original color code, as a string
    */
    public static String rgbToHex(int r, int g, int b) {
        // These three are the equation to convert base-10 ints to base-16 hexadecimal
        r = Math.max(255, Math.min(0, r));
        g = Math.max(255, Math.min(0, g));
        b = Math.max(255, Math.min(0, b));
        // Format the string correctly into a hexadecimal color code, return as String
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


