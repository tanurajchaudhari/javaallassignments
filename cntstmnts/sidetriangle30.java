//Q.10 rows=4
//    #
//    #   #
//    #   #   #
//    #   #   #   #
//    #   #   #   
//    #   # 
//    #
//
/*
import java.io.*;
class one{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the  number of rows :-  ");
		int N=Integer.parseInt(br.readLine());
		int N1=N+(N-1);
		for(int i=1;i<=N1;i++){
		        int A=i;
			if(A>N){
			    
                               A=--N;

			}
			for(int j=1;j<=A;j++){
			       

			    System.out.print("#"+"\t");    	
			                         			    
			    
			}
			System.out.println();
		}
	}
}
*/
//
//
//Q.2)   row=4
//      1
//      1   2
//      1   2   3
//      1   2   3   4
//      1   2   3
//      1   2
//      1
//
/*
import java.io.*;
class two{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the  number of rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int N1=N+(N-1);
                for(int i=1;i<=N1;i++){
                        int A=i;
			int num=1;
                        if(A>N){

                               A=--N;

                        }
                        for(int j=1;j<=A;j++){

                            System.out.print(num++ +"\t");

                        }
                        System.out.println();
                }
        }
}
*/

//Q.3)   rows=4
//       1
//       2    1
//       3    2    1
//       4    3    2    1
//       3    2    1
//       2    1
//       1
//
/*
import java.io.*;
class three{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the  number of rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int N1=N+(N-1);
                for(int i=1;i<=N1;i++){
                        int A=i;
                        int num=i;
                        if(A>N){

                               A=--N;
			       num=A;

                        }
                        for(int j=1;j<=A;j++){

                            System.out.print(num-- +"\t");

                        }
                        System.out.println();
                }
        }
}
*/

//Q.4)  rows=4
//      4
//      3   3
//      2   2   2
//      1   1   1   1
//      2   2   2
//      3   3
//      4

/*
import java.io.*;
class four{

        public static void main(String[]args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the  number of rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int N1=N+(N-1);
                int num=N;
		int N2=N;
                for(int i=1;i<=N1;i++){
                        int A = i;
                        
                        if(A>N){

                               A=--N;
                               

                        }
                        for(int j=1;j<=A;j++){

                            System.out.print(num +"\t");

                        }
			if(i>=N2){
			
				num++;
			}else{
			
				num--;
			}
                        System.out.println();
                }
        }
}
*/

//Q.5) rows =4
//    D
//    C    C
//    B    B     B
//    A    A     A    A
//    B    B     B    
//    C    C
//    D
//
/*
import java.io.*;
class five{

        public static void main(String[]args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the  number of rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int N1=N+(N-1);
                int num=64+N;
                int N2=N;
                for(int i=1;i<=N1;i++){
                        int A = i;

                        if(A>N){

                               A=--N;


                        }
                        for(int j=1;j<=A;j++){

                            System.out.print((char)num +"\t");

                        }
                        if(i>=N2){

                                num++;
                        }else{

                                num--;
                        }
                        System.out.println();
                }
        }
}
*/


//Q.6)  rows=4
//                    1
//               1    2
//          1    2    3
//     1    2    3    4
//          1    2    3
//               1    2
//                    1
//
/*
import java.io.*;
class six{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the  number of rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int N1=N+(N-1);
		int N2=N;
                for(int i=1;i<=N1;i++){
                        int A=i;
                        int num=1;
                        if(A>N){
                                
                               A=--N;
                        }
                        for(int j=N2;j>=1;j--){
                           
				if(j<=A){
				
					System.out.print(num++  +"\t");
				}else{
				
					System.out.print(" "+"\t");
				}
			  
                        }
                        System.out.println();
                }
        }
}
*/

//Q.7)   rows=4
//                          1
//                     2    1
//                 3   2    1
//            4    3   2    1
//                 3   2    1
//                     2    1
//                          1
//
//
/*
import java.io.*;
class seven{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the  number of rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int N1=N+(N-1);
                int N2=N;
                for(int i=1;i<=N1;i++){
                        int A=i;
                        
                        if(A>N){

                               A=--N;
                        }
			int num=A;
                        for(int j=N2;j>=1;j--){

                                if(j<=A){

                                        System.out.print(num--  +"\t");
                                }else{

                                        System.out.print(" "+"\t");
                                }

                        }
                        System.out.println();
                }
        }
}
*/


//Q.8)       rows=4
//                      1
//                  2   2
//              3   3   3
//          4   4   4   4
//              3   3   3
//                  2   2
//                      1
//
//
/*
import java.io.*;
class eight{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the  number of rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int N1=N+(N-1);
                int N2=N;
                for(int i=1;i<=N1;i++){
                        int A=i;

                        if(A>N){

                               A=--N;
                        }
                        int num=A;
                        for(int j=N2;j>=1;j--){

                                if(j<=A){

                                        System.out.print(num  +"\t");
                                }else{

                                        System.out.print(" "+"\t");
                                }

                        }
                        System.out.println();
                }
        }
}
*/

//Q.9)   rows =4
//                            3
//                      2     3
//                1     2     3
//          0     1     2     3
//                1     2     3
//                      2     3
//                            3
//
//
/*
import java.io.*;
class nine{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the  number of rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int N1=N+(N-1);
                int N2=N;
                for(int i=1;i<=N1;i++){
                       int A=i;
		       if(A>N){
		       
			       A=--N;
		       }

                        
                        for(int j=1;j<=N2;j++){

                                if(j<=(N2-A)){

                                        System.out.print(" " +"\t");
                                }else{

                                        System.out.print((j-1)+"\t");
                                }

                        }
                        System.out.println();
                }
        }
}
*/


//Q.10)  rows=4
//                  D
//               C  D
//           B   C  D
//       A   B   C  D
//           B   C  D
//               C  D
//                  D
//
//
/*
import java.io.*;
class ten{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the  number of rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int N1=N+(N-1);
                int N2=N;
                for(int i=1;i<=N1;i++){
                       int A=i;
                       if(A>N){

                               A=--N;
                       }


                        for(int j=1;j<=N2;j++){

                                if(j<=(N2-A)){

                                        System.out.print(" " +"\t");
                                }else{

                                        System.out.print((char)(64+j)+"\t");
                                }

                        }
                        System.out.println();
                }
        }
}
*/


