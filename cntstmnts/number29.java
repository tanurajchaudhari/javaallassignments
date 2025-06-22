//Q.1)  WAP to check whether the given number is a perfect nuber or not.
/*
import java.io.*;
class one{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the number :- ");
		int N=Integer.parseInt(br.readLine());
                int sum=1;
		for(int i=2;i<=N/2;i++){
		     
			if(N%i==0){
			     
				sum=sum+i;

			}
		}
		if(sum==N){
		
			System.out.println(N+" is  perfect number ");
		}else{
		
			System.out.println(N+" is not perfect number ");
		}
	
	}
}
*/

//Q.2)  WAp to check whether the given number is strong number or not
/*
import java.io.*;
class two{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number :- ");
                int N=Integer.parseInt(br.readLine());
                int sum=0;
		int N0=N;
		

		while(N>0){
		
			int rem=N%10;
			int fact=1;
			for(int i=rem;i>=1;i--){
			
				fact=fact*i;
			}
			sum=sum+fact;
			N=N/10;
		
		}
                if(sum==N0){

                        System.out.println(N0+" is Strong  number  ");
                }else{

                        System.out.println(N0+" is not Strong  number ");
                }

        }
}
*/

//Q.3) WAP  to check whether the given number is deficiant number or not
//
/*
import java.io.*;
class three{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number :- ");
                int N=Integer.parseInt(br.readLine());
                int sum=1;
                for(int i=2;i<=N/2;i++){

                        if(N%i==0){

                                sum=sum+i;

                        }
                }
                if(sum<N){

                        System.out.println(N+" is  deficient number ");
                }else{

                        System.out.println(N+" is not deficient  number ");
                }

        }
}
*/

//Q.4)  WAP  to check whether the given number is abundant  number or not
//
/*
import java.io.*;
class four{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number :- ");
                int N=Integer.parseInt(br.readLine());
                int sum=1;
                for(int i=2;i<=N/2;i++){

                        if(N%i==0){

                                sum=sum+i;

                        }
                }
                if(sum>N){

                        System.out.println(N+" is  Abundunt number ");
                }else{

                        System.out.println(N+" is not Abundunt   number ");
                }

        }
}
*/


//Q.5)  WAP  to check whether the given number is Automorphic   number or not
//
//
/*
import java.io.*;
class five{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number :- ");
                int N=Integer.parseInt(br.readLine());
                int sum=1;

                int SN=N*N;
		int rem=SN%10;
		if(N==rem){
		
			System.out.println(N+" is Automorphic number ");
		}else{
		
			System.out.println(N+" is not  Automorphic number ");
		}


        }
}
*/

//Q.6) WAp that generates the first N number  in the fibonacci series.

/*
import java.io.*;
class six{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number :- ");
                int N=Integer.parseInt(br.readLine());
                int a=0;
		int b=1;
		int c=a+b;
		for(int i=1;i<=N;i++){
                   System.out.print(a+"  ");
                   a=b;
	           b=c;c=a+b;		   

		
		}
		System.out.println();
        }
}
*/

        
//Q.7)  wap to check whether the given  number is happy  number or not

/*
import java.io.*;
class seven{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number :- ");
                int N=Integer.parseInt(br.readLine());
                int sum=0;
                int N1=N;
                while(N>0){
		    int rem=N%10;
		    sum=sum+(rem*rem);
		    N=N/10;
		}       
		if(sum==1){
		
			System.out.println(N1+" is happy number  ");
		}else{
		
			System.out.println(N1+" is not happy number ");
		}
        }
}
*/

//Q.8)  wap to check whether the given  number is DUCK number  or not
//
/*
import java.io.*;
class eight{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number :- ");
                int N=Integer.parseInt(br.readLine());
                int sum=0;
                int N1=N;
		boolean flag= false;
                while(N>0){
                    int rem=N%10;
                    N=N/10;
		    if(N!=0&& rem==0){
			   flag=true;
			   break;	   
		    }
                }
                if(flag==true){

                        System.out.println(N1+" is DUCK number  ");
                }else{

                        System.out.println(N1+" is not a DUCK  number ");
                }
        }
}
*/


//Q.9) WAP to check whether the given number  is Harshad/Niven number or not
//
/*
import java.io.*;
class nine{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number :- ");
                int N=Integer.parseInt(br.readLine());
                int sum=0;
                int N1=N;
                
                while(N>0){
		
			sum=sum+N%10;
			N=N/10;
		}    
                if(N1%sum==0){

                        System.out.println(N1+" is Harshad  number  ");
                }else{

                        System.out.println(N1+" is not a Harshad   number ");
                }
        }
}
*/

//Q.10)  WAp to check whether the given number is an armstrong number or not .
//
/*
import java.io.*;
class ten{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
                System.out.println("Enter the number :- ");
                int N=Integer.parseInt(br.readLine());
                double sum=0;
                int N1=N;
                int count=0;
                while(N>0){

                        count++;
                        N=N/10;
                }
		int N2=N1;
		while(N2>0){
		
			int rem=N2%10;
			sum=sum + Math.pow(rem,count);
			N2=N2/10;

		}
                if(sum==N1){

                        System.out.println(N1+" is Armstrong  number  ");
                }else{

                        System.out.println(N1+" is not a  Armstrong  number ");
                }
        }
}
*/

