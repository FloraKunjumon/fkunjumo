

import java.util.Scanner;
public class lab092 {
	public static void main (String []args){
		Scanner input=new Scanner (System.in);
		int i;
		int j;
		System.out.println("How many rows do u want");
		int rows;
		int columns;
		rows=input.nextInt();
		System.out.println("How many columns do u want");
		columns=input.nextInt();
		for (i=0;i<rows;i++)
			for (j=0;j<columns;j++){
				
				System.out.print((i+1)*(j+1)+ " " );
				
	}

}
}