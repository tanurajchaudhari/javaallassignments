//Q.1)   WAP  tocheck  whether the given array is descending or not.
/*
import java.io.*;
class one{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of array ");
		int N=Integer.parseInt(br.readLine());
                int arr6[]=new int[N];
		System.out.println("Enter the elemenet in the array ");
		for(int i=0;i<N;i++){
		
			arr6[i]=Integer.parseInt(br.readLine());

		}

		for(int i=1;i<N;i++){
		
			if(arr6[i]>arr6[i-1]){
			
				System.out.println("Given array is not in descending order");
				return;
			}
		}
		System.out.println("Given array is in descending order ");
	}
}
*/

//Q.2) WAP to find out the sum of all prime numbers in the array and also  print the count of primre numbers in an array

/*
import java.io.*;
class two{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array ");
                int N=Integer.parseInt(br.readLine());
                int arr6[]=new int[N];
                System.out.println("Enter the elemenet in the array ");
                for(int i=0;i<N;i++){

                        arr6[i]=Integer.parseInt(br.readLine());

                }
                int countofp=0;int sum=0;
                for(int i=0;i<N;i++){
			int count=0;
			
			for(int j=2;j<arr6[i]/2;j++){
			
				if(arr6[i]%j==0){
				
					count++;
				}
			}
			if(count==0){
			
				sum=sum+arr6[i];
				countofp++;
			}        
                }
                System.out.println("the sum of prime numbers is  "+sum+"   and count of prime numbers is "+countofp);

        }
}
*/

//Q.3) WAP to check the count of the user  given key in your array,if the count is more than 2 times replace the element with its cube,print the array.
//input:- enter the length of array
//      9
//      Enter the elemenet in the array
//      11
//      6
//      8
//      9
//      5
//      8
//      7
//      8
//      6
//      Enter the key 
//      8
//
// output=11,6,512,9,5,512,7,512,6
// 
//       
/*
import java.io.*;
class three{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array ");
                int N=Integer.parseInt(br.readLine());
                int arr6[]=new int[N];
                System.out.println("Enter the elemenet in the array ");
                for(int i=0;i<N;i++){

                        arr6[i]=Integer.parseInt(br.readLine());

                }
		System.out.println("Enter the key :- ");
		int Key=Integer.parseInt(br.readLine());
		int Keycount=0;
		for(int i=0;i<N;i++){
		
			if(Key==arr6[i]){
			
				Keycount++;
			}
		}
		if(Keycount>2){
		
                       for(int i=0;i<N;i++){
		       
			       if(arr6[i]==Key){
			       
				       arr6[i]=Key*Key*Key;
			       }
		       
		       }
		
		}else if(Keycount==0){
		
			System.out.println("Key is not found ");
		}else{
		
			System.out.println("Key is found less than or equal 2 ");
		}
		if(Keycount>2){
			System.out.println("Updated array is ");
			for(int i=0;i<N;i++){
		
				System.out.print(arr6[i]+"  ");

			}
			System.out.println();
		}
		
	}
}
*/

//Q.4) You have to take two different 1 d arras of the same size and print the common element from the arrays 
//
/*
import java.io.*;
class four{

	static void getarrayelement(int arr[],int N,BufferedReader br)throws IOException{
	
		for(int i=0;i<N;i++){
		
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println();
	}
	static void printarray(int arr[],int N){
	
		for(int i=0;i<N;i++){
		
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	
	}
        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array ");
                int N=Integer.parseInt(br.readLine());
                int arr61[]=new int[N];
                System.out.println("Enter the elemenet in the array ");
                getarrayelement(arr61,N,br);
		System.out.println("Enter the secont array length ");
		int N2=Integer.parseInt(br.readLine());
		System.out.println("Enter the element in  second array ");
                int arr62[]=new int[N];
		getarrayelement(arr62,N2,br);

		System.out.println("Print first array : ");
		printarray(arr61,N);
		System.out.println("Print second array : ");
		printarray(arr62,N2);
                //System.out.println("printing the common element in both array ");
		boolean flag=false;
		int count=0;
                for(int i=0;i<N;i++){
		
			for(int j=0;j<N2;j++){
			
				if(arr61[i]==arr62[j]){
					flag=true;
					count++;
					if(count==1){
						System.out.println("printing the common element in both array ");
						System.out.print(arr61[i]+"  ");
					
					}else{
					
						System.out.print(arr61[i]+"  ");
					}
				}

			}
		
		}
		if(flag==false){
		
			System.out.println("no common element found in the array ");
		}
                System.out.println();
		System.out.println("End the code ");



	}
}
*/


//Q.5) Take a two different array where size of array may differ ,you hace to create an array by combining  both the arrays(you have to merge the array )
/*
import java.io.*;
class five{

        static void getarrayelement(int arr[],int N,BufferedReader br)throws IOException{

                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
                System.out.println();
        }
        static void printarray(int arr[],int N){

                for(int i=0;i<N;i++){

                        System.out.print(arr[i]+"  ");
                }
                System.out.println();

        }
        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array ");
                int N=Integer.parseInt(br.readLine());
                int arr61[]=new int[N];
                System.out.println("Enter the elemenet in the array ");
                getarrayelement(arr61,N,br);
                System.out.println("Enter the secont array length ");
                int N2=Integer.parseInt(br.readLine());
                System.out.println("Enter the element in  second array ");
                int arr62[]=new int[N2];
                getarrayelement(arr62,N2,br);

                System.out.println("Print first array : ");
                printarray(arr61,N);
                System.out.println("Print second array : ");
                printarray(arr62,N2);

                int N3=N+N2;
		int Marr[]=new int[N3];
		int i=0;
		for(;i<N;i++){
			Marr[i]=arr61[i];
		
		}
		int j=0;
		for(;i<N3;i++){
		
		    if(j<N2){
			Marr[i]=arr62[j];
			j++;
		    }else{
		    
			    break;
		    }
		}


		System.out.println("Print the merger array ");
		printarray(Marr,N3);
           }
}
*/

//Q.6) WAP to check whether the array contains element multiple of user given int value, if yes then print its index

/*
import java.io.*;
class six{

        static void getarrayelement(int arr[],int N,BufferedReader br)throws IOException{

                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
                System.out.println();
        }
        static void printarray(int arr[],int N){

                for(int i=0;i<N;i++){

                        System.out.print(arr[i]+"  ");
                }
                System.out.println();

        }
        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array ");
                int N=Integer.parseInt(br.readLine());
                int arr61[]=new int[N];
                System.out.println("Enter the elemenet in the array ");
                getarrayelement(arr61,N,br);
                
		System.out.println("Print the array ");
		printarray(arr61,N);
		System.out.println("Enter the key value ");
		int key=Integer.parseInt(br.readLine());

                for(int i=0;i<N;i++){
		
			if(arr61[i]%key==0){
			
				System.out.println("An element multiple of 5 found at index : "+i);
			}
		}
		System.out.println("Code ended");
       }
 }
*/

//Q.7) WAP  to where you have to take integer input from user and if the integer is in the range of ASCII value of A to Z ,while saving you have  to type cast the int into char .print the array
/*
import java.io.*;
class seven{
        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array ");
                int N=Integer.parseInt(br.readLine());
                String arr61[]=new String[N];
                System.out.println("Enter the elemenet in the array ");
                
                for(int i=0;i<N;i++){
		          int num=Integer.parseInt(br.readLine());

			if(num>=65&&num<=90){
			
				arr61[i] = Character.toString((char)num);

			}else{
			
				arr61[i]=Integer.toString(num);
			}
		}
		System.out.println("Print te array ");
		for(int i=0;i<N;i++){
		
			System.out.print(arr61[i]+"  ");
		}
		System.out.println();
	}
}
*/

//Q.8)  WAP to reverse the char array  and print the alternate element if the array before and after reverse
 
/*
import java.io.*;
class eight{
	static void printarray(char arr[],int N){
		for(int i=0;i<N;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array ");
                int N=Integer.parseInt(br.readLine());
                char arr61[]=new char[N];
                System.out.println("Enter the elemenet in the array ");
		for(int i=0;i<N;i++){
			arr61[i]=br.readLine().charAt(0);
		}
		System.out.println();
		System.out.println("Print the array ");
		printarray(arr61,N);
		System.out.println("printing alternate elemenet in the array before reverse ");
		for(int i=0;i<N;){
			System.out.print(arr61[i]+"  ");
			i=i+2;
		}
		int start=0;int end=N-1;
		while(start<end){
			char temp=arr61[end];
			arr61[end]=arr61[start];
			arr61[start]=temp;
			start++;end--;
		}
		System.out.println("Print the array after reverse ");
		printarray(arr61,N);
		for(int i=0;i<N;){
			System.out.print(arr61[i]+"  ");
			i=i+2;
		}
		System.out.println();
		System.out.println("Code is ended");
       }
}

*/


//Q.9) WAP to count the pallindrome elements in the your array

/*
import java.io.*;
class nine{
        static void printarray(int arr[],int N){
                for(int i=0;i<N;i++){
                        System.out.print(arr[i]+"  ");
                }
                System.out.println();
        }
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array ");
                int N=Integer.parseInt(br.readLine());
                int arr61[]=new int[N];
                System.out.println("Enter the elemenet in the array ");
                for(int i=0;i<N;i++){
                        arr61[i]=Integer.parseInt(br.readLine());
                }
                System.out.println();
                System.out.println("Print the array ");
                printarray(arr61,N);

		int count=0;
		for(int i=0;i<N;i++){
			int num=arr61[i];
                        int rev=0;
			while(num>0){
				int rem=num%10;
                                rev=rev*10+rem;
				num=num/10;
			}
			if(rev==arr61[i]){
				count++;
			}
		}
		System.out.println("Count of pallindrome number is  : - "+ count);
	}
}
*/

//Q.10)WAP to find the third largest element in the array
/*
import java.util.*;
import java.io.*;
class ten{
        static void printarray(int arr[],int N){
                for(int i=0;i<N;i++){
                        System.out.print(arr[i]+"  ");
                }
                System.out.println();
        }
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array ");
                int N=Integer.parseInt(br.readLine());
                int arr61[]=new int[N];
                System.out.println("Enter the elemenet in the array ");
                for(int i=0;i<N;i++){
                        arr61[i]=Integer.parseInt(br.readLine());
                }
                System.out.println();
                System.out.println("Print the array ");
                printarray(arr61,N);
                int firstlargest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		int thirdlargest=Integer.MIN_VALUE;

		for(int i=0;i<N;i++){
		
			if(arr61[i]>firstlargest){
			
				firstlargest = arr61[i];
			}
		}
		for(int i=0;i<N;i++){
		
			if(arr61[i]<firstlargest && arr61[i]>secondlargest){
			
				secondlargest=arr61[i];
			}
		}
		for(int i=0;i<N;i++){
		
			if(arr61[i]<secondlargest && arr61[i]>thirdlargest){
			
				thirdlargest=arr61[i];
			}
		}

		System.out.println(" the third largest element in the array is :-   "+thirdlargest);


	

 	}
}

*/































