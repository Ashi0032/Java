import java.util.*;
public class Homework{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int m= sc.nextInt();
		int n= sc.nextInt();
		int[][] numbers = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j =0;j<n;j++){
				numbers[i][j]=sc.nextInt();
			}
		}
		int[][]neew= new int[n][m];

		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				neew[j][i]=numbers[i][j];
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(neew[i][j]);
			}
		    System.out.println();
	    }
	}
}

	



