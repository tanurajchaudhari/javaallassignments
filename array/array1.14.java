//Q1) WAP to print a array with minimum 10 elements 
/*
import java.io.*;
class one{

	public static void main(String []args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entr the  length of aray :- ");
		int N=Integer.parseInt(br.readLine());
                 int arr1[]=new int[N];
		for(int i=0;i<N;i++){
		     
		       arr1[i]=Integer.parseInt(br.readLine());
		
		}

		System.out.println("Printing the element  of array");
		for(int i=0;i<N;i++){
		
			System.out.print(arr1[i]+"   ");
		
		}
		System.out.println();
	}
}
*/

//Q.2) WAP to print the even  elements in the array 

/*
import java.io.*;
class two{

        public static void main(String []args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Entr the  length of aray :- ");
                int N=Integer.parseInt(br.readLine());
                int arr1[]=new int[N];
                for(int i=0;i<N;i++){

                       arr1[i]=Integer.parseInt(br.readLine());

                }

                System.out.println("Printing the even  element  of array");
                for(int i=0;i<N;i++){

                       if(arr1[i]%2==0){
		         	System.out.print(arr1[i]+"   ");
			}

                }
                System.out.println();
        }
}
*/

//Q.3) WAP to print the odd  elements in the array
/*
import java.io.*;
class three{

        public static void main(String []args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Entr the  length of aray :- ");
                int N=Integer.parseInt(br.readLine());
                int arr1[]=new int[N];
                for(int i=0;i<N;i++){

                       arr1[i]=Integer.parseInt(br.readLine());

                }

                System.out.println("Printing the even  element  of array");
                for(int i=0;i<N;i++){

                       if(arr1[i]%2==1){
                                System.out.print(arr1[i]+"   ");
                        }

                }
                System.out.println();
        }
}
*/

//Q.4) WAp to print the elements in the array which is less than 10
/*
import java.io.*;
class four{

        public static void main(String []args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Entr the  length of aray :- ");
                int N=Integer.parseInt(br.readLine());
                int arr1[]=new int[N];
                for(int i=0;i<N;i++){

                       arr1[i]=Integer.parseInt(br.readLine());

                }

                System.out.println("Printing the even  element  of array");
                for(int i=0;i<N;i++){

                       if(arr1[i]<10){
                                System.out.println(arr1[i]+" is less than  10 ");
                        }

                }
                System.out.println();
        }
}
*/

//Q.5) WAP where you have to  take input from the user for a character array and print the characters
/*
import java.io.*;
class five{

        public static void main(String []args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Entr the  length of aray :- ");
                int N=Integer.parseInt(br.readLine());
                char arr1[]=new char[N];
                for(int i=0;i<N;i++){

                       arr1[i]=(br.readLine().charAt(0));

                }

                System.out.println("Printing the element  of array");
                for(int i=0;i<N;i++){

                        System.out.print(arr1[i]+"   ");

                }
                System.out.println();
        }
}
*/

//Q.6) WAP to print the elements of  the  array   which divisible by  4 
/*
import java.io.*;
class six{

        public static void main(String []args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Entr the  length of aray :- ");
                int N=Integer.parseInt(br.readLine());
                int arr1[]=new int[N];
                for(int i=0;i<N;i++){

                       arr1[i]=Integer.parseInt(br.readLine());

                }

                System.out.println("Printing the element  of array");
                for(int i=0;i<N;i++){
                     if(arr1[i]%4==0){
                        System.out.print(arr1[i]+"   ");
		     }

                }
                System.out.println();
        }
}
*/

//Q.7)WAp to print a oddindex elements of array
/*
import java.io.*;
class seven{

        public static void main(String []args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Entr the  length of aray :- ");
                int N=Integer.parseInt(br.readLine());
                int arr1[]=new int[N];
                for(int i=0;i<N;i++){
                       arr1[i]=Integer.parseInt(br.readLine());
                }
                System.out.println("Printing the element  of array");
                for(int i=0;i<N;i++){
                     if(i%2==1){
                        System.out.print(arr1[i]+"   ");
                     }
                }
                System.out.println();
        }
}
*/

//Q.8) real time example  where u have touse array
/*
import java.io.*;
class eight{

        public static void main(String []args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Entr the  length of aray :- ");
                int N=Integer.parseInt(br.readLine());
                String[] VoterName=new String[N];
		System.out.println("Enter the voters name : - ");
                for(int i=0;i<N;i++){
                       VoterName[i]=(br.readLine());
                }
                System.out.println("Printing the VotersName in the array");
                for(int i=0;i<N;i++){
                     
                        System.out.print(VoterName[i]+"   ");
                    
                }
                System.out.println();
        }
}
*/


