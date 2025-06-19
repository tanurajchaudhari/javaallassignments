//Q.1)
//             *                              *
//          *  *  *                        *  *  *
//       *  *  *  *  *                  *  *  *  *  *
//                                   *  *  *  *  *  *  *
/*
import java.io.*;
class zero{

	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numbe rof rows :-  ");
		int N=Integer.parseInt(br.readLine());
                int NOJ=N;
		for(int i=1;i<=N;i++){
		        int x=N-i;
			for(int j=1;j<=NOJ;j++){
			
				if(j<=x){
				
				
					System.out.print("  ");
				}else{
				
					System.out.print("* ");
				}
			}
			NOJ++;
			System.out.println();
		
		}

	
	}
}
*/

//Q.1)               1
//               1   1   1
//            1  1   1   1  1
//
/*
import java.io.*;
class one{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the numbe rof rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int NOJ=N;
		int num=1;
                for(int i=1;i<=N;i++){
                        int x=N-i;
                        for(int j=1;j<=NOJ;j++){

                                if(j<=x){


                                        System.out.print("  ");
                                }else{

                                        System.out.print(num+" ");
                                }
                        }
                        NOJ++;
                        System.out.println();

                }


        }
}

*/

//Q.2)          1
//           2  3  4
//        5  6  7  8  9
//
 /*
import java.io.*;
class two{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the numbe rof rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int NOJ=N;
                int num=1;
                for(int i=1;i<=N;i++){
                        int x=N-i;
                        for(int j=1;j<=NOJ;j++){

                                if(j<=x){


                                        System.out.print(" "+"\t");
                                }else{

                                        System.out.print(num+"\t");
					num++;
                                }
				
                        }
                        NOJ++;
                        System.out.println();

                }


        }
}
*/

//Q.3)                4
//                3   3   3
//             2  2   2   2  2
//          1  1  1   1   1  1  1
//
/*
import java.io.*;
class three{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the numbe rof rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int NOJ=N;
                int num=N;
                for(int i=1;i<=N;i++){
                        int x=N-i;
                        for(int j=1;j<=NOJ;j++){

                                if(j<=x){


                                        System.out.print(" "+"\t");
                                }else{

                                        System.out.print(num+"\t");
                                        
                                }

                        }
			num--;
                        NOJ++;
                        System.out.println();

                }


        }
}
*/

//Q.4)                    A
//                    B   B   B
//                C   C   C   C   C
//
/*
import java.io.*;
class four{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the numbe rof rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int NOJ=N;
                int num=65;
                for(int i=1;i<=N;i++){
                        int x=N-i;
                        for(int j=1;j<=NOJ;j++){

                                if(j<=x){


                                        System.out.print(" "+"\t");
                                }else{

                                        System.out.print((char)num+"\t");

                                }

                        }
                        num++;
                        NOJ++;
                        System.out.println();

                }


        }
}
*/

//Q.5)          1
//           1  2  1
//        1  2  3  2  1
//     1  2  3  4  3  2  1
//
/*
import java.io.*;
class five{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the numbe rof rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int NOJ=N;
                
                for(int i=1;i<=N;i++){
                        int x=N-i;
			int num=1;
                        for(int j=1;j<=NOJ;j++){
                                if(j<=x){
                                        System.out.print(" "+"\t");
                                }else{
					if(j<=N){
                                              System.out.print(num+"\t");
				              if(j<N){
						      num++;
					      }else{  
						      num--;
					   }	      					
					 }else{
						 System.out.print(num+"\t");
						 num--;
					 }
                                }
                        }
                        NOJ++;
                        System.out.println();
                }
        }
}
*/

//Q.6)  
//           3
//        3  2  3
//     3  2  1  2  3
/*
import java.io.*;
class six{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the numbe rof rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int NOJ=N;

                for(int i=1;i<=N;i++){
                        int x=N-i;
                        int num=N;
                        for(int j=1;j<=NOJ;j++){
                                if(j<=x){
                                        System.out.print(" "+"\t");
                                }else{
                                        if(j<=N){
                                              System.out.print(num+"\t");
                                              if(j<N){
                                                      num--;
                                              }else{
                                                      num++;
                                           }
                                         }else{
                                                 System.out.print(num+"\t");
                                                 num++;
                                         }
                                }
                        }
                        NOJ++;
                        System.out.println();
                }
        }
}
*/

//Q.7)                1
//                B   B   B
//            3   3   3   3  3
//         D  D   D   D   D  D  D
//
/*
import java.io.*;
class seven{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the numbe rof rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int NOJ=N;

                for(int i=1;i<=N;i++){
                        int x=N-i;
                        int num=N;
                        for(int j=1;j<=NOJ;j++){
                                if(j<=x){
                                        System.out.print(" "+"\t");
                                }else{
                                      
                                              if(i%2==1){
					      
						      System.out.print(i+"\t");
					      
					      }else{
					      
						      System.out.print((char)(i+64)+"\t");
					      }                                
                        }
                        
               }
	       NOJ++;
	       System.out.println();

        }

	}
}	
*/

//Q.8)               3
//                2  2  2
//             1  1  1  1  1
//
//               
/*
import java.io.*;
class eight{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the numbe rof rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int NOJ=N;
                int num=N;
                for(int i=1;i<=N;i++){
                        int x=N-i;
                       
                        for(int j=1;j<=NOJ;j++){
                                if(j<=x){
                                        System.out.print(" "+"\t");
                                }else{
                                      System.out.print(num+"\t");                            

                                }

               }
	       num--;
               NOJ++;
               System.out.println();

        }

        }
}
*/

//Q.9)                       A
//                       a   b   c
//                    A  B   C   B   A

/*
import java.io.*;
class nine{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the numbe rof rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int NOJ=N;

                for(int i=1;i<=N;i++){
                        int x=N-i;
                        int CH=65;
			int ch=97;
                        for(int j=1;j<=NOJ;j++){
                                if(j<=x){
                                        System.out.print(" "+"\t");
                                }else{
                                        if(j<=NOJ){
                                              if(i%2==1){
					      
						     if(j<=N){
						            System.out.print((char)CH+"\t");
						            if(j<N){
							         CH++;
							    }else{
							    
								    CH--;
							    }
					              }else{
						      
							      System.out.print((char)CH+"\t");
							      CH--;
						      
						      }
					      
					      }else{
					      
						     if(j<=N){
						     
							     System.out.print((char)ch+"\t");
							     if(j<N){
							     
								     ch++;
							     }else{
							         ch--;
							     }
						     }else{
						     
							     System.out.print((char)ch+"\t");
							     ch--;
						     }
						     
					      }
                                }
                        }
		}
                     NOJ++;
                     System.out.println();
                }
        }
}

*/

//Q.10)               C
//               B    C    B
//           A   B    C    B    A
//
import java.io.*;
class ten{

        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the numbe rof rows :-  ");
                int N=Integer.parseInt(br.readLine());
                int NOJ=N;
                for(int i=1;i<=N;i++){
                        int x=N-i;
                        int ch=65;
                        for(int j=1;j<=NOJ;j++){
				if(j<=x){
					System.out.print(""+"\t");
					ch++;
		                }else{
					if(j<=N){
						System.out.print((char)ch+"\t");
						if(j<N){
							ch++;
						}else{
							ch--;
						}
					}else{
						System.out.print((char)ch+"\t");
						ch--;
					}
                                        
				}
				
                        }
		
                        NOJ++;
                        System.out.println();
                }
        }
}






