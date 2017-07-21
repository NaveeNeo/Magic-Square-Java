import java.util.*;
class Client
{
public static void main(String[] args)
		{
int n;

System.out.println("Please Enter order of the Square \n Note:Order should be odd only");
Scanner in = new Scanner(System.in);
n=in.nextInt();
in.close();

MagicSqr s1;
s1=new MagicSqr(n);
s1.GenMagSqr();
s1.disp();





		}



}