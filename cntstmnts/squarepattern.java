//Q.1)   D  C  B  A
//       4  4  4  4
//       D  C  B  A
//       4  4  4  4

/*
import java.io.*;
class one{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of rows : - ");
		int N=Integer.parseInt(br.readLine());
		
	

		for(int i=1;i<=N;i++){
		        int num=N;
			int ch=64+N;
			for(int j=1;j<=N;j++){
			
				if(i%2==1){
				
					System.out.print((char)ch+"\t");
					ch--;
				}else{
				
 					System.out.print(num+"\t");
				}
			}
			System.out.println();

		
		}
	
	}
}
*/

//Q.2)  if rows=3 then
 //9    4     25
//18   7      8
//27   50    11

//if rows =4 then 
//4     25   28     7
//8     27    50    11
//36   13     14    45
//16    17     54    19
/*
import java.io.*;
class two{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter the number of rows :- ");
	        int N=Integer.parseInt(br.readLine());
		int num=N;
		for(int i=1;i<=N;i++){
		
			for(int j=1;j<=N;j++){
				int val;
				if(num%3==0){
					val=num*3;

				}else if(num%5==0){
				
					val=num*5;
				}else{
				
				
					val=num;
				}
				System.out.print(val+"\t");
				num++;

			}
			System.out.println();
		}
	}
}
*/

//Q.3)  rows=3                            rows=4
//      9   4   5                     16   5   6    7
//      36  7   8                     64   9   10   11
//      81  10  11                    144  13  14   15
//                                    256  17  18   19
/*
import java.io.*;
class three{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());
                int num=N;
                for(int i=1;i<=N;i++){

                        for(int j=1;j<=N;j++){
                                int val;
                                if(num%N==0){
                                        val=num*num;

                                }else{
				
					val=num;
				}
                                System.out.print(val+"\t");
                                num++;

                        }
                        System.out.println();
                }
        }
}
*/

//Q.4)   rows =4
//    D   5  6  7
//    H   9  10 11
//    L   13 14 15
//    p   17 18 19
//
/*
import java.io.*;
class four{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());
                int num=N;
		int ch=64+N;
                for(int i=1;i<=N;i++){

                        for(int j=1;j<=N;j++){
                                int val;
                                if(j==1){
                                        System.out.print((char)ch+"\t");

                                }else{

                                        System.out.print(num+"\t");
                                }
                                ch++;
                                num++;

                        }
                        System.out.println();
                }
        }
}
*/

//Q.5)   rows=3                         rows4
//       3   16   5                     16   5   36   7
//       36  7    64                    64   9   100  11
//       9   100  11                    144  13  196  15
//                                      156  17  324  19
//
/*
import java.io.*;
class five{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());
                int num=N;
                
                for(int i=1;i<=N;i++){
                         int val;
                        for(int j=1;j<=N;j++){
                                
                                if(num%2==0){
                                        System.out.print((num*num)+"\t");

                                }else{

                                        System.out.print(num+"\t");
                                }
                                
                                num++;

                        }
                        System.out.println();
                }
        }
}
*/

//Q.6)  rows=4
//      4   25   6   49
//      8   81   10  121
//      12  169  14  225
//      16  289  18  361
/*
import java.io.*;
class six{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());
                int num=N;

                for(int i=1;i<=N;i++){
                         int val;
                        for(int j=1;j<=N;j++){

                                if(num%2==1){
                                        System.out.print((num*num)+"\t");

                                }else{

                                        System.out.print(num+"\t");
                                }

                                num++;

                        }
                        System.out.println();
                }
        }
}
*/

//Q.7)  rows =4
//     4    A   6   A
//     8    B   10  B
//     12   C   14  C
//     16   D   18  D
/*
import java.io.*;
class seven{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());
                int num=N;
                int ch=65;
                for(int i=1;i<=N;i++){
                         int val;
                        for(int j=1;j<=N;j++){

                                if(num%2==1){
                                        System.out.print((char)ch+"\t");


                                }else{

                                        System.out.print(num+"\t");
                                }

                                num++;

                        }
			ch++;
                        System.out.println();
                }
        }
}
*/

//Q.8)  rows=3                           rows =4
//
//      #   C   #                        #   D   #   C
//      C   #   B                        D   #   C   #
//      #   C   #                        #   D   #   C
//                                       D   #   C   #
/*
import java.io.*;
class eight{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());
                
                
                for(int i=1;i<=N;i++){
                        int ch=64+N;         
                        for(int j=1;j<=N;j++){

                                if((i%2==1&& j%2==0)||(i%2==0&&j%2==1)){
                                        System.out.print((char)ch+"\t");
					ch--;


                                }else{

                                        System.out.print( "#"+"\t");
                                }

                                

                        }
                        
                        System.out.println();
                }
        }
}
*/

//Q.9)   rows=3                      rows=4
//       2    6    6                 2    6     6   12
//       3    4    9                 3    4     9   8
//       2    6    6                 2    6     6   12
//                                   3    4     9   8
import java.io.*;
class nine{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());

                for(int i= 1;i<=N;i++){
		
			for(int j=1;j<=N;j++){
			
			
				if((i+j)%2==0){
				
					System.out.print(2*j+"\t");
				
				}else{
				
					System.out.print(3*j+"\t");
				}
			}
			System.out.println();
		
		}
                
               
        }
}


//Q.10) ROWS =3                           ROWS =4
//     3   B    1                         4    C   2   A
//     C   B    A                         D    C   B   A
//     3   B    1                         4    C   2   A
//                                        D    C   B   A
/*
import java.io.*;
class ten{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());


                for(int i=1;i<=N;i++){
                        int ch=64+N;
			int num=N;
                        for(int j=1;j<=N;j++){

                                if(i%2==1&& j%2==1){
                                        System.out.print(num+"\t");
                                        


                                }else{

                                        System.out.print( (char)ch+"\t");
                                }
				ch--;num--;

                        }

                        System.out.println();
                }
        }
}
*/


