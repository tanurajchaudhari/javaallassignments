//Q.1) WAP to take numbers from user in 2d array and print it
/*
import java.io.*;
class one{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of row :- ");	
		int row=Integer.parseInt(br.readLine());

		System.out.println("Enter the length of  column :- ");	
		int col=Integer.parseInt(br.readLine());
                
		int arr7[][]=new int[row][col];
		System.out.println("Ente the element in the 2 d array : ");
		for(int i=0;i<row;i++){
		
			for(int j=0;j<col;j++){
			
				arr7[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println();
		System.out.println("Print the 2 d array ");

		for(int i=0;i<row;i++){
		
			for(int j=0;j<col;j++){
			
				System.out.print(arr7[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();

	}
}
*/

//Q.2) WAP to take numbers from user in a 2d array and print the sum of the array 
/*
import java.io.*;
class two{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of row :- ");
                int row=Integer.parseInt(br.readLine());

                System.out.println("Enter the length of  column :- ");
                int col=Integer.parseInt(br.readLine());

                int arr7[][]=new int[row][col];
                System.out.println("Ente the element in the 2 d array : ");
                for(int i=0;i<row;i++){

                        for(int j=0;j<col;j++){

                                arr7[i][j]=Integer.parseInt(br.readLine());
                        }
                }
                System.out.println();
                System.out.println("Print the 2 d array ");
                 int sum=0;
                for(int i=0;i<row;i++){

                        for(int j=0;j<col;j++){

                                System.out.print(arr7[i][j]+"\t");
				sum=sum+arr7[i][j];
                        }
                        System.out.println();
                }
                System.out.println("The sum of array is :- "+ sum);

        }
}
*/

//Q.#) WAP to take numbers from user in 2 d array and print  the sum of each row in the array
//
/*
import java.io.*;
class three{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of row :- ");
                int row=Integer.parseInt(br.readLine());
                System.out.println("Enter the length of  column :- ");
                int col=Integer.parseInt(br.readLine());
                int arr7[][]=new int[row][col];
                System.out.println("Ente the element in the 2 d array : ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                arr7[i][j]=Integer.parseInt(br.readLine());
                        }
                }
                System.out.println();
                System.out.println("Print the 2 d array ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                System.out.print(arr7[i][j]+"\t");
                        }
                        System.out.println();
                }
                System.out.println();
                for(int i=0;i<row;i++){
                         int sum=0;
                        for(int j=0;j<col;j++){
                                sum=sum+arr7[i][j];
                        }
                        System.out.println("the sum of "+i+"  row element is :- "+sum);
                }
                System.out.println();
        }
}
*/

//Q.4) WAP to take numbers from a user in 2 d array and print the sum odd rows  in the array.
 /*
import java.io.*;
class four{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of row :- ");
                int row=Integer.parseInt(br.readLine());
                System.out.println("Enter the length of  column :- ");
                int col=Integer.parseInt(br.readLine());
                int arr7[][]=new int[row][col];
                System.out.println("Ente the element in the 2 d array : ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                arr7[i][j]=Integer.parseInt(br.readLine());
                        }
                }
                System.out.println();
                System.out.println("Print the 2 d array ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                System.out.print(arr7[i][j]+"\t");
                        }
                        System.out.println();
                }
                System.out.println();
                for(int i=0;i<row;i++){
                         int sum=0;
                      if(i%2==1){
		       	 for(int j=0;j<col;j++){
                                sum=sum+arr7[i][j];
                        }
                        System.out.println("the sum of "+i+"  row element is :- "+sum);
		       }
                }
                System.out.println();
        }
}
*/

//Q.5) //Q.4) WAP to take numbers from a user in 2 d array and print the sum each column   in the array.
/*
import java.io.*;
class five{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of row :- ");
                int row=Integer.parseInt(br.readLine());
                System.out.println("Enter the length of  column :- ");
                int col=Integer.parseInt(br.readLine());
                int arr7[][]=new int[row][col];
                System.out.println("Ente the element in the 2 d array : ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                arr7[i][j]=Integer.parseInt(br.readLine());
                        }
                }
                System.out.println();
                System.out.println("Print the 2 d array ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                System.out.print(arr7[i][j]+"\t");
                        }
                        System.out.println();
                }
                System.out.println();
                for(int i=0;i<col;i++){
                         int sum=0;
			 for(int j=0;j<row;j++){
			 
				 sum=sum+arr7[j][i];
			 }
			 System.out.println();
			 System.out.println("sum of column "+i+" is :- "+ sum);
                         
                }
                System.out.println();
        }
}
*/

//Q.6)WAP to take number from users  in 2d array and print element in the array which is divisible by 3.
/*
import java.io.*;
class six{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of row :- ");
                int row=Integer.parseInt(br.readLine());
                System.out.println("Enter the length of  column :- ");
                int col=Integer.parseInt(br.readLine());
                int arr7[][]=new int[row][col];
                System.out.println("Ente the element in the 2 d array : ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                arr7[i][j]=Integer.parseInt(br.readLine());
                        }
                }
                System.out.println();
                System.out.println("Print the 2 d array ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                System.out.print(arr7[i][j]+"\t");
                        }
                        System.out.println();
                }
                System.out.print("the elemenet which is divisible by 3 :-");
                for(int i=0;i<row;i++){
                         for(int j=0;j<col;j++){
                             if(arr7[i][j]%3==0){
			     
				     System.out.print(arr7[i][j]+" , ");
			     }
                        }
                     
                      
                }
                System.out.println();
        }
}
*/
//Q.7) WAP to take number from users  in 2d array and print the prduct of the primary diagonal of an array 
/*
import java.io.*;
class seven{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of row :- ");
                int row=Integer.parseInt(br.readLine());
                System.out.println("Enter the length of  column :- ");
                int col=Integer.parseInt(br.readLine());
                int arr7[][]=new int[row][col];
                System.out.println("Ente the element in the 2 d array : ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                arr7[i][j]=Integer.parseInt(br.readLine());
                        }
                }
                System.out.println();
                System.out.println("Print the 2 d array ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                System.out.print(arr7[i][j]+"\t");
                        }
                        System.out.println();
                }
                int product=1;
                for(int i=0;i<row;i++){
                         for(int j=0;j<col;j++){
                             if(i==j){

                                    product=product*arr7[i][j];
                             }
                        }
                }
                System.out.println("the product of primary diagonale is :- "+product);
        }
}
*/

//Q.8) WAP to take number from users  in 2d array and print the prduct of the secondary diagonal of an array
/*
import java.io.*;
class eight{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of row :- ");
                int row=Integer.parseInt(br.readLine());
                System.out.println("Enter the length of  column :- ");
                int col=Integer.parseInt(br.readLine());
                int arr7[][]=new int[row][col];
                System.out.println("Ente the element in the 2 d array : ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                arr7[i][j]=Integer.parseInt(br.readLine());
                        }
                }
                System.out.println();
                System.out.println("Print the 2 d array ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                System.out.print(arr7[i][j]+"\t");
                        }
                        System.out.println();
                }
                int sum=0;
                for(int i=0;i<row;i++){
                         for(int j=0;j<col;j++){
                             if((i+j)==2){
                                            
                                    sum=sum+arr7[i][j];
                             }
                        }
                }
                System.out.println("the  sum of secondary diagonale is :- "+sum);
        }
}
*/

//Q.9) WAP to take  numbers from a user in 2d array  and prit the product of sum of primaray and secondary diagonal array.
/*
import java.io.*;
class nine{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of row :- ");
                int row=Integer.parseInt(br.readLine());
                System.out.println("Enter the length of  column :- ");
                int col=Integer.parseInt(br.readLine());
                int arr7[][]=new int[row][col];
                System.out.println("Ente the element in the 2 d array : ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                arr7[i][j]=Integer.parseInt(br.readLine());
                        }
                }
                System.out.println();
                System.out.println("Print the 2 d array ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                System.out.print(arr7[i][j]+"\t");
                        }
                        System.out.println();
                }
                int sump=0;int product=1;int sums=0;
                for(int i=0;i<row;i++){
                         for(int j=0;j<col;j++){
                             if((i+j)==2){

                                    sums=sums+arr7[i][j];
                             }
			     if(i==j){
			     
				     sump=sump+arr7[i][j];
				     
			     }
                        }
                }
		
                System.out.println("the  sum of primary  diagonale is :- "+sump+" and sum of secondary diagonal is "+sums+" And product of both sum diagonal is "+sump*sums);
        }
}

*/

//Q.10) WAP to take  numbers from a user in 2d array and print the corner element  of the array 
//
/*
import java.io.*;
class ten{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of row :- ");
                int row=Integer.parseInt(br.readLine());
                System.out.println("Enter the length of  column :- ");
                int col=Integer.parseInt(br.readLine());
                int arr7[][]=new int[row][col];
                System.out.println("Ente the element in the 2 d array : ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                arr7[i][j]=Integer.parseInt(br.readLine());
                        }
                }
                System.out.println();
                System.out.println("Print the 2 d array ");
                for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                                System.out.print(arr7[i][j]+"\t");
                        }
                        System.out.println();
                }
            ;
                for(int i=0;i<row;i++){
                         for(int j=0;j<col;j++){
                             if((i==0&&(j==0||j==col-1))||(i==row-1&&(j==0||j==col-1))){
				    
				     System.out.print( arr7[i][j]+"  ");
                             }
                        }
                }
		System.out.println();

                
        }
}
*/


