import java.util.Scanner;23.
public class Calorie_Consumption{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        float total_Consumption=0f;
        for(int i=0; i<7;i++){
            switch(i){
                case 0:
                    System.out.println("enter the amount of calories expended on monday");
                    break;
                case 1:
                    System.out.println("enter the amount of calories expended on tuesday");
                    break;
                case 2:
                    System.out.println("enter the amount of calories expended on wednesday");
                    break;
                case 3:
                    System.out.println("enter the amount of calories expended on thursday");
                    break;
                case 4:
                    System.out.println("enter the amount of calories expended on friday");
                    break;
                case 5:
                    System.out.println("enter the amount of calories expended on saturday");
                    break;
                case 6:
                    System.out.println("enter the amount of calories expended on sunday");
                    break;

            }
            float daily_Consumption= in.nextFloat();
            total_Consumption+=daily_Consumption;
        }
        float average;
        average= total_Consumption/7;
        System.out.println("the weekly total calorie consumption is:"+ total_Consumption +"\n the average weekly calorie consumption is:"+ average);
    }

}


