/*  Sum of two numbers//
import java.util.*;

class Main{
       public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
              int a= sc.nextInt();
              int b= sc.nextInt();
              int sum=a+b;
              System.out.println(sum);
              
       }

}


we are adult or not


import java.util.*;
class main {
       public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int age=sc.nextInt();

            if(age>18){
              System.out.println("adult");

            }
            else{
              System.out.println("Not adult");
            }
              
       }
}


chechking a number is equal or not

import java.util.*;

class main{
       public static void main(String[] args) {
              Scanner sc=new Scanner (System.in);
              int x= sc.nextInt();
              int y= sc.nextInt();

              if(x==y){
                     System.out.println("Equal");
              }
              
              else{
                     System.out.println("not equal");
              }
              
       }
}

writing hello world 100 times
import java.util.*;
class main{
       public static void main(String[] arg) {
        for(int counter=0;counter<100;counter=counter+1){
              System.out.println("hello world");
        }      
       }
}

writing the number from 0 to 10

import java.util.*;
class main{
       public static void main(String[] args) 
       {
         for(int i=0;i<=10;i++){
              System.out.println(i);
         }     
       }
}

import java.util.*;
class main{
       public static void main(String[] args) 
       {
              int i=0;
              while(i<11){
                     System.out.println(i);
                     i++;
              }
       }
}

import java.util.*;
class main{
       public static void main(String[] args) 
       {
              Scanner sc= new Scanner(System.in);
              int x= sc.nextInt();


       }
}

SOLID RECTANGLE---

import java.util.*;
class main {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
        }
}

HOLLOW RECTANGLE----
import java.util.*;
class main {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(i==1 || j==1 || i==n ||j==m){System.out.println("*");}
			
			 else {System.out.print(" ");}
			System.out.println("");
			}
		}
    }
}

Half pyramid ----
import java.util.*;
class main {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				{System.out.print("*");}
			
			 
			}
			System.out.println(" ");
		}
    }
}

INVERTED HALF PYRAMID----
import java.util.*;
class main {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				{System.out.print("*");}
			
			 
			}
			System.out.println(" ");
		}
    }
}
OR WE CAN INVERT THE OUTER LOOP 


WRITING THE NUMBER IN PYRAMID FORM---

import java.util.*;
class main {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=4;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
				

			}
			
			System.out.println(" ");
		}	
			 

		
	}
}

INVERTED NUMBER PYRAMID ---
import java.util.*;
class main {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=4;
	    
		for( int i=0;i<=n-1;i++){
			for(int j=1;j<=n-i;j++) {
				System.out.print(j);
				

			}
			System.out.println();
		}
		
		
	}
}
---------------------------------------
import java.util.*;
class main {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=4;
		int k=1;
		for(int i=1;i<=n;i++){
			


			for(int j=1;j<=i;j++){
				
				System.out.print(k);
				k++;
			}
			System.out.println();


		}
	    
	
		
		
	}
}
-------------------------------------------------
import java.util.*;
class main {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if((i+j)%2==0){
				    System.out.print("1");
				}else{
					System.out.print("0");
				}
			}

			
			
			System.out.println();
		}
		}
}
------------------------------------------------
BUTTERFLY PROBLEM--
import java.util.*;
class main {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=4;
	    for(int i=1; i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
 
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		 }
		 for(int i=n; i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}	
		
}
----------------------------------------------
PALINTROME PYRAMID--
import java.util.*;
class main {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=5;
		for(int i=1; i<=n; i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
	        for(int j=i;j>=1;j--){
		        System.out.print(j);
			}
			for(int j=2;j<=i;j++){
				System.out.print(j);
			}
		     System.out.println();
}	
}
}

===============================================
import java.util.*;
class main {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=4;
		for(int i=1; i<=n; i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
			    System.out.print("&");
			}
			System.out.println();
    }	
}
}

FUNCTIONS---
import java.util.*;

public class Homework {
	public static void printMyName(String name){
		System.out.println(name);
		return;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String name=sc.next();
		printMyName(name);

}
}


import java.util.*;
public class Homework{
    public static int Sum (int a,int b){
		int sum=a+b;
		return sum;

    }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		System.out.println(Sum(a,b)); 
	}

}

Factorial Question----
import java.util.*;
public class Homework{
    public static int factorial(int n){
		int f=1;
		for(int i=1;i<=n;i++){
			f=i*f;
			
		}
		return f;

	}
    

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		
		System.out.println(factorial(a)); 
	}

}

import java.util.*;
public class Homework{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int f=0;
		int s=1;
		int t;
		if(a==1){
			System.out.print("0");
        }else if(a==2){
			System.out.print("01");
		}else{
			System.out.print("0 1 ");
		    for(int i=1; i<=a-2; i++){
			t=f+s;
			System.out.print(t+" ");
			f=s;
			s=t;
		}
	}
	}
}

ARRAYS-----

import java.util.*;
public class Homework{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] marks= new int[3];
		marks[0]=37;
		marks[1]=27;
		marks[2]=47;
		System.out.print(marks[0]);
	}
}

import java.util.*;
public class Homework{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] numbers= new int[size];
		for(int i=0;i<size;i++){
			numbers[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
           System.out.println(numbers[i]);
		}
		
	}
}
LINEAR SEARCH----
	
import java.util.*;
public class Homework{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] list=new int [n];
		for(int i=0;i<n;i++){
            list[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		for(int i=0;i<n;i++){
			if(t==list[i]){
				System.out.println(i);
				break;
			}
		}
	}
}


2D ARRAYS----

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
        for(int i=0;i<m;i++){
			for(int j =0;j<n;j++){
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}
}

searching in 2d arrays---
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
		int t=sc.nextInt();
        for(int i=0;i<m;i++){
			for(int j =0;j<n;j++){
				if(numbers[i][j]==t){
					System.out.print(i+" "+j);
				}
            }
		}
    }
}

SPIRAL PATTERN-----=======================
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
		
		int rs=0;
		int re=m-1;
		int cs=0;
		int ce=n-1;

		while(cs<=ce && re<=re){
			for(int col=cs;col<=ce;col++){
				System.out.print(numbers[rs][col]);
			}
			rs=rs+1;
			for(int row=rs;row<=re;row++){
				System.out.print(numbers[row][ce]);
			}
			ce=ce-1;
			for(int col=ce;col>=cs;col--){
				System.out.print(numbers[re][col]);
			}
			re=re-1;
			for(int row=re;row>=rs;row--){
				System.out.print(numbers[row][cs]);
			}
			cs=cs+1;
        }
    }
}
	
TRANSPOSE OF A 2 D ARRAY-----

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

	






	














	







*/














