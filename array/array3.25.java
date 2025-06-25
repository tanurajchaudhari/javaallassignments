//Q.1)  Wriet a programe to add 15 in all elements and aprint it.

/*
import java.io.*;
class one{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int arr3[]={22,32,44,45,32,12,67};
		System.out.println("Before adding  value in the array element  : - ");
		for (int i=0;i<arr3.length;i++){
		
			System.out.print(arr3[i]+"  ");
		}
		System.out.println();
		System.out.println("After adding element in the array :- ");
		for(int i=0;i<arr3.length;i++){
			arr3[i]=arr3[i]+15;
			System.out.print(arr3[i]+"  ");
		}
                System.out.println();
		
	
	}
}
*/

//Q.2) WAP to find the first occurenece of a specific number in the array.
/*

import java.io.*;
class two{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
		int N=Integer.parseInt(br.readLine());
		int arr3[]=new int[N];
		System.out.println("Enter the element in the array :-  ");
                for (int i=0;i<N;i++){

			arr3[i]=Integer.parseInt(br.readLine());
                        
                }
                System.out.println();
                System.out.println("Enter the specific number : ");
		int key=Integer.parseInt(br.readLine());
                boolean flag=false;
                for(int i=0;i<arr3.length;i++){
                        
                        if(arr3[i]==key){
			
				System.out.println("first occurence of"+key+" is at "+i);
				flag=true;
				break;
		                 
			}
                }
		if(flag==false){
		
			System.out.println("number "+key +"is not found  in array");
		}
               
        }
}
*/

//Q.3)WAP to find the number of occurences of a specific number in the array 
/*
import java.io.*;
class three{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int arr3[]=new int[N];
                System.out.println("Enter the element in the array :-  ");
                for (int i=0;i<N;i++){

                        arr3[i]=Integer.parseInt(br.readLine());

                }
                System.out.println();
                System.out.println("Enter the specific number : ");
                int key=Integer.parseInt(br.readLine());
                int count=0;
                for(int i=0;i<arr3.length;i++){

                        if(arr3[i]==key){

                                count++;
                        }
                }
                System.out.println("number "+key +" is ocure  in array "+count+ " times ");
        }
}
*/

//Q.4)WAP to convert all even numbers into 0 and all odd numbers into 1 
/*
import java.io.*;
class four{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int arr3[]=new int[N];
                System.out.println("Enter the element in the array :-  ");
                for (int i=0;i<N;i++){
                        arr3[i]=Integer.parseInt(br.readLine());
                }
                System.out.println();
                for(int i=0;i<arr3.length;i++){

                        if(arr3[i]%2==0){

                                arr3[i]=0;
                        }else{
			
				arr3[i]=1;
			}
                }
		System.out.println("After the making vaues 0 and 1");
                for(int i=0;i<N;i++){
		
			System.out.print(arr3[i]+"  ");
		}
		System.out.println();
        }
}
*/

//Q.5) WAP to convert all negative numbers into their squares in usergiven array

/*
import java.io.*;
class five{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int arr3[]=new int[N];
                System.out.println("Enter the element in the array :-  ");
                for (int i=0;i<N;i++){
                        arr3[i]=Integer.parseInt(br.readLine());
                }
                System.out.println();
                for(int i=0;i<arr3.length;i++){

                        if(arr3[i]<0){

                                arr3[i]=arr3[i]*arr3[i];
                        }

                             
                }
                System.out.println("After the making negative values into their squares ");
                for(int i=0;i<N;i++){

                        System.out.print(arr3[i]+"  ");
                }
                System.out.println();
        }
}
*/


//Q.6)   WAP to print all consonants in the char array
/*
import java.io.*;
class  six{ 

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                char arr3[]=new char[N];
                System.out.println("Enter the element in the array :-  ");
                for (int i=0;i<N;i++){
                        arr3[i]=br.readLine().charAt(0);
                }
                System.out.println();
		for(int i=0;i<N;i++){
		
			if(arr3[i]!='A'&& arr3[i]!='a'&& arr3[i]!='e' && arr3[i]!='E' && arr3[i]!='I' && arr3[i]!='i' && arr3[i]!='O' && arr3[i]!='o' &&                               arr3[i]!='U'&& arr3[i]!='u'){
				System.out.print(arr3[i]+"  ");
			}
		}
                
                System.out.println();
        }
}
*/

//Q.7)  Check the size of the array if it is odd and greater than or equal to 5, then print the odd elements,else print the even elemenet 
/*
import java.io.*;
class  seven{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int arr3[]=new int[N];
                System.out.println("Enter the element in the array :-  ");
                for (int i=0;i<N;i++){
                        arr3[i]=Integer.parseInt(br.readLine());
                }
                System.out.println();
                
		if(N%2==1 && N>=5){
				
			for(int i=0;i<N;i++){
                                 if(arr3[i]%2==1){
					System.out.print(arr3[i]+"  ");
				}
                         
                        }
                }else{
			for(int i=0;i<N;i++){
			
				System.out.print(arr3[i]+"  ");
			}
		
		}
                System.out.println();
        }
} 
*/

//Q.8) WAp to print the  composite numbers in the array
//
/*
import java.io.*;
class  eight{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int arr3[]=new int[N];
                System.out.println("Enter the element in the array :-  ");
                for (int i=0;i<N;i++){
                        arr3[i]=Integer.parseInt(br.readLine());
                }
                System.out.println();
                for(int i=0;i<N;i++){
                        
                        for(int j=2;j<=arr3[i]/2;j++){
			
				if(arr3[i]%j==0){
				
					System.out.print(arr3[i]+"  ");
					break;
				}
			
			}
                }
                System.out.println();
        }
}
*/

//Q.9)  print the prime numbers in the array
//
/*
import java.io.*;
class  nine{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int arr3[]=new int[N];
                System.out.println("Enter the element in the array :-  ");
                for (int i=0;i<N;i++){
                        arr3[i]=Integer.parseInt(br.readLine());
                }
                System.out.println();
                for(int i=0;i<N;i++){
                      int count=0;
                        for(int j=2;j<=arr3[i]/2;j++){

                                if(arr3[i]%j==0){

                                        
                                        count++;
                                }

                        }
			if(count==0){
			
				System.out.print(arr3[i]+"  ");
			}
                }
                System.out.println();
        }
}
*/

//Q.10)  WAP to print a product of prime  element in the array
//
/*
import java.io.*;
class  ten{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int arr3[]=new int[N];
                System.out.println("Enter the element in the array :-  ");
                for (int i=0;i<N;i++){
                        arr3[i]=Integer.parseInt(br.readLine());
                }
                System.out.println();
		int product=1;
                for(int i=0;i<N;i++){
                      int count=0;
                        for(int j=2;j<=arr3[i]/2;j++){

                                if(arr3[i]%j==0){


                                        count++;
                                }

                        }
                        if(count==0){

                                product=product*arr3[i];
                        }
                }
                System.out.println("Product of all prime  element in the array  :  -  "+product);
        }
}
*/

