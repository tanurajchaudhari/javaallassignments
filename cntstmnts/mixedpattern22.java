//Q.1)   rows=3                 rows=4
//             1                       1
//          3  5                  3    5
//       7  9  11             7   9    11
//                        13  17  19   23
/*
import java.io.*;
class one{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of rows :- ");
		int N=Integer .parseInt(br.readLine());
		int num=1;
		for(int i=1;i<=N;i++){
		        int x=N-i;
			for(int j=1;j<=N;j++){
				if(j<=x){
					System.out.print(" "+"\t");
				}else{
					if(i==4&&j%2==0){	
						System.out.print(num+"\t");
					}else{
						System.out.print(num+"\t");
					}
				        if(i==4&&j%2==1){
						num=num+4;
					}else{
						num=num+2;
					}
				}
			}
			System.out.println();		
		}

	}
}
*/

//Q.2)  rows =3                             rows = 4
//    1    2     3                          1   2   3   4
//         3     4                              4   5   6
//               4                                  6   7
//                                                      7
/*
import java.io.*;
class two{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer .parseInt(br.readLine());
                int num=1;
                for(int i=1;i<=N;i++){
                        //int x=N-i+1;
                        for(int j=1;j<=N;j++){
                                if(j<=i-1){
                                        System.out.print(" "+"\t");
                                 }else{
				 
					 System.out.print(num+"\t");
				         num++; 
				 }
				
                                
                        }
			num--;
                        System.out.println();
                }

        }
}
*/

//Q.3)      rows=3                 rows=4
//                  1                          1
//             4    7                     5    9
//        10   13   16               13   17   21
//                              25   29   33   37
/*
import java.io.*;
class three{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer .parseInt(br.readLine());
                int num=1;
                for(int i=1;i<=N;i++){
                        int x=N-i;
                        for(int j=1;j<=N;j++){
                                if(j<=x){
                                        System.out.print(" "+"\t");
                                 }else{

                                         System.out.print(num+"\t");
                                         num=num+N;
                                 }


                        }
                        
                        System.out.println();
                }

        }
}
*/

//Q.4)  rows =3                      rows=4
//    A   B  C                       a    b    c    d
//        B  C                            b    c    d
//           C                                 c    d
//                                                  d 
/*
import java.io.*;
class four{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer .parseInt(br.readLine());
                
                for(int i=1;i<=N;i++){
                        int x=N-i;
			int ch=65;
			int ch1=97;
                        for(int j=1;j<=N;j++){
                                if(j<=i-1){
                                        System.out.print(" "+"\t");
                                 }else{

                                    if(N%2==1){
				    	  System.out.print((char)ch+"\t");
				    }else{
				    
					    System.out.print((char)ch1+"\t");
				    }
                                         
                                 }
				ch1++;
				ch++;
                        }
                        System.out.println();
                }
        }
}
*/

//Q.5)  rows =3                                   rows=4
//     9    16    25                              9    16     25      36
//     6    7     8                               7    8      9       10
//     81   100   121                             121  144    169     225
//                                                16   17     18      19
//
/*
import java.io.*;
class five{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer .parseInt(br.readLine());
                int num=N;
                for(int i=1;i<=N;i++){
                       
                        for(int j=1;j<=N;j++){
                                if(i%2==1){
                                        System.out.print(num*num+"\t");
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

//Q.6)  rows=3                                                           //Q.6)  rows=3
//                  1                                                                  1
//            1     2    3                                                     1       2     3
//      1     2     3    4    5                                         1      2       3     4     5
//                                                              1       2      3       4     5     6      7
//                              
//
/*
import java.io.*;
class six{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer .parseInt(br.readLine());
                
		int N1=N;
                for(int i=1;i<=N;i++){
			int num=1;
                        int x=N-i;
                        for(int j=1;j<=N1;j++){
				if(j<=x){
				      System.out.print(" "+"\t");
				
				}else{
				
					System.out.print(num+"\t");
					num++;
				
				}
                                
                        }
			N1++;
                        System.out.println();
                }
        }
}
*/

//Q.7)     rows = 3                                                         rows=4
//                        1                                                        1
//                    3   2    1                                              3    2    1
//                5   4   3    2   1                                      5   4    3    2    1
//                                                                    7   6   5    4    3    2    1
/*
import java.io.*;
class seven{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer .parseInt(br.readLine());
                int num1=1;
                int N1=N;
                for(int i=1;i<=N;i++){
                        int num=num1;
                        int x=N-i;
                        for(int j=1;j<=N1;j++){
                                if(j<=x){
                                      System.out.print(" "+"\t");

                                }else{
                                             
                                        System.out.print(num+"\t");
                                        num--;

                                }

                        }
			num1=num1+2;
                        N1++;
                        System.out.println();
                }
        }
}
*/
//Q.8)      rows=3                                              rows=4
//                        3                                             4
//                   2    3    4                                   3    4     5
//               1   2    3    4    5                         2    3    4     5    6
//                                                       1    2    3    4     5    6    7
//
/*
import java.io.*;
class eight{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer .parseInt(br.readLine());
                
                int N1=N;
                for(int i=1;i<=N;i++){
                        int num=1;
                        int x=N-i;
                        for(int j=1;j<=N1;j++){
                                if(j<=x){
                                      System.out.print(" "+"\t");

                                }else{
                                        System.out.print(num+"\t");
                                }
				num++;
                        }
                        N1++;
                        System.out.println();
                }
        }
}
*/

//Q.9)    rows = 3                                    rows=4
//                   3                                         4
//              4    3   2                                5    4    3
//          5   4    3   2   1                       6    5    4    3    2
//                                               7   6    5    4    3    2   1
/*
import java.io.*;
class nine{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer .parseInt(br.readLine());

                int N1=N;
                for(int i=1;i<=N;i++){
                        int num=N1;
                        int x=N-i;
                        for(int j=1;j<=N1;j++){
                                if(j<=x){
                                      System.out.print(" "+"\t");

                                }else{
                                        System.out.print(num+"\t");
					num--;
                                }
                                
                        }
                        N1++;
                        System.out.println();
                }
        }
}
*/

//Q.10)   rows =3                                 rows=4
//                  1                                          1
//              2   1    2                                 2   1   2
//          3   2   1    2   3                         3   2   1   2   3
//                                                 4   3   2   1   2   3   4
//
import java.io.*;
class ten{

        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer .parseInt(br.readLine());
                int N1=N;
                
                for(int i=1;i<=N;i++){
                        int num=i+1;
                        int x=N-i;
                        for(int j=1;j<=N1;j++){
                                if(j<=x){
                                      System.out.print(" "+"\t");

                                }else{
                                       if(j<=N){
				       	    System.out.print(--num+"\t");
                                            
					    /*if(j<N){
					    
						    num--;
					    
					    }else{
					    
					    
						    num++;
					    } */                                           
				       }else{
				       
					       System.out.print(++num+"\t");
					       num++;
				       }
                                }

                        }
                        N1++;
                        System.out.println();
                }
        }
}
