import java.util.*;
public class Sorting {
	public static int print(int x, int n){
		if(n==0){
			return 1;
		}
		if(x==0){
			return 0;
		}
		int xpowerm1= print(x, n-1);
		int xpower=x*xpowerm1;
		return xpower;

	}
	public static void main(String[] args){
		int x=5;
		int n=4;
		System.out.println(print(x, n));
	
    }
}



