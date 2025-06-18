//Q.1)  
//  1  2  3  4
//  2  3  4
//  3  4
//  4
//
/*
import java.util.*;
class one{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numebr of rows : -  ");
		int N=sc.nextInt();
		int N1=N;
		for(int i=1;i<=N;i++){
		
			int num=i;
			
			for(int j=1;j<=N1;j++){
			
				System.out.print(num+"  ");
				num++;
			}
			N1--;
			System.out.println();

		}
	}

}
*/

//Q.2) 
//   2   4   6   8
//   10  12  14 
//   16  18  
//   20
/*
import java.util.*;
class two{

        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the numebr of rows : -  ");
                int N=sc.nextInt();
                int N1=N;
		int num=2;
                for(int i=1;i<=N;i++){

                        

                        for(int j=1;j<=N1;j++){

                                System.out.print(num+"  ");
                                num=num+2;
                        }
                        N1--;
                        System.out.println();

                }
        }

}
*/

//Q.3)  
//     20  18  16  14
//     12  10  8
//     6   4
//     2
/*
import java.util.*;
class three{

        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the numebr of rows : -  ");
                int N=sc.nextInt();
                int N1=N;
		int num= N*(N+1);
                for(int i=1;i<=N;i++){

                       

                        for(int j=1;j<=N1;j++){

                                System.out.print(num+"  ");
                                num=num-2;
                        }
                        N1--;
                        System.out.println();

                }
        }

}
*/

// Q.4)
//   F  E  D
//   C  B
//   A
/*
import java.util.*;
class four{

        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the numebr of rows : -  ");
                int N=sc.nextInt();
                int N1=N;
		int num=N*(N+1)/2;
                int ch=64+ num;
                for(int i=1;i<=N;i++){



                        for(int j=1;j<=N1;j++){

                                System.out.print((char)ch+"  ");
				ch--;
                                
                        }
                        N1--;
                        System.out.println();

                }
        }

}
*/

//Q.5)
//   A  B  C
//   a  b
//   A
/*
import java.util.*;
class five{

        public static void main(String[]args)cc{

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the numebr of rows : -  ");
                int N=sc.nextInt();
                int N1=N;                
		
                for(int i=1;i<=N;i++){

                        int  CH=65;
			int ch=97;

                        for(int j=1;j<=N1;j++){

                                if(i%2==1){
					System.out.print((char)CH+"  ");
					CH++;
                                
				}else{
				
					System.out.print((char)ch+"  ");
					ch++;
				}
                        }
                        N1--;
                        System.out.println();

                }
        }

}
*/

//Q.6) 
//   1  a  2
//   1  a
//   1
/*
import java.util.*;
class six{

        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the numebr of rows : -  ");
                int N=sc.nextInt();
                int N1=N;

                for(int i=1;i<=N;i++){

                        int ch=97;
			int num=1;

                        for(int j=1;j<=N1;j++){

                                if(j%2==1){
                                        System.out.print(num+"  ");
                                        num++;        

                                }else{

                                        System.out.print((char)ch+"  ");
                                        ch++;
                                }
				
                        }
                        N1--;
                        System.out.println();

                }
        }

}
*/
//Q.7) 
//  4  c  2  a
//  3  b  1
//  2  a
//  1
/*
import java.util.*;
class seven{

        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the numebr of rows : -  ");
                int N=sc.nextInt();
                int N1=N;
                
                for(int i=1;i<=N;i++){
                        int num=N1;
                        int ch=96+N1;
                        

                        for(int j=1;j<=N1;j++){

                                if(j%2==1){
                                        System.out.print(num+"  ");
                                        

                                }else{

                                        System.out.print((char)ch+"  ");
                                      
                                }
				num--;ch--;

                        }
                        N1--;
			
                        System.out.println();

                }
        }
}
*/
// Q.8)
//  4  3  2  1
//  C  B  A
//  2  1
//  A
/*
import java.util.*;
class 	eight{

        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the numebr of rows : -  ");
                int N=sc.nextInt();
                int N1=N;

                for(int i=1;i<=N;i++){
                        int num=N1;
                        int ch=64+N1;


                        for(int j=1;j<=N1;j++){

                                if(i%2==1){
                                        System.out.print(num+"  ");


                                }else{

                                        System.out.print((char)ch+"  ");

                                }
                                num--;ch--;

                        }
                        N1--;

                        System.out.println();

                }
        }
}
*/

//Q.9) 
//  19  17  15  13
//  11  9   7   
//  5   3
//  1   
/*
import java.util.*;
class   nine{

        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the numebr of rows : -  ");
                int N=sc.nextInt();
                int N1=N;
                int num=(N*(N+1))-1;
                for(int i=1;i<=N;i++){
                        
                      for(int j=1;j<=N1;j++){

                              System.out.print(num+"  ");
                              num=num-2;

                        }
                        N1--;

                        System.out.println();

                }
        }
}

*/

//Q.10)
//    D  C  B  A
//    c  b  a
//    B  A
//    a

import java.util.*;
class   ten{

        public static void main(String[]args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the numebr of rows : -  ");
                int N=sc.nextInt();
                int N1=N;
                
                for(int i=1;i<=N;i++){
                      int CH=64+N1;
		      int ch=96+N1;
                      for(int j=1;j<=N1;j++){
                            if( i%2==1 ){
                              	 System.out.print((char)CH+"  ");
				 CH--;
                            }else{
			    
				    System.out.print((char)ch+"  ");
				    ch--;
			    }
                        }
                        N1--;

                        System.out.println();

                }
        }
}






















