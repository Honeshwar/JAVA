package string;

import java.util.Scanner;

public class Basic1 {
Scanner s=new Scanner(System.in);

//int n=s.n
//	public static void main(String[] args) {
//		System.out.println(Math.round(2.5));
//		int n=9;
//		n=(n>8)? n+1: ;
//		
//		System.out.println(n);
//		String s="string";// string max. size 2^31-1 thats also of int
//		System.out.println(s+n);
//		 float f=n;      // like this same size can easily implicit type casted
//		 System.out.println(f);
//		String d=s+n;
//		System.out.println(d);
////		String str1="coding";
////		String str2="codingj";
//		String str1="codingj";
//		String str2="coding";
//		System.out.println(str1.compareTo(str2));// 10 // o ASCII value + 10 then we get e
//		System.out.println(str2.compareTo(str1));// -10  // str2 (e ASCII value - 10)
//		//											then we get (o) and str2=str1
//		if(str1!=str2) {
//			
//		}
//		System.out.println(str1.compareTo(str1));	
//		System.out.println(str1+str2);// THEN our sting equal
//		//System.out.println("sub"+str1.substring(8));
//		System.out.print(str1.substring(0, 7));// whole string print  no error because end index (7) is exclusive 
//	}
//	public static void main (String[] args) {
//		String str1="abc";
//		String str2=new String("abc");
//		System.out.println(str1==str2);// we try to equal reference but 
//		//both have different reference (due to heap and spring pool memory) 
//		String str3="def";
//		System.out.println(str3);
//	}
public static void main (String[] args) {
String str1="abc";
String str2=str1+" ";
System.out.println(str1==str2);
String str12="abc";
String str21="";
System.out.println(str12.contains(str21));
StringBuffer str11=new StringBuffer("");
for(int i=0;i<5;i++)
{
    str11.append((char)('a'+i));// ASCII value 'a'=97  97+0=97= (char)=  a , i++ abcde
}                               
System.out.println(str11);
}
}
