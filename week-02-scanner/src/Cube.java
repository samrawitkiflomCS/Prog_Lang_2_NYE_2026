import java.util.Scanner;
public class Cube {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length");
        float length = in.nextFloat();
        double surface_Area = 6 * length * length;
        double volume = length * length * length;
        System.out.println("surface area=" + surface_Area + "\nvolume=" + volume);
    }

}
