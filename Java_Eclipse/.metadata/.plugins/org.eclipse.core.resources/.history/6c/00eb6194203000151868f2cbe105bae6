import java.io.*;
import java.util.Random;

public class Mine{
    public  static void main(String[] args){
        Console console = System.console();
        Random rm = new Random();

        int[] x = new int[82];
        int input = Integer.parseInt(console.readLine());


        for(int i = 1 ; i < 82 ; i++) {
            int Bom = rm.nextInt(100);
            int bom =0;
            if(Bom >= 70 && Bom <= 100){
                bom = 1;
            }
            x[i] = rm.nextInt(2);
            System.out.print(x[i] + "\t");
            if(i % 9 == 0){
                System.out.println();
            }
        }
    }
}