//Q.1) WAP to print user given string using scanner class
/*
import java.util.*;
class one{

	public static void main(String[]args){
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string :-  ");
		String name=sc.nextLine();
		System.out.println("You entered:  "+name);
		sc.close();
		

	}
}
*/

//Q.2) WAP to concate the string given by user  and count the length of concatinated string 
/*
import java.util.*;
class two{

        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the string :-  ");
                String str1=sc.nextLine();
                
                System.out.println("You entered:  "+str1);
                
                
                String str2=sc.nextLine();
                
                System.out.println("You entered:  "+str2);
                
		String str3=str1.concat(str2);
		char arr[]=str3.toCharArray();
		int len=0;
		System.out.println("the length of array by method "+arr.length);
		for(int i=0;i<arr.length;i++){
			
			len++;

		}
		System.out.println("the length of array by loop "+len);                
        }
}
*/

//Q.3) WAP to take a input as string by user and print all characters  one by one

/*
import java.util.*;
class three{

        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the string :-  ");
                String str1=sc.nextLine();
                
                System.out.println("You entered:  "+str1);

                
                char arr[]=str1.toCharArray();
                
                
                for(int i=0;i<arr.length;i++){

                       System.out.println(arr[i]);

                }
                System.out.println();
        }
}

*/


//Q.4) take a two input string str1 and str2 from the user and print 0 if both strings are equals else print the difference between unequale strings 
/*
import java.util.*;
class four{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the string :-  ");
                String str1=sc.nextLine();
                
                System.out.println("You entered:  "+str1);
                System.out.println("Enter the string :-  ");
                String str2=sc.nextLine();
                
                System.out.println("You entered:  "+str2);
                if(str1.length()!=str2.length()){
			int diff=str1.length()-str2.length();
			if(diff<0){
				diff=-1*diff;
			}
			System.out.println("the difference in length is :- "+diff);
			
		}else{
		      for(int i=0;i<str1.length();i++){
			      if(str1.charAt(i)!=str2.charAt(i)){
				      int diff=str1.charAt(i)-str2.charAt(i);
				      if(diff<0){
					      diff=-1*diff;
				      }
				      System.out.println("the difference is at index "+i+"  is  "+diff);
				      return;
			      }
		      }	
		      System.out.println(0);
                }
                System.out.println();
        }
}

*/

//q.5) WAP TO TAKE A TWO STRING INPUT FROM USER  AND CHECK  WHETHER THOSE STRING OBJECS ARE EQUAL OR NOT IF EQUAL PRINT TRUE ELSE FALSE
/*
import java.util.*;
class five{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the string :-  ");
                String str1=sc.nextLine();

                System.out.println("You entered:  "+str1);
                System.out.println("Enter the string :-  ");
                String str2=sc.nextLine();

                System.out.println("You entered:  "+str2);
                 
		if(str1.equals(str2)){
		
			System.out.println("True");
		}else{
		
			System.out.println("False");
		}
	}
}
*/

//Q.6)WAP that compres two strings without considering their case sensitive

/*
import java.util.*;
class six{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the string :-  ");
                String str1=sc.nextLine();

                System.out.println("You entered:  "+str1);
                System.out.println("Enter the string :-  ");
                String str2=sc.nextLine();

                System.out.println("You entered:  "+str2);

                if(str1.equalsIgnoreCase(str2)){

                        System.out.println("True");
                }else{

                        System.out.println("False");
                }
        }
}
*/

//Q.7)WAP to convert all alphabets into upeercase
/*
import java.util.*;
class seven{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the string :-  ");
                String str1=sc.nextLine();

		String upperstr=str1.toUpperCase();
		System.out.println("Uppercase string is :- "+upperstr);
        }
}
*/

//Q.8) WAP to remove void spaces in string 
//input:- "  heloow,World"
//output:- "heloow,World"
/*
import java.util.*;
class eight{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the string :-  ");
                String str1=sc.nextLine();

                String upperstr=str1.trim();
                System.out.println("Uppercase string is :- "+upperstr);
        }
}

*/

//Q.9) WAP to replace all the 'a' with 'e' in a string
//input string="We all appeared at American show"
//output string ="We ell eppeered et American show"
/*
import java.util.*;
class nine{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the string :-  ");
                String str1=sc.nextLine();

                String upperstr=str1.replace('a','e');
                System.out.println("Uppercase string is :- "+upperstr);
        }
}
*/

//Q.10) WAP to check if string is empty  if not then print the last character of the string 
/*
import java.util.*;
class ten{
        public static void main(String[]args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the string :-  ");
                String str1=sc.nextLine();

                if(str1.isEmpty()){
		
			System.out.println("Given stringis empty ");
		}else{
		
			char lastchar=str1.charAt(str1.length()-1);
			System.out.println("Last Character :- "+ lastchar);
		}
        }
}
*/


