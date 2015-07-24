import java.io.Console;
import java.util.Random;

public class Mine{
    public  static void main(String[] args){
        Console console = System.console();
        Random ran = new Random();
        while(true){
	        System.out.println("[Enter]で実行");
	        int[][] mine = new int[5][5];
	        int a = Integer.parseInt(console.readLine());
	        int bom = 0;

	        for(int bb = 0 ; bb < 25 ; bb++){
		        int b = ran.nextInt(100);
		        if(b >= 0 && b < 20){
		        	bom = 1;
		        }
		        for(int i = 0 ; i < 5 ; i++){
		        	for(int j = 0 ; j < 5 ; j++){
		        		mine[i][j] = bom;
		        	}
		        }
	        }

        }
    }

}