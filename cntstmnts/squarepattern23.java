//Q.1) rows=3                  rows=4
//     C  d  e                 D    e   f   g
//     F  g  h                 H    i   j   k
//     I  j  k                 L    m   n   o
//                             P    q   r   s
/*
import java.util.*;

class one {

	public static void main(String[]args){
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows :- ");
		int N=sc.nextInt();
                int ch=96+N;
		int CH=64+N;
		for(int i=1;i<=N;i++){
		
			for(int j=1;j<=N;j++){
			
				if(j==1){
				
					System.out.print((char)CH+"\t");
				}else{
					System.out.print((char)ch+"\t");
				}
				CH++;ch++;
			}
			System.out.println();
		}
	}
}
*/
//Q.2)       d   E   F  G
//           h   I   J  K
//           l   M   N  O
//           p   Q   R  S
/*
import java.util.*;

class two{


        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows :- ");
                int N=sc.nextInt();
                int ch=96+N;
                int CH=64+N;
                for(int i=1;i<=N;i++){

                        for(int j=1;j<=N;j++){

                                if(j>1){

                                        System.out.print((char)CH+"\t");
                                }else{
                                        System.out.print((char)ch+"\t");
                                }
                                CH++;ch++;
                        }
                        System.out.println();
                }
        }
}
*/
//Q.3)    
//   d   5   f   7
//   8   i   10  k
//   l   13  n   15
//   16  q   18  s
/*
import java.util.*;
class three{


        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows :- ");
                int N=sc.nextInt();
                int ch=96+N;
                int num=N;
                for(int i=1;i<=N;i++){

                        for(int j=1;j<=N;j++){

                                if((i%2==1&&j%2==0)||(i%2==0&&j%2==1)){

                                        System.out.print(num+"\t");
                                }else{
                                        System.out.print((char)ch+"\t");
                                }
                                num++;ch++;
                        }
                        System.out.println();
                }
        }
}
*/

//Q.4)    &   &    &    &
//        &   $    &    $
//        &   &    &    &
//        &   $    &    $
/*
import java.util.*;
class four{


        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows :- ");
                int N=sc.nextInt();
                
            
                for(int i=1;i<=N;i++){

                        for(int j=1;j<=N;j++){

                                if(i%2==0&&j%2==0){

                                        System.out.print("$"+"\t");
                                }else{
                                        System.out.print("&"+"\t");
                                }
                                
                        }
                        System.out.println();
                }
        }
}
*/

//Q.5)       4    $   5   $
//           6    6   6   6
//           6    $   7   $
//           8    8   8   8
/*
import java.util.*;
class five{
        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows :- ");
                int N=sc.nextInt();
                int num=N;

                for(int i=1;i<=N;i++){

                        for(int j=1;j<=N;j++){

                                if(i%2==1&&j%2==0){

                                        System.out.print("$"+"\t");
                                }else{
                                        if(i%2==0){
					
						System.out.print(num+"\t");
					}else{
					
						System.out.print(num+"\t");
						num++;
					}
                                }

                        }
                        System.out.println();
                }
        }
}
*/

//Q.6)  rows=3                            rows=4
//      9   8   7                         16    15    14    13
//      9   4   4                         16    11    11    6
//      9   8   7                         16    15    14    13
//                                        16    11    11    6
//
/*
import java.util.*;
class six{
        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows :- ");
                int N=sc.nextInt();
                

                for(int i=1;i<=N;i++){
                        int num=N*N;
                        for(int j=1;j<=N;j++){

                                if(i%2==0&&j%2==0){
                                        num=num-4;
                                        System.out.print(num+"\t");
                                }else{
                                         
                                        System.out.print(num+"\t");
					num--;
                                }
                        }
                       System.out.println();
                 }
          }
}
*/


//Q.7)   rows=3                              rows=4
//       8     16     24                     15     25      35    49
//       36    49     64                     64     81      100   121
//       80    100    120                    143    169     195   225
//                                           156    289     324   361
/*
import java.util.*;
class seven{
        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows :- ");
                int N=sc.nextInt();
                int num=N;
                    
                for(int i=1;i<=N;i++){

                        for(int j=1;j<=N;j++){
                                
				if(i%2==1&&j%2==1){
				
					System.out.print((num*num-1)+"\t");
				}else{
				
					System.out.print(num*num+"\t");
				}
				num++;
                                

                        }
                       System.out.println();
		 }
          }
}
*/

//Q.8)   rows=3                              rows=4
//
//      8     e    24                        15    f   35    h
//      g     h    i                         i     j   k     l
//      80    k    120                       143   n   195   p
//                                           q     r   s     t
/*
import java.util.*;
class eight{
        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows :- ");
                int N=sc.nextInt();
                int num=N;
                int ch=96+N;
                for(int i=1;i<=N;i++){

                        for(int j=1;j<=N;j++){

                                if(i%2==1&&j%2==1){

                                        System.out.print((num*num-1)+"\t");
                                }else{

                                        System.out.print((char)ch+"\t");
                                }
                                num++;ch++;


                        }
                       System.out.println();
                 }
          }
}
*/


//Q.9)   rows =3                       rows=4
//       9     @    7                  16    @    14   @
//       12    @    8                  24    @    20   @
//       9     @    3                  24    @    18   @
//                                     16    @    8    @
//
/*                                     
import java.util.*;
class nine{
        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows :- ");
                int N=sc.nextInt();
                    
                int num=N*N;
                for(int i=1;i<=N;i++){
                       
                        for(int j=1;j<=N;j++){

                                if(j%2==1){
                                        
                                        System.out.print(num*i+"\t");
                                }else{

                                        System.out.print("@"+"\t");
                                        
                                }
				num--;
                        }
                       System.out.println();
                 }
          }
}
*/


//Q.10)  rows=3                                rows=4
//       $   16     21                         $    30    42    52
//       6    $      12                        12    $    30    36
//       3    4      $                         8     14   $     20
//                                             4     6    6     $
//
import java.util.*;
class ten{
        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number of rows :- ");
                int N=sc.nextInt();

                int num=N*N;
                for(int i=1;i<=N;i++){

                        for(int j=1;j<=N;j++){

                                if(j==i){

                                        System.out.print("$"+"\t");
                                }else{
                                                
                                        System.out.print(num*j+"\t");

                                }
                                num--;
                        }
                       System.out.println();
                 }
          }
}
