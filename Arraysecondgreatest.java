import java.util.Scanner;
class Arraysecondgreatest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the array size");
int size=sc.nextInt();
int ar[]=new int[size];
for(int i=0;i<ar.length;i++)
{
ar[i]=sc.nextInt();
}
int large=0;
int seclar=0;
for(int i=0;i<ar.length;i++)
{
for(int j=i;j<ar.length;j++)
{
if(large<ar[j])
large=ar[j];
}
}
for(int i=0;i<ar.length;i++)
{
for(int j=i;j<ar.length;j++)
{
if(ar[j]==large)
continue;
if(seclar<ar[j])
{
seclar=ar[j];
}
}
}
System.out.println("large number in an array is:"+large);
System.out.println("second large number in an array is:"+seclar);
}
}