//Q.1) write a code for below pattern 
//  D4  C3  B2  A1
//  A1  B2  C3  D4
//  D4  C3  B2  A1
//  A1  B2  C3  D4
/*
import java.io.*;
//import java.util.*;
class one{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               
		System.out.println("Enter the number of rows ");
		int N=Integer.parseInt(br.readLine());
		int num=N;
		int ch=N+64;
		for(int i=1;i<=N;i++){
		

			for(int j=1;j<=N;j++){
			
				if(i%2==1){
				
					System.out.print((char)ch+""+num+" ");
					ch--;num--;
					

				
				}else{
				
					System.out.print((char)ch+""+num+" ");
					num++;ch++;
									
				}

			
			}
			System.out.println();
			if(i%2==1){
			
				ch++;num++;
			}else{
			
				ch--;num--;
			}	
		}
	}
}
*/

//Q.2)
// #  =  =  =  =
// =  #  =  =  =
// =  =  #  =  =
// =  =  =  #  =
// =  =  =  =  #
/*
import java.io.*;
class two{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of  rows ");
		int N=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=N;i++){
		
			for(int j=1;j<=N;j++){
			
				if(i==j){
				
					System.out.print("# ");
				}else{
				
					System.out.print("= ");
					
				}
			}
			System.out.println();

		}
	
	}
}
*/
//Q.3)
//5  4  3  2  1
//8  6  4  2
//9  6  3
//8  4
//5
/*
import java.io.*;
class three{
	public static void main(String[]args)throws IOException{
	
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the number of rows ");
		int N=Integer.parseInt(br.readLine());
		int num=N;
		for(int i=1;i<=N;i++){
		        int num2;
			if (i==1){
			   num2=num;
			}else{
				//num2=(num-i)*(i-1);
				num2=num*i;
			}
			for(int j=1;j<=N-i+1;j++){
				
 	                   System.out.print(num2+"  ");
			   num2=num2-i;


			}
			System.out.println();
			num--;
		}
	}
}
*/

//Q.4) wap to print all even number in reverse order and all odd numbers in standard order , take input form user starting and ending point 
//start number =2
//end number =9
//output= 8 6 4 2
//        3 5 7 9
/*
import java. io.*;
class four{

	public static void main(String[]args)throws IOException{
	
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the starting number ");
                int start=Integer.parseInt(br.readLine());
		System.out.print("Enter the ending number ");
		int end=Integer.parseInt(br.readLine());
		for(int i=end;i>=start;i--){
		
			if(i%2==0){
			
				System.out.print(i+" ");
			}
		
		}
		System.out.println();
               for(int i=start;i<=end;i++){
                        if(i%2==1){

                                System.out.print(i+" ");
                        }

                }
	       System.out.println();
	}

}
*/

//Q.5)take rows from user print the patttern
//  0
//  1  1
//  2  3  5
//  8  13 21 34
/*
import java.io.*;
class five{

	public static void main(String[]args)throws IOException{
	
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the rows number ");
                int N=Integer.parseInt(br.readLine());
		int a=0;int b=1;
		for(int i=1;i<=N;i++){
		
			for(int j=1;j<=i;j++){
			
				//System.out.print(a,"%-5d");
				System.out.printf("%5d",a);
				int c=a+b;
				a=b;
				b=c;
			}
		System.out.println();

		}

	
	}
}
*/

//Q.6) wap , and take two number from user and check if they same prin as it is but if not  then print  their difference
//note:- consider the positional difference not asciis
/*
import java.io.*;

class six {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first character: ");
        char ch1 = br.readLine().toLowerCase().charAt(0);

        System.out.print("Enter second character: ");
        char ch2 = br.readLine().toLowerCase().charAt(0);

        if (ch1 == ch2) {
            System.out.println("Result: " + ch1);
        } else {
            int pos1 = ch1 - 'a' + 1;
            int pos2 = ch2 - 'a' + 1;
            int diff = Math.abs(pos1 - pos2);
            System.out.println("Result: " + diff);
        }
    }
}
*/
//Q.7)
//  O 
//  14  13
//  L   K   J
//  9   8   7  6
//  E   D   C  B  A
/*
import java.io.*;
class seven{
	public static void main(String[]args)throws IOException{                
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter the rows number ");
                int N=Integer.parseInt(br.readLine());	
		int num=  N*(N+1)/2;
		int ch=64+num;
		for (int i=1;i<=N;i++){
		
			for(int j=1;j<=i;j++){
			
				if((i%2==1&& N%2==1)|| (i%2==0 && N%2==0)){
				
					System.out.print((char)ch+" ");
				}else{
				
					System.out.print(num+" ");
				}
				num--;ch--;

			}
			System.out.println();	
		}
	}
}
*/
//Q.8) 
//     $
//     @  @
//     &  &  &
//     #  #  #  #
//     $  $  $  $  $
//     @  @  @  @  @  @
//     &  &  &  &  &  &  &
//     #  #  #  #  #  #  #  #
/*
import java.io.*;

class seven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of rows: ");
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            char symbol;

            // Fix: Use (i - 1) % 4 to cycle through $ @ & #
            if ((i - 1) % 4 == 0) {
                symbol = '$';
            } else if ((i - 1) % 4 == 1) {
                symbol = '@';
            } else if ((i - 1) % 4 == 2) {
                symbol = '&';
            } else {
                symbol = '#';
            }

            // Fix: Corrected inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol + "  ");
            }
            System.out.println();
        }
    }
}

*/
//Q.9)WAP program to take a number as input and print the addition of factorials of each    digit from that number
// input : 1234
// output: Addition of factorials of each digit  from 1234=33
/*
import java.io.*;
class nine{
	static int factorial(int n){
	        int fact=1;
		for (int i=2;i<=n;i++){
			fact=fact*i;

		}
		return fact;
	}

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number ");
		int N=Integer.parseInt(br.readLine());
		int N1=N;
                int sum=0;
		while(N>0){
			int digit=N%10;
			sum=sum+factorial(digit);
			N=N/10;

		}
		System.out.println("Addition of factorial of each digit from "+N1+" :- "+ sum );
	}
}

*/
//Q.10)WAP to print a series of prime number from given starting point and ending point
import java.io.*;
class ten{

	public static void main(String[]args)throws IOException{
	
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));                
                
		System.out.println("Enter the starting point");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enter the ending point");
		int end=Integer.parseInt(br.readLine());

		for(int i=start;i<=end;i++){
		
		        int count=0;
			for (int j=1;j<=i;j++){
		
	                    if(i%j==0){
			    
			    
				    count++;
				    if(count>2){
				    
					    break;

				    }
			    }
			
		}
		if(count==2){
		
			System.out.print(i+" ");
		}
	    
		
	}
	System.out.println();

   }
}






















