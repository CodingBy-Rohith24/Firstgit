import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count1=0;
int temp1=1;
int sum=0;
for(int i=0;i<=1000;i++)
{
count1=0;
sum=0;
while(temp1>0)
{
temp1=temp1/10;
count1++;
temp1++;
}
int temp2=1;
while(temp2>0)
{
int rem=temp2%10;
sum=sum+(int)Math.pow(rem,count1);
temp2=temp2/10;
temp2++;
}
if(sum==i)
System.out.println("the armstrong number is:"+i);//printing armstrong number 
}
}
}
