//Q.1)   rows=4
//                       #
//                   #   #   #
//               #   #   #   #   #
//           #   #   #   #   #   #   #
//               #   #   #   #   #
//                   #   #   #
//                       #
//
//
/*
import java.io.*;
class one{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter the number of rows ");
		int N=Integer.parseInt(br.readLine());
                int N2=N;
		int len=N*2-1;
		int N3=N;
		for(int i=1;i<=len;i++){
		        
			int A=i;
			N2=N3+i-1;
			if(A>N){
			
				A=--N;
				N2=N3+A-1;

			}

			for(int j=1;j<=N2;j++){
				
				if(j<=N3-A){
				
					System.out.print(" "+"\t");
				}else{
				
					System.out.print("#"+"\t");
				}			

			}
			System.out.println();
		
		}
	
	}

}
*/


//Q.2)  rows=4
//                   1
//             2     3     4
//        5    6     7     8    9
//  10    11  12     13    14   15    16
//        17  18     19    20   21
//            22     23    24
//                   25
//
//
//
/*
import java.io.*;
class two{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                int N=Integer.parseInt(br.readLine());
                int N2=N;
                int len=N*2-1;
                int N3=N;
		int num=1;
                for(int i=1;i<=len;i++){

                        int A=i;
                        N2=N3+i-1;
                        if(A>N){

                                A=--N;
                                N2=N3+A-1;

                        }

                        for(int j=1;j<=N2;j++){

                                if(j<=N3-A){

                                        System.out.print(" "+"\t");
                                }else{

                                        System.out.print(num+++"\t");
                                }

                        }
                        System.out.println();

                }

        }

}
*/


//Q.3)   rows =4
//                           1
//                    2      1      2
//              3     2      1      2     3
//       4      3     2      1      2     3     4
//              3     2      1      2     3
//                    2      1      2
//                           1
//
//
//
/*
import java.io.*;
class three{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                int N=Integer.parseInt(br.readLine());
                int N2=N;
                int len=N*2-1;
                int N3=N;
                for(int i=1;i<=len;i++){
                        int A=i;
                        N2=N3+i-1;
			int num=A;
                        if(A>N){
                                A=--N;
                                N2=N3+A-1;
				num=A;
                        }
                        for(int j=1;j<=N2;j++){
                                if(j<=N3-A){
                                        System.out.print(" "+"\t");
                                }else{
                                        if(j<N3){
                                            System.out.print(num+"\t");
					      num--;
				       }else{
				              
					       System.out.print(num++ +"\t");
				       }
                                }
                        }
                        System.out.println();
                }
        }
}
*/


//Q.4)   rows=4
//                            1
//                       1    2    1
//                  1    2    3    2    1
//             1    2    3    4    3    2    1
//                  1    2    3    2    1
//                       1    2    1
//                            1
//
//
/*
import java.io.*;
class four{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                int N=Integer.parseInt(br.readLine());
                int N2=N;
                int len=N*2-1;
                int N3=N;
                for(int i=1;i<=len;i++){
                        int A=i;
                        N2=N3+i-1;
                        int num=1;
                        if(A>N){
                                A=--N;
                                N2=N3+A-1;
				
                                
                        }
                        for(int j=1;j<=N2;j++){
                                if(j<=N3-A){
                                        System.out.print(" "+"\t");
                                }else{
				      if(j<N3){
                                         System.out.print(num+"\t");
					 num++;
				     }else{
				         	System.out.print(num+"\t");
						num--;
				     }
                                }
                        }
                        System.out.println();
                }
        }
}
*/


//Q.5)   rows=4
//                      4
//                 3    3    3
//           2     2    2    2    2
//     1     1     1    1    1    1     1
//           2     2    2    2    2
//                 3    3    3
//                      4
//
//
/*
import java.io.*;
class five{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                int N=Integer.parseInt(br.readLine());
                int N2=N;
                int len=N*2-1;
                int N3=N;
                for(int i=1;i<=len;i++){
                        int A=i;
                        N2=N3+i-1;
                        int num=N3-A+1;
                        if(A>N){
                                A=--N;
                                N2=N3+A-1;
				num=N3-A+1;
                        }
                        for(int j=1;j<=N2;j++){
                                if(j<=N3-A){
                                        System.out.print(" "+"\t");
                                }else{
                                      
                                         System.out.print(num+"\t");
                                }
                        }
                        System.out.println();
                }
        }
}
*/

//Q.6)    rows=4
//                            1
//                        2   2    2
//                   3    3   3    3   3
//              4    4    4   4    4   4   4
//                   3    3   3    3   3   3
//                        2   2    2
//                            1
//
//
/*
import java.io.*;
class six{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                int N=Integer.parseInt(br.readLine());
                int N2=N;
                int len=N*2-1;
                int N3=N;
                for(int i=1;i<=len;i++){
                        int A=i;
                        N2=N3+i-1;
                        int num=A;
                        if(A>N){
                                A=--N;
                                N2=N3+A-1;
                                num=A;
                        }
                        for(int j=1;j<=N2;j++){
                                if(j<=N3-A){
                                        System.out.print(" "+"\t");
                                }else{

                                         System.out.print(num+"\t");
                                }
                        }
                        System.out.println();
                }
        }
}
*/


//Q.7) rows=4
//                    A
//                A   B   A
//            A   B   C   B   A
//        A   B   C   D   C   B   A
//            A   B   C   B   A
//                A   B   A
//                    A
//
//
//
/*
import java.io.*;
class seven{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                int N=Integer.parseInt(br.readLine());
                int N2=N;
                int len=N*2-1;
                int N3=N;
                for(int i=1;i<=len;i++){
                        int A=i;
                        N2=N3+i-1;
                        int num=65;
                        if(A>N){
                                A=--N;
                                N2=N3+A-1;
                        }
                        for(int j=1;j<=N2;j++){
                                if(j<=N3-A){
                                        System.out.print(" "+"\t");
                                }else{
                                      if(j<N3){
                                         System.out.print((char)num+"\t");
                                         num++;
                                     }else{
                                                System.out.print((char)num+"\t");
                                                num--;
                                     }
                                }
                        }
                        System.out.println();
                }
        }
}
*/


//Q.8)     rows=4
//                         A
//                     B   A   B
//                C    B   A   B   C
//            D   C    B   A   B   C    D
//                C    B   A   B   C
//                     B   A   B
//                         A
//
//
/*
import java.io.*;
class eight{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                int N=Integer.parseInt(br.readLine());
                int N2=N;
                int len=N*2-1;
                int N3=N;
                for(int i=1;i<=len;i++){
                        int A=i;
                        N2=N3+i-1;
                        int num=64+A;
                        if(A>N){
                                A=--N;
                                N2=N3+A-1;
                                num=64+A;
                        }
                        for(int j=1;j<=N2;j++){
                                if(j<=N3-A){
                                        System.out.print(" "+"\t");
                                }else{
                                        if(j<N3){
                                            System.out.print((char)num+"\t");
                                              num--;
                                       }else{

                                               System.out.print((char)num++ +"\t");
                                       }
                                }
                        }
                        System.out.println();
                }
        }
}
*/

//Q.9)   rows =4
//                            D
//                        C   C   C
//                   B    B   B   B   B
//               A   A    A   A   A   A   A
//                   B    B   B   B   B
//                        C   C   C
//                            A
//
//
//
/*
import java.io.*;
class nine{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                int N=Integer.parseInt(br.readLine());
                int N2=N;
                int len=N*2-1;
                int N3=N;
                for(int i=1;i<=len;i++){
                        int A=i;
                        N2=N3+i-1;
                        int num=64+N3-A+1;
                        if(A>N){
                                A=--N;
                                N2=N3+A-1;
                                num=64+N3-A+1;
                        }
                        for(int j=1;j<=N2;j++){
                                if(j<=N3-A){
                                        System.out.print(" "+"\t");
                                }else{

                                         System.out.print((char)num+"\t");
                                }
                        }
                        System.out.println();
                }
        }
}
*/

//Q.10)   rows=4
//                       1
//                   1   A   1
//               1   A   2   A   1
//           1   A   2   B   2   A   1
//               1   A   2   A   1
//                   1   A   1
//                       1
//
//
import java.io.*;
class ten{
        public static void main(String[]args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows ");
                int N=Integer.parseInt(br.readLine());
                int N2=N;
                int len=N*2-1;
                int N3=N;
                for(int i=1;i<=len;i++){
                        int A=i;
                        N2=N3+i-1;
                        int num=1;
			int ch=65;
			boolean flag=false;
                        if(A>N){
                                A=--N;
                                N2=N3+A-1;
                        }
                        for(int j=1;j<=N2;j++){
                                if(j<=N3-A){
                                        System.out.print(" "+"\t");
                                }else{
                                      if(j<N3){
                                           if(flag==false){
                                             System.out.print(num+"\t");
                                             num++;
					     flag=true;
					    }else{  
						    System.out.print((char)ch+"\t");
						    ch++;
						    flag=false;
					    }
                                     }else{
                                               if(flag==false){ 
						  if(j==N3+1){
						  
							  num--;
						  }
					          System.out.print(num+"\t");
                                                   num--;
						   flag=true;
						}else{
							if(j==N3+1){
							
								ch--;
							}
						
							System.out.print((char)ch+"\t");
							ch--;
							flag=false;
						}
					}
                                     }
                        }
                        System.out.println();
                }
        }
}
