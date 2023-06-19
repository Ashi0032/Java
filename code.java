/*

BUBBLE SORT--------
import java.util.*;
class Sorting {
	public static void print(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args){
	   int arr[]={7,8,1,3,2};
	   for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-i-1;j++){
			if(arr[j]>arr[j+1]){
				int temp=arr[j];      //swap
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
       
	}
    print(arr);
}
}


SELECTION SORT---------
import java.util.*;
class Sorting {
	public static void print(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args){
	   int arr[]={7,8,1,3,2};
	   for(int i=0;i<arr.length-1;i++){
		int min=i;
           for(int j=i+1;j<arr.length;j++){
			
			if(arr[j]<arr[min]){
				min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;

		   }
        }
	   print(arr);
}
}

INSERTION SORT--------

import java.util.*;
class Sorting {
	public static void print(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args){
	   int arr[]={7,8,1,3,2};
	   for(int i=0;i<arr.length;i++){
		int current= arr[i];
		int j=i-1;
		while(j>=0 && current<arr[j]){
			arr[j+1]=arr[j];
		    j--;
		}
		arr[j+1]=current;
    }
	   
	print(arr);
}
}

Recursion ----
the function calls itself many times till the time the base case is reached
the functions are stacked in form of stack and the main function is at the most bottom 
firslty the function is called then it check as the base case after the base case is achieved then the function return to the lower layers

sum of n numbers----

import java.util.*;
public class Sorting {
	public static void psum(int i ,int n ,int sum){
		if(i==n){
			sum += i;
			System.out.println(sum);
			return;
		}
        sum += i;
		psum(i+1 , n, sum);
	}
	public static void main(String[] args){
    psum(1 , 5 , 0);
	}
}

Fiboo sequence-----

import java.util.*;
public class Sorting {
	public static void fico(int a,int b, int n){
	if(n==0){
		return;
	}
	int c =a+b;
	System.out.println(c);
	fico(b, c, n-1);
	} 
	public static void main(String[] args){
	int a=0,b=1;
	int n=7;
	System.out.println(a);
	System.out.println(b);
    fico(a, b, n-2);
    }
}


x^n print------

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
















 */