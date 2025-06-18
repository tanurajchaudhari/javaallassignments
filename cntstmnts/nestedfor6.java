/*
//Q1)write a code to print numbers divisible by 5 from 1 to 50 & print the number  is even also print the count of even numbers 

import java.io.*;
class one{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start number ");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enter the end number ");
		int end=Integer.parseInt(br.readLine());
                int count=0;
		for(int i=start;i<=end;i++){
		
			if(count==0){
				if(i%5==0&& i%2==0){
				
					System.out.print(i+"  ");

				
					count++;
				
				}
			
				
				
			

			
			
			
			}else{
			        i=i+4;

				if(i%5==0&&i%2==0){
				
					System.out.print(i+"  ");
				
				}

			

			
			}
		

		
		
		}

	

	
	
	}





 }
*/
/*
//Q2) write code ,take input from users and print composite numbers 
import java.io.*;
class two{

        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());
                for(int i=start;i<=end;i++){
		        int count =0;
			for(int j=1;j<=i;j++){
			
				if(i%j==0){
				
					count++;
				
				}
				
			
			
			}
			if(count>2){
			
			
				System.out.print(i+"  ");
			
			}
		}

        }
}
*/
/*
//Q3) write a code to print perfect square number , from user input range
import java.io.*;
class three{

        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());
                for(int i=start;i<=end;i++){
		
			for(int j=1;j*j<=i;j++){
			
				if(j*j==i)
					System.out.print(i+"  ");
			

			
			
			
			}
		
		
		
		
		}

    }

}

*/

/*
//Q4) write a code to print perfect cude root from given numbers 

import java.io.*;
class four{

        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());
                for(int i=start;i<=end;i++){

                        for(int j=1;j*j*j<=i;j++){

                                if(j*j*j==i)
                                        System.out.print(i+"  ");





                        }




                }
    }

}
*/

/*
//Q5) write a code to take a input  range from user and find out  the perfect numbers in between that range

import java.io.*;
class five{

        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
???LINES MISSING
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());

                for(int i=start;i<=end;i++){
			int N=i;

			int sum=0;
			while(N!=0){
			
				int digit=N%10;
                                sum=sum+ factorialn(digit);
				N=N/10;
			}
			if(sum==i)
				System.out.print(i+"  ");



                }
       }

}
*/
////Q.6) WAP  to take a 5 numbers as input and print the count of digit  in those numbers;
/*
import java.io.*;
class six{
        static void countdigit(int N){
		int count=0;
                int N1=N;
                while(N>0){

                        N=N/10;
                        count++;

                }
                System.out.println("The count of digit "+ N1+" is "+count);
        }
        public static void main(String[] args)throws IOException{
                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                for (int i=1;i<=5;i++){

                        System.out.println("Enter the "+i+" number :- ");
                        int N=Integer.parseInt(br.readLine());
                         countdigit(N);
                }
        }
}
*/
//Q.7)WAP to take an input range from user and reverse all the numbers and print
/*
import java.io.*;
class seven{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the  start range :- ");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enter the  end range :- ");
		int end=Integer.parseInt(br.readLine());

		for(int i=start;i<=end;i++){
		
			int num=i;
			int rev=0;
			while(num>0){
			
			        int rem=num%10;
				rev=rev*10+rem;
			       num=num/10;	
			}
			System.out.println("rever of number "+i+" is "+ rev);
		}	
	}
}
*/
//Q.8) WAP to take input range and prin all strong numbers from it 
/*
import java.io.*;
class nine{

        public static void main(String[]args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the  start range :- ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the  end range :- ");
                int end=Integer.parseInt(br.readLine());

                for(int i=start;i<=end;i++){

                        int num=i;
                        int sum=0;
                        while(num>0){
                                
                                int rem=num%10;
				int fact=1;
                                for(int j=1;j<=rem;j++){
				     	fact=fact*j;
				}
			       sum=sum+fact;	
                               num=num/10;
                        }
                        if(i==sum){
				System.out.print(i+" ");
			}
                }
		System.out.println();
        }
}
*/


/*
//Q10) write a code ,to take input range from user and  print the armstrong number from the range
import java.io.*;


class ten{

	 int cubeof(int x,int n){
	   int cube=1;
	   for(int i=1;i<=n;i++){
	   
		   cube=cube*x;

	   }
	   return cube;



	
	}

	int lenof(int a){
	        int length=0;
		while(a!=0){
		
			length++;
			a=a/10;

		}
		return length;

	}
        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());
                ten t=new ten();
                for(int i=start;i<=end;i++){

                        int sum=0;int N=i;
                        int n  = t.lenof(N);
                        while(N!=0){

                                int digit=N%10;
                                sum=sum+t.cubeof(digit,n);
                                N=N/10;
                        }
                        if(sum==i)
				 System.out.print(i+"  ");
               



                }
       }

}
*/



/*
//Q1)write a code to print numbers divisible by 5 from 1 to 50 & print the number  is even also print the count of even numbers 

import java.io.*;
class one{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start number ");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enter the end number ");
		int end=Integer.parseInt(br.readLine());
                int count=0;
		for(int i=start;i<=end;i++){
		
			if(count==0){
				if(i%5==0&& i%2==0){
				
					System.out.print(i+"  ");

				
					count++;
				
				}
			
				
				
			

			
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());

                for(int i=start;i<=end;i++){
			int N=i;

			int sum=0;
			while(N!=0){
			
				int digit=N%10;
                                sum=sum+ factorialn(digit);
				N=N/10;
			}
			if(sum==i)
				System.out.print(i+"  ");



                }
       }

}
*/

/*
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());

                for(int i=start;i<=end;i++){
			int N=i;

			int sum=0;
			while(N!=0){
			
				int digit=N%10;
                                sum=sum+ factorialn(digit);
				N=N/10;
			}
			if(sum==i)
				System.out.print(i+"  ");



                }
       }

}
*/

/*
//Q10) write a code ,to take input range from user and  print the armstrong number from the range
import java.io.*;


class ten{

	 int cubeof(int x,int n){
	   int cube=1;
	   for(int i=1;i<=n;i++){
	   
		   cube=cube*x;

	   }
	   return cube;



	
	}

	int lenof(int a){
	        int length=0;
		while(a!=0){
		
			length++;
			a=a/10;

		}
		return length;

	}
        public static void main(String [] args)throws IOException{

                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter start number ");
                int start=Integer.parseInt(br.readLine());
                System.out.println("Enter the end number ");
                int end=Integer.parseInt(br.readLine());
                ten t=new ten();
                for(int i=start;i<=end;i++){

                        int sum=0;int N=i;
                        int n  = t.lenof(N);
                        while(N!=0){

                                int digit=N%10;
                                sum=sum+t.cubeof(digit,n);
                                N=N/10;
                        }
                        if(sum==i)
				 System.out.print(i+"  ");
               



                }
       }

}
*/



