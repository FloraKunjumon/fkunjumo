
import java.util.*;
public class lab093 {
	public static void main (String[]args) {
		int rows;
		int columns;
		int i;
		int j;
		int randomelement;
	Scanner input=new Scanner (System.in);
	System.out.println("Enter the number of rows of the array ");
	rows=input.nextInt();
	System.out.println("Enter the number of columns of the array ");
	columns=input.nextInt();
	int [][]elements=new int[rows][columns];
	for (i=0;i<rows;i++)
		for (j=0;j<columns;j++){
			randomelement=(int)((Math.random()*10)+1);
			elements[i][j]=randomelement;
			System.out.print(elements[i][j]);
			
}
	System.out.println("The highest element in the array is " + getHighest(elements));

	System.out.println("The highest element in the array is " + getLowest(elements));

	System.out.println("The average of the array is " + getAverage(elements));

	System.out.println("The number of elements in the array above the average value is " + getAboveAverage(elements));

	System.out.println("The number of elements in the array below the average value is " + getBelowAverage(elements));
		
	}	
		
	
	
public static int getHighest(int[][]elements){
	Scanner input=new Scanner (System.in);
	int number=elements[0][0];
	int k;
	int l;
	int rows;
	int columns;
	System.out.println("Enter the number of rows of the array ");
	rows=input.nextInt();
	System.out.println("Enter the number of columns of the array ");
	columns=input.nextInt();
	for ( k=0;k<rows;k++){
		for ( l=0;l<columns;l++){
			if (number>elements[k][l]){
				
			}
				
			
			
			
		}
	
	}
	return number;
}

public static int getLowest(int[][]elements){
	Scanner input=new Scanner (System.in);
	int number=elements[0][0];
	int k;
	int l;
	int rows;
	int columns;
	System.out.println("Enter the number of rows of the array ");
	rows=input.nextInt();
	System.out.println("Enter the number of columns of the array ");
	columns=input.nextInt();
	for ( k=0;k<rows;k++){
		for ( l=0;l<columns;l++){
			if (number<elements[k][l]){
				
			}
				
			
			
			
		}
	
	}
	return number;
}
public static int getAboveAverage(int[][]elements){
	
	
	
	
}	
public static int getAverage(int[][]elements){	
	Scanner input=new Scanner (System.in);
	int number=0;
	int k;
	int l;
	int rows;
	int sum;
	sum=0;
	int average;
	int columns;
	System.out.println("Enter the number of rows of the array ");
	rows=input.nextInt();
	System.out.println("Enter the number of columns of the array ");
	columns=input.nextInt();
	for ( k=0;k<rows;k++){
		for ( l=0;l<columns;l++){
			
			sum=sum+elements[k][l];
				
			}
				
			
			
			
		
	
	}
	return (sum/(rows*columns));
}	

}
	
