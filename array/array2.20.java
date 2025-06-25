//Q.1)  WAP to count the even numbers and print the even numbers and count also
//
/*
import java.io.*;
class one{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of array :-  ");
		int N=Integer.parseInt(br.readLine());
		int count=0;
		int arr2[]=new int[N];
                System.out.println("Enter the element in the array ;- ");
		for(int i=0;i<N;i++){
		
			arr2[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Print the even numbers in the  array ");
		for(int i=0;i<N;i++){
		      
			if(arr2[i]%2==0){
			
				count++;
				System.out.print(arr2[i]+"  ");
			}
		}
		System.out.println();
		System.out.println("Count of even numbers is  "+ count);	
	}
}
*/

//Q.2)WAP to print the sum of the elements divisible by  3 in the array
/*
import java.io.*;
class two{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :-  ");
                int N=Integer.parseInt(br.readLine());
                int sum=0;
                int arr2[]=new int[N];
                System.out.println("Enter the element in the array ;- ");
                for(int i=0;i<N;i++){

                        arr2[i]=Integer.parseInt(br.readLine());
                }
                System.out.println("Print the even numbers in the  array ");
                for(int i=0;i<N;i++){

                        if(arr2[i]%3==0){

                                sum=sum+arr2[i];
                                System.out.print(arr2[i]+"  ");
                        }
                }
                System.out.println();
                System.out.println("sum  of even numbers is  "+ sum);
        }
}
*/

//Q.3) WAP to check  if there is any  vowel  in the array  of characters  if present  then print its index 
/*
import java.io.*;
class three{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :-  ");
                int N=Integer.parseInt(br.readLine());
                
                char arr2[]=new char[N];
                System.out.println("Enter the element in the array ;- ");
                for(int i=0;i<N;i++){

                        arr2[i]=(br.readLine().charAt(0));
                }
               
                for(int i=0;i<N;i++){

                        if((arr2[i]=='A' )|| arr2[i]=='a'){

                               System.out.println("vowel "+arr2[i]+" Founds at index "+i);
                               
                        }else if((arr2[i]=='E')||(arr2[i]=='e')){
			          
                               System.out.println("vowel "+arr2[i]+" Founds at index "+i);
			
			}else if((arr2[i]=='I')||(arr2[i]=='i')){
				
                               System.out.println("vowel "+arr2[i]+" Founds at index "+i);
			
			}else if((arr2[i]=='O')||(arr2[i]=='o')){
			

                               System.out.println("vowel "+arr2[i]+" Founds at index "+i);

			}else if((arr2[i]=='U')||(arr2[i]=='u')){
			
                               System.out.println("vowel "+arr2[i]+" Founds at index "+i);

                         
			}
		}
                System.out.println();
                //System.out.println("sum  of even numbers is  "+ sum);
        }
} 
*/

//Q.4)  WAp to search a specific element in the array and return its index 
/*
import java.io.*;
class four{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :-  ");
                int N=Integer.parseInt(br.readLine());
                int sum=0;
                int arr2[]=new int[N];
                System.out.println("Enter the element in the array ;- ");
                for(int i=0;i<N;i++){

                        arr2[i]=Integer.parseInt(br.readLine());
                }
                System.out.println("Enter the element in  the arra u want to search ");
		int key=Integer.parseInt(br.readLine());
                for(int i=0;i<N;i++){

                        if(arr2[i]==key){

                                
                                System.out.print(arr2[i]+" found at index  "+ i);
                        }
                }
                System.out.println();
              
        }
}
*/

//Q.5) WAp to print a sum of odd index element in the array 
/*
import java.io.*;
class five{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :-  ");
                int N=Integer.parseInt(br.readLine());
                int sum=0;
                int arr2[]=new int[N];
                System.out.println("Enter the element in the array ;- ");
                for(int i=0;i<N;i++){

                        arr2[i]=Integer.parseInt(br.readLine());
                }
                
                for(int i=0;i<N;i++){

                        if(i%2==1){

                                sum=sum+arr2[i];
                                
   			}
                }
                System.out.println();
                System.out.println("sum  of odd index element is  "+ sum);
        }
}
*/

//Q.6) WAp to print a product  of odd index element in the array
/*
import java.io.*;
class six{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :-  ");
                int N=Integer.parseInt(br.readLine());
                int product=1;
                int arr2[]=new int[N];
                System.out.println("Enter the element in the array ;- ");
                for(int i=0;i<N;i++){

                        arr2[i]=Integer.parseInt(br.readLine());
                }

                for(int i=0;i<N;i++){

                        if(i%2==1){

                                product=product*arr2[i];

                        }
                }
                System.out.println();
                System.out.println("product  of odd index element is  "+ product);
        }
}
*/

//Q.7) WAp to print array,if the user given size of the arrray is even then print alternat elements in the array ,else print whole array
/*
import java.io.*;
class seven{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :-  ");
                int N=Integer.parseInt(br.readLine());
           
                int arr2[]=new int[N];
                System.out.println("Enter the element in the array ;- ");
                for(int i=0;i<N;i++){

                        arr2[i]=Integer.parseInt(br.readLine());
                }
                System.out.println("Array elements are ");
                if(N%2==1){
		
			for(int i=0;i<N;i++){
			
				System.out.print(arr2[i]+"  ");
			}
		
		}else{
			for(int i=0;i<N;){
				System.out.print(arr2[i]+"  ");
				i=i+2;
			}
		}
                System.out.println();
          }
}
*/

//Q.8)  WAP to print the element in the array which greater than 5 and less than 9.
//
/*
import java.io.*;
class eight{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :-  ");
                int N=Integer.parseInt(br.readLine());

                int arr2[]=new int[N];
                System.out.println("Enter the element in the array ;- ");
                for(int i=0;i<N;i++){

                        arr2[i]=Integer.parseInt(br.readLine());
                }
                System.out.println("Array elements are ");
                for(int i=0;i<N;i++){
		
			if(arr2[i]<9&&arr2[i]>5){
			
				System.out.print(arr2[i]+"  ");
			}
		}
                System.out.println();
          }
}

*/


//Q.9)  WAP  to print the minimum element in the array 

/*
import java.io.*;
class nine{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :-  ");
                int N=Integer.parseInt(br.readLine());

                int arr2[]=new int[N];
                System.out.println("Enter the element in the array ;- ");
                for(int i=0;i<N;i++){

                        arr2[i]=Integer.parseInt(br.readLine());
                }
		int minvalue=Integer.MAX_VALUE;

                System.out.println("Array elements are ");
                for(int i=0;i<N;i++){
                      
			if(arr2[i]<minvalue){
			
				minvalue=arr2[i];
			
			}
                       
                }
                System.out.println("Minimum element in the array is "+minvalue);
	
          }
}
*/

//q.10)  WAP to print a maximum element in the array
/*
import java.io.*;
class ten{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :-  ");
                int N=Integer.parseInt(br.readLine());

                int arr2[]=new int[N];
                System.out.println("Enter the element in the array ;- ");
                for(int i=0;i<N;i++){

                        arr2[i]=Integer.parseInt(br.readLine());
                }
                int maxvalue=Integer.MIN_VALUE;

                System.out.println("Array elements are ");
                for(int i=0;i<N;i++){

                        if(arr2[i]>maxvalue){

                                maxvalue=arr2[i];

                        }

                }
                System.out.println("Maximum  element in the array is "+maxvalue);

          }
}
*/





























