package Q2.Prog402a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prg402a.dat"));
            int[] first = new int[100];
            int[] second = new int[100];
            int cnt = 0;
            while (file.hasNext()) {
                first[cnt] = file.nextInt();
                second[cnt] = file.nextInt();
                cnt++;
            }
            int[] id = new int[cnt];
            int[] score = new int[cnt];
            for (int i = 0; i < cnt; i++) {
                id[i] = first[i];
                score[i] = second[i];
            }
            Cl402a fag = new Cl402a(id, score);
            fag.calc();
            fag.output(cnt);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
ID		Score			Difference
115		257			14.38
123		253			10.38
116		246			3.38
113		243			0.38
112		239			-3.62
104		239			-3.62
110		238			-4.62
218		243			0.38
208		242			-0.62
222		223			-19.62
223		230			-12.62
213		229			-13.62
207		228			-14.62
203		224			-18.62
305		265			22.38
306		262			19.38
311		256			13.38
325		246			3.38
321		245			2.38
323		245			2.38
301		242			-0.62
 */
