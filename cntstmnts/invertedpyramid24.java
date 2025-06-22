//Q.0)   rows =4
//    *   *   *   *   *   *   *
//        *   *   *   *   *
//            *   *   *
//                *
/*
import java.util.*;

class zero{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows : - ");
		int N=sc.nextInt();
		int N1=N+(N-1);
		for(int i=1;i<=N;i++){
		       int x=i-1;
			for(int j=1;j<=N1;j++){
			     if(j<=x){
			     
				     System.out.print(" "+"\t");
			     }else{
			     
				     System.out.print("*"+"\t");
			     }
			}
			N1--;
			System.out.println();
		}
	}
}
*/

//Q.1)      1      1      1     1      1     1     1
//                 1      1     1      1     1
//                        1     1      1
//                              1
/*
import java.util.*;
class one{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows : - ");
                int N=sc.nextInt();
                int N1=N+(N-1);
                for(int i=1;i<=N;i++){
                       int x=i-1;
                        for(int j=1;j<=N1;j++){
                             if(j<=x){

                                     System.out.print(" "+"\t");
                             }else{

                                     System.out.print("1"+"\t");
                             }
                        }
                        N1--;
                        System.out.println();
                }
        }
}

*/

//Q.2)    1    2    3   4   5   6    7
//             8    9   10  11  12
//                  13  14  15  
//                      16
//
/*
import java.util.*;
class two{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows : - ");
                int N=sc.nextInt();
                int N1=N+(N-1);
		int num=1;
                for(int i=1;i<=N;i++){
                       int x=i-1;
                        for(int j=1;j<=N1;j++){
                             if(j<=x){

                                     System.out.print(" "+"\t");
                             }else{

                                     System.out.print(num+"\t");
				     num++;

                             }
                        }
                        N1--;
                        System.out.println();
                }
        }
}
*/

//Q.3)    4    4   4    4   4    4    4
//             3   3    3   3    3
//                 2    2   2
//                      1
/*
import java.util.*;
class three{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows : - ");
                int N=sc.nextInt();
                int N1=N+(N-1);
		int num=N;
                for(int i=1;i<=N;i++){
                       int x=i-1;
                        for(int j=1;j<=N1;j++){
                             if(j<=x){

                                     System.out.print(" "+"\t");
                             }else{

                                     System.out.print(num+"\t");
                             }
                        }
                        N1--;
			num--;
                        System.out.println();
                }
        }
}
*/

//Q.4)   1   2   3   4    5   6   7
//           1   2   3    4   5
//               1   2    3
//                   1
/*
import java.util.*;
class four{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows : - ");
                int N=sc.nextInt();
                int N1=N+(N-1);
                
                for(int i=1;i<=N;i++){
                       int x=i-1;int num=1;
                        for(int j=1;j<=N1;j++){
				
                             if(j<=x){

                                     System.out.print(" "+"\t");
                             }else{

                                     System.out.print(num+"\t");
				     num++;
                             }
                        }
                        N1--;
                       
                        System.out.println();
                }
        }
}
*/

//Q.5)    A     A     A     A     A     A     A
//              B     B     B     B     B 
//                    C     C     C
//                          D
//
/*
import java.util.*;
class five{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows : - ");
                int N=sc.nextInt();
                int N1=N+(N-1);
                int ch=65;
                for(int i=1;i<=N;i++){
                       int x=i-1;
                        for(int j=1;j<=N1;j++){
                                  
                             if(j<=x){

                                     System.out.print(" "+"\t");
                             }else{

                                     System.out.print((char)ch+"\t");
                                     
                             }
                        }
                        N1--;
                        ch++;
                        System.out.println();
                }
        }
}
*/

//Q.6)  D   D    D    D   D    D    D
//          C    C    C   C    C
//               B    B   B
//                    A
//
//
/*
import java.util.*;
class six{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows : - ");
                int N=sc.nextInt();
                int N1=N+(N-1);
                int ch=64+N;
                for(int i=1;i<=N;i++){
                       int x=i-1;
                        for(int j=1;j<=N1;j++){

                             if(j<=x){

                                     System.out.print(" "+"\t");
                             }else{

                                     System.out.print((char)ch+"\t");

                             }
                        }
                        N1--;
                        ch--;
                        System.out.println();
                }
        }
}
*/

//Q.7)     A    B    C    D   C   B   A
//              A    B    C   B   A
//                   A    B   A
//                        A
//
/*
import java.util.*;
class seven{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows : - ");
                int N=sc.nextInt();
                int N1=N+(N-1);
                
                for(int i=1;i<=N;i++){
                       int x=i-1;
		       int ch=65;
                        for(int j=1;j<=N1;j++){

                             if(j<=x){

                                     System.out.print(" "+"\t");
                             }else{
                                 if(j<=N){
                                       System.out.print((char)ch+"\t");
				       ch++;
				   }else{
				   
					   if(j==N+1){
					   
						   ch--;
					   }
					   System.out.print((char)--ch+"\t");
					  
					   
				   }

                             }
                        }
                        N1--;
                        
                        System.out.println();
                }
        }
}
*/


//Q.8)  1   2   3  4  3  2  1
//          2   3  4  3  2
//              3  4  3
//                 4
//
//
/*
import java.util.*;
class  eight{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows : - ");
                int N=sc.nextInt();
                int N1=N+(N-1);

                for(int i=1;i<=N;i++){
                       int x=i-1;
                       int ch=i;
                        for(int j=1;j<=N1;j++){

                             if(j<=x){

                                     System.out.print(" "+"\t");
                             }else{
                                 if(j<=N){
                                       System.out.print(ch+"\t");
                                       ch++;
                                   }else{

                                           if(j==N+1){

                                                   ch--;
                                           }
                                           System.out.print(--ch+"\t");


                                   }

                             }
                        }
                        N1--;

                        System.out.println();
                }
        }
}
*/

//Q.9)      1   0   1    0    1    0     1
//              1   0    1    0    1
//                  1    0    1
//                       1
/*
import java.util.*;
class  nine{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows : - ");
                int N=sc.nextInt();
                int N1=N+(N-1);

                for(int i=1;i<=N;i++){
                       int x=i-1;
		       int ch=1;
                       
                        for(int j=1;j<=N1;j++){

                             if(j<=x){

                                     System.out.print(" "+"\t");
                             }else{
                                 if(ch==1){
                                       System.out.print(ch+"\t");
                                       ch=0;
                                   }else{

                                         System.out.print(ch+"\t");
                                          ch=1;					 
                                   }

			     }
                        }
                        N1--;

                        System.out.println();
                }
        }
}
*/

//Q.10)  
//     4    3    2    1     2    3    4
//          3    2    1     2    3
//               2    1     2
//                    1
//
//
/*
import java.util.*;
class  ten{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows : - ");
                int N=sc.nextInt();
                int N1=N+(N-1);

                for(int i=1;i<=N;i++){
                       int x=i-1;
                       int ch=N-i+1;
                        for(int j=1;j<=N1;j++){

                             if(j<=x){

                                     System.out.print(" "+"\t");
                             }else{
                                 if(j<=N){
                                       System.out.print(ch+"\t");
                                       ch--;
                                   }else{

                                           if(j==N+1){

                                                   ch++;
                                           }
                                           System.out.print(++ch+"\t");


                                   }

                             }
                        }
                        N1--;

                        System.out.println();
                }
        }
}
*/



