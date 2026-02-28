import java.util.Scanner;
class Gallons{
    public static void main(String args[]){
        Scanner convert= new Scanner(System.in);
        System.out.println("enter the amount in gallons");
        float gallon= convert.nextFloat();
        float gallon_To_Liters= gallon*3.78541f;
        System.out.println("amount in liters= "+ gallon_To_Liters );


    }


}