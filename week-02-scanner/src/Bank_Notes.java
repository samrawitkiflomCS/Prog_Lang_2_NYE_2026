import java.util.Scanner;

public class Bank_Notes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the amount of money");
        int amount= in.nextInt();
       for(int i=0; amount-5000>=0; i++){
           int notes= amount/5000;
           amount=amount-notes*5000;
      i++;
      if(amount-5000<0){
          System.out.println("number of 5000 notes:"+notes);
      }


        }
       for(int i=0; amount-1000>=0; i++){
            int notes= amount/1000;
            amount=amount-notes*1000;
            i++;
            if(amount-1000<0){
                System.out.println("number of 1000 notes:"+notes);
            }


        }

        for(int i=0; amount-500>=0; i++){
            int notes= amount/500;
            amount=amount-notes*500;
            i++;
            if(amount-500<0){
                System.out.println("number of 500 notes:"+notes);
            }


        }

        for(int i=0; amount-100>=0; i++){
            int notes= amount/100;
            amount=amount-notes*100;
            i++;
            if(amount-100<0){
                System.out.println("number of 100 notes:"+notes);
            }


        }
        for(int i=0; amount-50>=0; i++){
            int notes= amount/50;
            amount=amount-notes*50;
            i++;
            if(amount-50<0){
                System.out.println("number of 50 notes:"+notes);
            }


        }

        for(int i=0; amount-10>=0; i++){
            int notes= amount/10;
            amount=amount-notes*10;
            i++;
            if(amount-10<0){
                System.out.println("number of 10 notes:"+notes);
            }


        }
       if(amount!=0)
           System.out.println("number of 1 notes:"+amount);

    }
}
