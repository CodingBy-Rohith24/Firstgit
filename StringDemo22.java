import java.util.Scanner;
class StringDemo22
{
public static void main(String[] a)
{
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("enter the string");
String s1=sc.next();
String s2="";
for(int i=s1.length()-1;i>=0;i--)
{
char ch=s1.charAt(i);
s2=s2+ch;
}
if(s1.equals(s2))
{
System.out.println(s1 + "is a palamdrome");
}
else
{
System.out.println(s1 + "is not a palamdrome");
}
System.out.println("do you want to continue");
String choice=sc.next();
//if(choice.equals("no"))
if(choice.equals("yes")!=true)
break;
}
}
}

