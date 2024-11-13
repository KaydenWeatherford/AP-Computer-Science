package Q2.Cl213fArray;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class prog213fArray {
    public static void main(String[] args) {
        try{
            Scanner file = new Scanner(new File("langdat/prog213f.dat"));

            Cl213f[] list = new Cl213f[1000];
            int cnt = 0;

            while(file.hasNext()){
                int kwh = file.nextInt();

                if (kwh != -999) {
                    Cl213f yikes = new Cl213f(kwh);
                    list[cnt] = yikes;
                    cnt++;
                }
            }

            for (int i = 0; i < cnt; i++){
                list[i].calc();
                System.out.println(list[i]);

            }

        } catch (IOException e){
            System.out.println("Error: " + e);
        }
    }
}
