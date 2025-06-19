//Q.0)             *
//              *  *
//           *  *  *
//        *  *  *  *
//
/*
import java.io.*;

class zero{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
		int N=Integer.parseInt(br.readLine());

		for(int i=1;i<=N;i++){
		
		          int  x=N-i;
			
			for(int j=1;j<=N;j++){
			
				if(j<=x){
				
					System.out.print(" ");
				
				}else{
				
					System.out.print("*");
				}
			
			}
			System.out.println();
		
		}
	
	}
}
*/
//Q.2)           1
//           1   2
//        1  2   3
//     1  2  3   4
/*
import java.io.*;

class one{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());

                for(int i=1;i<=N;i++){

                          int  x=N-i;
                        
			  int num=1;
                        for(int j=1;j<=N;j++){
                                
                                if(j<=x){

                                        System.out.print("  ");

                                }else{
                                               
                                        System.out.print(num+" ");
					num++;
                                }

                        }
                        System.out.println();

                }

        }
}
*/

//Q.2)
//                   4
//                4  3
//             4  3  2
//          4  3  2  1
/*
import java.io.*;

class two{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());

                for(int i=1;i<=N;i++){

                          int  x=N-i;
                         int num=N;
                        for(int j=1;j<=N;j++){

                                if(j<=x){
					System.out.print("  ");

                                }else{

                                        System.out.print(num+" ");
                                        num--;
                                }

                        }
                        System.out.println();

                }

        }
}
*/

//Q.3)            C
//             B  C
//          A  B  C
/*
import java.io.*;

class three{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());

                for(int i=1;i<=N;i++){

                          int  x=N-i;
                        
                          
			  int ch=65;
                        for(int j=1;j<=N;j++){

                                if(j<=x){
                                        System.out.print("  ");

                                }else{

                                        System.out.print((char)ch+" ");
                                        
                                }
				ch++;

                        }
                        System.out.println();

                }

        }
}
*/

//Q.4)                       4
//                       4   8
//                   4   8   12
//                4  8   12  16
//
/*
import java.io.*;

class four{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());

                for(int i=1;i<=N;i++){

                          int  x=N-i;
                        
                          int num=N;
                        for(int j=1;j<=N;j++){

                                if(j<=x){
                                        System.out.printf("%5s","  ");

                                }else{

                                        System.out.printf("%5d",num);
                                        num=num+N;
                                }

                        }
                        System.out.println();

                }

        }
} 
*/

//Q.5)          1
//          2   4
//      3   6   9
/*
import java.io.*;

class five{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());

                for(int i=1;i<=N;i++){

                          int  x=N-i;
                        
                          int num=i;
                        for(int j=1;j<=N;j++){

                                if(j<=x){
                                        System.out.printf("%5s","  ");

                                }else{

                                        System.out.printf("%5d",num);
                                        num=num+i;
                                }

                        }
                        System.out.println();

                }

        }
}
*/


//Q.demo)  *  *  *  *
//            *  *  *
//               *  *
//                  *
/*
import java.io.*;
class Demo{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());

                for(int i=1;i<=N;i++){
		        //int x=N-i+1;
                        int y = i-1;
			for(int j=1;j<=N;j++){
			          
				if(j<=y){
				
					System.out.printf("%5s"," ");
				}else{
				
					System.out.printf("%5s","*");
				}
			
			}
			System.out.println();
		}

                }

        }
*/

//Q.6) 3  3  3
//        2  2
//           1
//
/*
import java.io.*;
class six{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());
                int num=N;
                for(int i=1;i<=N;i++){
                        //int x=N-i+1;
                        int y = i-1;
			
                        for(int j=1;j<=N;j++){
                                 
                                if(j<=y){

                                        System.out.printf("%5s"," ");
                                }else{

                                        System.out.printf("%5s",num);
				
                                }

                        }
			num--;

                        System.out.println();
                }

          }

}
*/

//Q.7)  1  2  3  4
//         1  2  3
//            1  2
//               1
/*
import java.io.*;
class seven{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());
                
                for(int i=1;i<=N;i++){
                        int num=1;        
                        int y = i-1;

                        for(int j=1;j<=N;j++){

                                if(j<=y){

                                        System.out.printf("%5s"," ");
                                }else{

                                        System.out.printf("%5s",num);
					num++;

                                }
				

                        }
                        

                        System.out.println();
                }

          }

}
*/

//Q.8)     1  2  3  4
//            2  3  4
//               3  4
//                  4
/*
import java.io.*;
class eight{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());

                for(int i=1;i<=N;i++){
                        //int num=1;
                        int y = i-1;

                        for(int j=1;j<=N;j++){

                                if(j<=y){

                                        System.out.printf("%5s"," ");
                                }else{

                                        System.out.printf("%5s",j);
                                        //num++;

                                }


                        }


                        System.out.println();
                }

          }

}
*/

//Q.9)  D  C  B  A
//         D  C  B
//            D  C
//               D
/*
import java.io.*;
class nine{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());

                for(int i=1;i<=N;i++){
                        int ch=64+N;
                        int y = i-1;

                        for(int j=1;j<=N;j++){

                                if(j<=y){

                                        System.out.printf("%5s"," ");
                                }else{

                                        System.out.printf("%5s",(char)ch);
                                        ch--;

                                }


                        }


                        System.out.println();
                }

          }

}
*/

//Q.10)
//        65   B  67  D
//             B  67  D
//                67  D
//                    D

/*
import java.io.*;
class ten{

        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number of rows :- ");
                int N=Integer.parseInt(br.readLine());

                for(int i=1;i<=N;i++){
                        int ch=65;
                        int y = i-1;

                        for(int j=1;j<=N;j++){

                                if(j<=y){

                                        System.out.printf("%5s"," ");
                                }else{

                                     if(j%2==1){
                                          
				     	   System.out.printf("%5d",ch);
                                     }else{
				     
					     System.out.printf("%5s",(char)ch);

				     }

                                }

                                ch++;
                        }


                        System.out.println();
                }

          }

}
*/

