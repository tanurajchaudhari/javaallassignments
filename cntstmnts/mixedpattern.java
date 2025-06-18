//Q.1) rows =4
//      1  2  3  4
//      5  6  7  8
//      9  10 11 12
//      13 14 15 16
/*
import java .io.*;
class one{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the nnumbers of rows : - ");
		int N=Integer.parseInt(br.readLine());
		int num=1;
		for(int i=1;i<=N;i++){
		
			for(int j=1;j<=N;j++){
			
				System.out.printf("%5d",num);
				num++;
			}
			System.out.println();
		}
	
	}
}
*/
//Q.2) rows =3
//     C3  C2  C1
//     C4  C3  C2
//     C5  C4  C3
/*
import java .io.*;
class two{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the nnumbers of rows : - ");
                int N=Integer.parseInt(br.readLine());
                int num=N;
		int ch=64+N;
                for(int i=1;i<=N;i++){
                        int num1=N+i-1;
                        for(int j=1;j<=N;j++){

                                System.out.printf("%5s",(char)ch+""+num1);
                                num--;
                        }
                        System.out.println();
                }

        }
}
*/
//Q.3) 
//    C  B  A
//    1  2  3
//    C  B  A
//    1  2  3
/*
import java .io.*;
class three{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the nnumbers of rows : - ");
                int N=Integer.parseInt(br.readLine());
                int num=N;
                
                for(int i=1;i<=N;i++){
                        int ch=64+N;

                        for(int j=1;j<=N;j++){
                               if(i%2==1){

                                	System.out.printf("%5s",(char)ch);
                                	ch--;
			       }else{
			       
				       System.out.printf("%5d",j);

			       }
                        }
                        System.out.println();
                }

        }
}
*/

//Q.4) 
//   3                     4
//   2  4                  3  6
//   1  2  3               2  4  6    
/*                         1  2  3   4
import java .io.*;
class four{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the nnumbers of rows : - ");
                int N=Integer.parseInt(br.readLine());
                int num=N;
		int number=N;

                for(int i=1;i<=N;i++){
                        

                        for(int j=1;j<=i;j++){
                               System.out.printf("%5d",num);
			       num=num+number;
                        }
			number--;
			num=number;
                        System.out.println();
                }

        }
}
*/

//Q.5)    1
//        2   4
//        3   6  9
//        4   8  12  16
/*
import java .io.*;
class five{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the nnumbers of rows : - ");
                int N=Integer.parseInt(br.readLine());
                
                

                for(int i=1;i<=N;i++){

                         int ii=i;
                        for(int j=1;j<=i;j++){
                               System.out.printf("%5d",ii);
                               ii=ii+i;
                        }
                        
                        System.out.println();
                }

        }
}
*/

// Q.6)  d
//       4  3
//       d  c  b
//       4  3  2  1
/*
import java .io.*;
class six{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the nnumbers of rows : - ");
                int N=Integer.parseInt(br.readLine());

                 

                for(int i=1;i<=N;i++){
                        int ch=96+N;
			int num=N;
                        
                        for(int j=1;j<=i;j++){
                               if(i%2==1){
					System.out.printf("%5s",(char)ch);
					ch--;
				}else{
				
					System.out.printf("%5d",num);
					num--;
				}
                               
                        }

                        System.out.println();
                }

        }
}
*/

//Q.7) 
//     2  4  6  8
//     10 12 14 
//     16 18
//     20
/*
import java .io.*;
class seven{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the nnumbers of rows : - ");
                int N=Integer.parseInt(br.readLine());
                int N1=N;

                int num=2;
                for(int i=1;i<=N;i++){
                      

                        for(int j=1;j<=N1;j++){
                             System.out.printf("%5d",num);
			     num+=2;

                        }
                        N1--;
                        System.out.println();
                }

        }
}
*/

//Q.8)
//   F  E  D
//   C  B
//   A

/*
import java .io.*;
class eight{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the nnumbers of rows : - ");
                int N=Integer.parseInt(br.readLine());
                int N1=N;
		int ch=64+(N*(N+1))/2;

                
                for(int i=1;i<=N;i++){


                        for(int j=1;j<=N1;j++){
                             System.out.printf("%5s",(char)ch);
                             ch-=1;

                        }
                        N1--;
                        System.out.println();
                }

        }
}
*/

//Q.9)  
//      1  2  3  4
//      C  B  A
//      1  2
//      A
//
//      1  2  3  4  5
//      D  C  B  A
//      1  2  3
//      B  A
//      1
/*
import java .io.*;
class nine{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the nnumbers of rows : - ");
                int N=Integer.parseInt(br.readLine());
                int N1=N;
                int ch=64+N;


                for(int i=1;i<=N;i++){

                        int val=ch;
                        for(int j=1;j<=N1;j++){
                         

				if(i%2==1){
			      	    System.out.printf("%5d",j);
                                     
				 }else{
					 System.out.printf("%5s",(char)val);
					 val--;
				
				 }

                        }
                        N1--;
			ch--;
                        System.out.println();
                }

        }
}
*/

//Q.10)  WAP to print the square of odd digit from the given number
//Input :- 45632985632
//output:- 25,9,81,25,9
 
import java.io.*;

class ten {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number: ");
        String input = br.readLine(); 

        System.out.print("Squares of odd digits: ");
        boolean first = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                int digit = ch - '0';

                if (digit % 2 == 1) {
                    int square = digit * digit;

                    if (!first)
                        System.out.print(",");
                    System.out.print(square);
                    first = false;
                }
            }
        }

        System.out.println();
    }
}

