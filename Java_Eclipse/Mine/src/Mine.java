import java.io.Console;
import java.util.Random;

public class Mine{
    public  static void main(String[] args){
        Console console = System.console();
        Random rm = new Random();

        int[][] x = new int[5][5];
        int input = Integer.parseInt(console.readLine());



            int Bom = rm.nextInt(100);
            int bom =0;
            if(Bom >= 70 && Bom <= 80){
                bom = 1;
            }
            int i = rm.nextInt(6);
            int j = rm.nextInt(6);
            System.out.print(x[i] + "\t");
        }
    }
}