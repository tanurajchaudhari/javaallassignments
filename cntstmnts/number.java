//Q.1) WAP to print factors given number
/*
import java .util.*;
class one{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :-  ");
		int N=sc.nextInt();
		System.out.print("Factors of "+N+" are ");
		for(int i=1;i<=N;i++){
		
			if(N%i==0){
			
				System.out.print(i+",");
			}
		}
		System.out.println();
	
	}
}
*/
//Q.2) WAP to check whether the given number is prime or not
/*
import java.util.*;
class two{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int N=sc.nextInt();
		int count=0;
		for(int i=2;i<N/2;i++){
		
			if(N%i==0){
			
				count++;
			}
		}
		if(count>0){
		
			System.out.println(N+" is not a prime number");
		

		}else{
		

			System.out.println(N+" is a prime number");
		}
	}
}

*/
//Q.3) WAP to check whether the given number is composite or not
/* 
import java.util.*;
class three{

        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number ");
                int N=sc.nextInt();
                int count=0;
                for(int i=2;i<N/2;i++){

                        if(N%i==0){

                                count++;
                        }
                }
                if(count>0){

                        System.out.println(N+" is composite number");


                }else{


                        System.out.println(N+" is not composite  number");
                }
        }
}
*/
//Q.4) WAP to print the factorial of the number
/*
import java.util.*;
class four{

        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number ");
                int N=sc.nextInt();
                int fact=1;
		int N1=N;
		for (int i=2;i<=N;i++){
		
		
			fact=fact*i;
		
		}

	        System.out.println("Factorial of "+N1 +" is "+fact);
        }
}
*/

//Q.5)WAP to reverse the given number  
/*
import java.util.*;
class five{

        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number ");
                int N=sc.nextInt();
                int NN=0;
		int N1=N;
                 while(N>0){
		 
			 int rem=N%10;
			 NN=NN*10+rem;
			 N=N/10;
		 }
                      
       		System.out.println("Reverse of "+N1 +" is "+NN);
        }
}

*/
//Q.6)WAp to check the given number is pallindrome or not 
 /*
import java.util.*;
class six{

        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number ");
                int N=sc.nextInt();
                int NN=0;
                int N1=N;
                 while(N>0){

                         int rem=N%10;
                         NN=NN*10+rem;
                         N=N/10;
                 }

                if(NN==N1){
		    	System.out.println(NN+" is a pallindrome number ");
		}else{
		
			System.out.println(NN+" is not pallindrome number");
		}
        }
}
*/













































