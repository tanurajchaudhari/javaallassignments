//Q.1) WAP to check whether the array is in ascending  order or not

/*
import java .io.*;
class one{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of arra ");
		int N=Integer.parseInt(br.readLine());
		int arr5[]=new int[N];
                System.out.println("Enterthe elemenet in the array ");
		for(int i=0;i<N;i++){
		
			arr5[i]=Integer.parseInt(br.readLine());
		}
                boolean flag=false;
		for(int i=1;i<N;i++){
			if(arr5[i]<arr5[i-1]){
				System.out.println("The given array is not ascending ");
				flag=true;
				break;
			}
		}
		if(flag==false){
		
			System.out.println("The give array in ascending order ");
		}
	}
}
*/

//Q.2)  WAP to print sum of odd and even  numbers in the array
/*
import java .io.*;
class two{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of arra ");
                int N=Integer.parseInt(br.readLine());
                int arr5[]=new int[N];
                System.out.println("Enterthe elemenet in the array ");
                for(int i=0;i<N;i++){

                        arr5[i]=Integer.parseInt(br.readLine());
                }
                int oddsum=0;int evensum=0;
		for(int i=0;i<N;i++){
		
			if(arr5[i]%2==0){
			
				evensum=evensum+arr5[i];
			}else{
			
				oddsum=oddsum+arr5[i];
			}
		}
		System.out.println("Odd sum is :- "+oddsum);
		System.out.println("Even sum is :- "+ evensum);

        }
}
*/

//Q.3) WAP to chek  if an array is apallindrome or not 
/*
import java .io.*;
class three{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of arra ");
                int N=Integer.parseInt(br.readLine());
                int arr5[]=new int[N];
                System.out.println("Enterthe elemenet in the array ");
                for(int i=0;i<N;i++){

                        arr5[i]=Integer.parseInt(br.readLine());
                }
                int start=0;int end=N-1;
		boolean flag=false;
		while (start<end){
		
			if(arr5[start]!=arr5[end]){
			
				System.out.println("The given array is  not pallindrome array");
				flag=true;
				break;
			}
			start++;end--;

		}
		if(flag==false){
		
			System.out.println("The given array is pallindrome array");
		}
		System.out.println("Code is ended");
        }
}
*/

//Q.4) WAP to  check first duplicate element in an array and return its index 
//input=   Enter the size of arra
//          6
//          Enter the element in the array.
//          1
//          2
//          3
//          3
//          2
//          5
//output:- first duplicate element present at index :- 1
//
/*
import java.util.*;
import java .io.*;
class four{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of arra ");
                int N=Integer.parseInt(br.readLine());
                int arr5[]=new int[N];
                System.out.println("Enterthe elemenet in the array ");
                for(int i=0;i<N;i++){

                        arr5[i]=Integer.parseInt(br.readLine());
                }
	        Set<Integer>seen=new HashSet<>();	
		Map<Integer,Integer>firstele=new HashMap<>();

		for(int i=0;i<N;i++){
		
			if(seen.contains(arr5[i])){
			
			
				System.out.println("First duplicate element found at index :- "+  firstele.get(arr5[i]));
				return;
			}else{
			
				seen.add(arr5[i]);
				firstele.put(arr5[i],i);
			}
		}
		System.out.println("No duplicate element foun in the array ");
        }
}
*/

//Q.5) WAP t print a count of digit in the array
/*
import java .io.*;
class five{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of arra ");
                int N=Integer.parseInt(br.readLine());
                int arr5[]=new int[N];
                System.out.println("Enterthe elemenet in the array ");
                for(int i=0;i<N;i++){

                        arr5[i]=Integer.parseInt(br.readLine());
                }
                System.out.println("Count of digits in the elemnt in the array :- ");

		for(int i=0;i<N;i++){
		        int count=0;
			
			for(int num=arr5[i];num>0;num=num/10){
				count++;
			}
			System.out.print(count+",");
		}
        }
}
*/
//Q.6) WAP to print first prime number in the array 
//
/*
import java .io.*;
class six{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of arra ");
                int N=Integer.parseInt(br.readLine());
                int arr5[]=new int[N];
                System.out.println("Enterthe elemenet in the array ");
                for(int i=0;i<N;i++){

                        arr5[i]=Integer.parseInt(br.readLine());
                }
               

                for(int i=0;i<N;i++){
                        int count=0;

                        for(int j=2;j<arr5[i]/2;j++){
                                if(arr5[i]%j==0){
				 	
					count++;
				}
				
                        }
			if(count==0){
			
				System.out.println("First prime number is found at index "+i);
				return;
			}
		}
		System.out.print(" no prime element found in the array ");
        }
}
*/


//Q.7) WAP to find the composite number in the array
/*
import java .io.*;
class seven{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of arra ");
                int N=Integer.parseInt(br.readLine());
                int arr5[]=new int[N];
                System.out.println("Enterthe elemenet in the array ");
                for(int i=0;i<N;i++){

                        arr5[i]=Integer.parseInt(br.readLine());
                }
                System.out.print("Composite numbers in the array :-  ");
                boolean flag=false;
                for(int i=0;i<N;i++){
                        int count=0;

                        for(int j=2;j<arr5[i]/2;j++){
                                if(arr5[i]%j==0){

                                        count++;
                                }

                        }
                        if(count>=1){
                                flag=true;
                                System.out.print(arr5[i]+"  ");
                                
                        }
                }
		System.out.println();
		if(flag==false){
		
			System.out.println("No composite  number in the array");

		}
		System.out.println("End the code ");
            
        }
}
*/

//Q.8) WAP to find the second minimum element in the array 
//
/*
import java .io.*;
class eight{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of arra ");
                int N=Integer.parseInt(br.readLine());
                int arr5[]=new int[N];
                System.out.println("Enterthe elemenet in the array ");
                for(int i=0;i<N;i++){

                        arr5[i]=Integer.parseInt(br.readLine());

		}
		int minele=Integer.MAX_VALUE;
		for(int i=0;i<N;i++){
		
			if(arr5[i]<minele){
			
				minele=arr5[i];
			}
		}
                int min2ele=Integer.MAX_VALUE;
		for(int i=0;i<N;i++){
		
			if(arr5[i]<min2ele && arr5[i]>minele){
			
				min2ele=arr5[i];
			}
		}
		System.out.println();
		System.out.println("The second  minimum elemenet in the array is :- "+min2ele);


	}
}
*/

//Q.9) WAP to take numner from the user and store each element in an array by increasing the element by one

/*
import java .io.*;
class nine{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number ");
                int num=Integer.parseInt(br.readLine());
                int count=0;
		int num2=num;
		while(num>0){
		
			count++;
			num=num/10;
		}
                
		
		int arr5[]=new int[count];
                System.out.println("Add the  1 in the element  in the array ");

                for(int i=count-1;i>=0;i--){

                          int rem=num2%10;
                          arr5[i]=rem+1;
                          num2=num2/10;			  
		}
		System.out.println();
		for(int i=0;i<count;i++){
		
			System.out.print(arr5[i]+"  ");

		}
		System.out.println();

        }
}
*/

//Q.10) WAP to print the factorial of each element in the array
//
/*
import java .io.*;
class ten{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of arra ");
                int N=Integer.parseInt(br.readLine());
                int arr5[]=new int[N];
                System.out.println("Enterthe elemenet in the array ");
                for(int i=0;i<N;i++){

                        arr5[i]=Integer.parseInt(br.readLine());

                }
		for(int i=0;i<N;i++){
		
                        int num=arr5[i];
			int fact=1;
			while(num>1){

				fact=fact*num;
				num--;

				
			}
			System.out.print(fact+" , ");
		}
		System.out.println();

	}
}
*/


