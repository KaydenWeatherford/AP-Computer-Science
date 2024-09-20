package Q1;

import java.util.Scanner;
import java.lang.Math;

public class Prog72t {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the first time");
        int time1 = inp.nextInt();
        System.out.println("Enter second time:");
        int time2 = inp.nextInt();
        int fin, hours = 0, min, FirstHour, FirstMinute, SecondHour, SecondMinute;

        FirstHour = time1 / 100;
        FirstMinute = time1 % 100;
        SecondHour = time2 / 100;
        SecondMinute = time2 % 100;

        if (time1 < time2){

            hours = (SecondHour-FirstHour);
            if (FirstMinute > SecondMinute)
            {
                min = ((60 - FirstMinute) + SecondMinute);
                hours--;
                System.out.println( hours + " hours " + min + " minutes ");
            }
            else{
                min = (SecondMinute - FirstMinute);
                System.out.println( hours + " hours " + min + " minutes ");
            }

        }
        else if (time1 == time2){
            System.out.println("The difference is 0 hours and 0 minutes.");
        }

        else { // (Time1 > Time2)

            hours = ((24 - FirstHour)+SecondHour);
            if (FirstMinute > SecondMinute)
            {
                min = ((60 - FirstMinute) + SecondMinute);
                hours--;
                System.out.println( hours + " hours " + min + " minutes ");
            }
            else{
                min = (SecondMinute - FirstMinute);
                System.out.println( hours + " hours " + min + " minutes ");
            }
        }

    }
}
