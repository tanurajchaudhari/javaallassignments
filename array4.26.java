//Q.1) WAP  to print the average of element in the array
/*
import java.util.*;
class one{

	public static void main(String[]args){
	
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the length of array :-  ");
                int N=sc.nextInt();
		int arr4[]=new int [N];
		System.out.println("Enter the element in the array  :-  ");
		for(int i=0;i<N;i++){
		
			arr4[i]=sc.nextInt();
		}
		float average=0;
                for(int i=0;i<N;i++){
		
			average=average+arr4[i];
		}
		System.out.println("Average of elements in the array "+ average/N);
	}
}
*/


//Q.2) WAp too find the difference between minimum element  and maximum element in the array
//
/*
import java.util.*;
class two{

        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);

                System.out.println("Enter the length of array :-  ");
                int N=sc.nextInt();
                int arr4[]=new int [N];
                System.out.println("Enter the element in the array  :-  ");
                for(int i=0;i<N;i++){

                        arr4[i]=sc.nextInt();
                }
                int minvalue=Integer.MAX_VALUE;
		int maxvalue=Integer.MIN_VALUE;

                for(int i=0;i<N;i++){
                        
			if(arr4[i]<minvalue){
			
				minvalue=arr4[i];

			}
                        if(arr4[i]>maxvalue){
			
				maxvalue=arr4[i];
			}
                }
                System.out.println("the difference between maximum and minimum value is :-  "+ (maxvalue-minvalue) );
        }
}
*/

//Q.3) WAP to find the second largest element in the array
/*
import java.util.*;
class three{

        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);

                System.out.println("Enter the length of array :-  ");
                int N=sc.nextInt();
                int arr4[]=new int [N];
                System.out.println("Enter the element in the array  :-  ");
                for(int i=0;i<N;i++){

                        arr4[i]=sc.nextInt();
                }
                
                int maxvalue=Integer.MIN_VALUE;

                for(int i=0;i<N;i++){

                       
                        if(arr4[i]>maxvalue){

                                maxvalue=arr4[i];
                        }
                }
		int max2value=Integer.MIN_VALUE;
		for(int i=0;i<N;i++){
		
			if(arr4[i]<maxvalue&& arr4[i]>max2value){
			
				max2value=arr4[i];
			}
		}

                System.out.println(" the second largest element in the array  :-  "+ max2value );
        }
}
*/

//Q.4)  WAP to check user given number occures 2 times or more than 2 times 
//
/*
import java.util.*;
class four{

        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);

                System.out.println("Enter the length of array :-  ");
                int N=sc.nextInt();
                int arr4[]=new int [N];
                System.out.println("Enter the element in the array  :-  ");
                for(int i=0;i<N;i++){

                        arr4[i]=sc.nextInt();
                }
                System.out.println("Enter the number :- ");
		int key =sc.nextInt();
		int count=0;
		for(int i=0;i<N;i++){
		
			if(arr4[i]==key){
			
				count++;
			}
		}
		if(count>=2){
		
			System.out.println("the number "+key +" Occures more than  or equal to 2 times ");
		}else{
		
			System.out.println("ther number "+key +" is not occure 2 times ");
		}
                

        }
}
*/

//Q.5)  WAP to reverse the array
//
/*
import java.util.*;
class five{

        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);

                System.out.println("Enter the length of array :-  ");
                int N=sc.nextInt();
	        int arr4[]=new int[N];
		System.out.println("Enter the element in the array :-  ");
                
                for(int i=0;i<N;i++){
		
			arr4[i]=sc.nextInt();

		}
                System.out.println();
                System.out.println("Array before reverser :");
		for(int i=0;i<N;i++){
		
			System.out.print(arr4[i]+"  ");
		}
		System.out.println();
		int start=0;int end=N-1;
		while(start<end){
		
			int temp=arr4[start];
			arr4[start]=arr4[end];
			arr4[end]=temp;
			start++;end--;
		}
		System.out.println("Array after reverse  :  ");
		for(int i=0;i<N;i++){
		
			System.out.print(arr4[i]+"  ");
		}
		System.out.println();


        }
}
*/

//Q.6) WAP to count vowels and consonants in the array
/*
import java.util.*;
class six{

        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);

                System.out.println("Enter the length of array :-  ");
                int N=sc.nextInt();
                char arr4[]=new char [N];
                System.out.println("Enter the element in the array  :-  ");
		for(int i=0;i<N;i++){
		
			arr4[i]=sc.next().charAt(0);
		}
		int countvwl=0;
		int countcnst=0;

		for(int i=0;i<N;i++){
		
			if(arr4[i]=='A'||arr4[i]=='a'||arr4[i]=='E'||arr4[i]=='e'||arr4[i]=='I'||arr4[i]=='i'||arr4[i]=='O'||arr4[i]=='o'
			                            ||arr4[i]=='U'||arr4[i]=='u'){
						    
						    
                                         countvwl++;
		       }else{
		       
			       countcnst++;
		       }
		}
                System.out.println("Count of vowels is  :-  "+ countvwl);
		System.out.println("Count of consonants is :- "+ countcnst);

        }
}
*/

//Q.7) WAP to connvert lowerclass character into UPPERCAST 
/*
import java.util.*;
class seven{

        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);

                System.out.println("Enter the length of array :-  ");
                int N=sc.nextInt();
                char arr4[]=new char [N];
                System.out.println("Enter the element in the array  :-  ");
                for(int i=0;i<N;i++){

                        arr4[i]=sc.next().charAt(0);
                }
                
		for(int i=0;i<N;i++){
		        int add;
			int temp=(int)arr4[i];
			if(temp>=97&& temp<=122){
				add=temp-96;
				arr4[i]=(char)(64+add);
			}
		}
		System.out.println("All uppercast character :- ");
		for(int i=0;i<N;i++){
		
			System.out.print(arr4[i]+"  ");
		}
		System.out.println();
        }
}
*/

//Q.8) WAP to print the occurence the user given vharacter 

/*
import java.util.*;
class eight {

        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);

                System.out.println("Enter the length of array :-  ");
                int N=sc.nextInt();
                char arr4[]=new char [N];
                System.out.println("Enter the element in the array  :-  ");
                for(int i=0;i<N;i++){

                        arr4[i]=sc.next().charAt(0);
                }
		System.out.println("Enter the character  you want found occurence  : ");
		char K=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<N;i++){
			if(arr4[i]==K){
			
				count++;
			}
		}
		System.out.println(K+" occurece "+ count +" times in the given array ");
        }
}
*/


//Q.9) WAP to replace the element with #, which are not in the range of small a to   small z
/*
import java.util.*;
class nine{
	static void printarr(char arr[],int N){
               for (int i=0;i<N;i++){

                        System.out.print(arr[i]+"  ");
                }
	}
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the length of array :-  ");
                int N=sc.nextInt();
                char arr4[]=new char [N];
                System.out.println("Enter the element in the array  :-  ");
                for(int i=0;i<N;i++){

                        arr4[i]=sc.next().charAt(0);
                }
                System.out.println("  before changes in the array ");
	        printarr(arr4,N);
		System.out.println();
		for(int i=0;i<N;i++){
		
			int temp=(int)arr4[i];
			if(temp<97||temp>122){
			
				arr4[i]=(char)(35);
			}
		}
		System.out.println("After teh changes in the array ");
		printarr(arr4,N);
		System.out.println();
		System.out.println("End the code ");
        }
}
*/

//Q.10)  WAP to print  the characters in an array  which comes before the user given charatcer 
//
/*
import java.util.*;
class ten{
        static void printarr(char arr[],int N){
               for (int i=0;i<N;i++){

                        System.out.print(arr[i]+"  ");
                }
        }
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the length of array :-  ");
                int N=sc.nextInt();
                char arr4[]=new char [N];
                System.out.println("Enter the element in the array  :-  ");
                for(int i=0;i<N;i++){

                        arr4[i]=sc.next().charAt(0);
                }
                System.out.println("Enter the key character ");
		char K=sc.next().charAt(0);
		for(int i=0;i<N;i++){
		
			if(arr4[i]==K){
			
				break;
			}else{
			
				System.out.print(arr4[i]+"  ");
			}
		}
		sYSTEM.OUT.PRINTLN();
		System.out.println("Code is End ");

        }
}
*/


