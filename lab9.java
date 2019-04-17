
import java.util.Scanner;
public class lab9 {
	public static void main (String args[]){
		int i;
		int j;
		int rows=4;
		int columns=5;
		int[][] elements = new int[4][5];
		for (i=0;i<4;i++){
			for (j=0;j<5;j++){
				elements[i][j]=(int)(Math.random()*10)+1;
				System.out.println("The element in row "+i+"the elements in column "+j+"is "+ elements[i][j]);
				
			}
			
			
			
		}
		
		
		
	}

}
