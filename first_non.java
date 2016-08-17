import java.io.*;
import java.util.*;
class first_non
{
public static void main(String args[])
{
int count=0;
Scanner in=new Scanner(System.in);
ArrayList<Integer> aaa=new ArrayList<Integer>();
System.out.println("Enter the number of elements");
int len=in.nextInt();
int[] a=new int[len];
for(int i=0;i<len;i++)
aaa.add(in.nextInt());
Collections.sort(aaa);

	for(int i=0;i<len;i++)
	{
		
	if(aaa.get(i)==aaa.get(i+1))
	{
	aaa.remove(i);
	aaa.remove(i);
	len=aaa.size();
	i=0;
	if(aaa.size()==1)
	break;
	}

	}
System.out.println(aaa);
}
}