//Q.1) 
//  *
//  *  *
//  *  *  *
//  *  *  *  *
/*
import java.io.*;
class one{

	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numberof rows :- ");
		int N=Integer.parseInt(br.readLine());
		for(int i=1;i<=N;i++){
		
			for(int j=1;j<=i;j++){
			
				System.out.print("*  ");
			}
			System.out.println();
		}

	}
}
*/
//Q.2)
// rows =3                   rows=4
//  9                        16
//  9  9                     16  16
//  9  9  9                  16  16  16
//                           16  16  16  16
/*
import java.io.*;
class two{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the numberof rows :- ");
                int N=Integer.parseInt(br.readLine());
		
                for(int i=1;i<=N;i++){

                        for(int j=1;j<=i;j++){

                                System.out.print(N*N+"  ");
                        }
                        System.out.println();
                }

        }
}
*/
//Q.3)
// a             a
// $ $           $ $
// a b c         a b c
//               $ $ $ $
/*
import java.io.*;
class three{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());

                for(int i=1;i<=N;i++){
                        int ch=97;
                        for(int j=1;j<=i;j++){
                               if(i%2==1){
                                	System.out.print((char)ch +"  ");
					ch++;
                                        
				}else{
				
					System.out.print("$  ");
				}
                        }
                        System.out.println();
                }

        }
}
*/
//Q.4)
// C
// C  B  
// C  B  A
// TAKE INPUT OF ROWS FROM USER 
/*
import java.io.*;
class four{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());

                for(int i=1;i<=N;i++){
                        int ch=64+N;
                        for(int j=1;j<=i;j++){
                               System.out.print((char)ch +"  ");
                                ch--;

                          
                        }
                        System.out.println();
                }

        }
}
*/
//Q.5)
// c
// C  B
// c  b  a
/*
import java.io.*;
class five{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());

                for(int i=1;i<=N;i++){
                        int ch1=64+N;
			int ch2=96+N;
                        for(int j=1;j<=i;j++){
                               if(i%2==1){
					System.out.print((char)ch2 +"  ");
                                	ch2--;
                               }else{
			       
				       System.out.print((char)ch1+"  ");
				       ch1--;
			       }

                        }
                        System.out.println();
                }

        }
}
*/
//Q.6)
//row=3
// D
// E F
// G H I
/*
import java.io.*;
class six{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());
                int ch=65+N;
                for(int i=1;i<=N;i++){
                        
                        for(int j=1;j<=i;j++){
                               System.out.print((char)ch +"  ");
                                ch++;


                        }
                        System.out.println();
                }

        }
}
*/
//Q.7)
// 1
// B C
// 1 2 3
// G H I J
/*
import java.io.*;
class seven{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());
                int ch=65;
		
                for(int i=1;i<=N;i++){
                        int num=1;
                        for(int j=1;j<=i;j++){
                               if(i%2==1){
					System.out.print(num +"  ");
                                	num++;

				}else{
			            System.out.print((char)ch+"  ");
			           


				}
			       ch++;


                        }
                        System.out.println();
                }

        }
}
*/
//Q.8)
// 1
// 2 a
// 3 b 3
// 4 c 4 d
/*
import java.io.*;
class eight{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());
                int ch=97;
		int num=1;

		for(int i=1;i<=N;i++){
		
		
			for (int j=1;j<=i;j++){
			
				if(j%2==1){
					System.out.print(num+"  ");
                                        
				}else{
				
					System.out.print((char)ch+"  ");
					ch++;
				}
			}
			num++;System.out.println();
		}

                

        }
}
*/
//Q.9)
//  1
//  1  c
//  1  e  3
//  1  g  3  i
/*
import java.io.*;
class nine{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());
                int ch=97;
                int num=1;

                for(int i=1;i<=N;i++){

                        num=1;
                        for (int j=1;j<=i;j++){

                                if(j%2==1){
                                        System.out.print(num+"  ");

                                }else{

                                        System.out.print((char)ch+"  ");
                                       
                                }
				num++;ch++;
                        }
                        num++;System.out.println();
                }



        }
}
*/
//Q.10)
// 5
// 5 a
// 5 b 7
// 5 c 7 d
// 5 e 7 f
/*
import java.io.*;
class ten{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());
                int ch=97;
                

                for(int i=1;i<=N;i++){

                        int num=N;
                        for (int j=1;j<=i;j++){

                                if(j%2==1){
                                        System.out.print(num+"  ");

                                }else{

                                        System.out.print((char)ch+"  ");
                                        ch++;
                                }
                                num++;
                        }
                        ;System.out.println();
                }
        }
}
*/
//Q.11) 
//  1
//  b  c
//  4  5  6
//  g  h  i  j


import java.io.*;
class eleven{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());
                int ch=97;
                int num=1;

                for(int i=1;i<=N;i++){

                        
                        for (int j=1;j<=i;j++){

                                if(i%2==1){
                                        System.out.print(num+"  ");

                                }else{

                                        System.out.print((char)ch+"  ");
                                        
                                }
                                num++;ch++;
                        }
                        ;System.out.println();
                }
        }
}


