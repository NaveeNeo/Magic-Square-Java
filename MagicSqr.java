class MagicSqr
{

public int n;


public int i=0;
public int j;
public int val=1;
public int [][]a=new int [1000][1000] ;



public MagicSqr(int n)
	{
this.n=n;
j=(n/2);
	}



public void GenMagSqr()
			{

while(val<=(n*n))
	{

if(a[i][j]==0)
		{
a[i][j]=val;
val++;

if((i==0)&&(j==(n-1)))
	{
i=1;
j=(n-1);
	}  
else

if(i==0)
	{
i=(n-1);
j++;
	}
else

if(j==(n-1))
	{
i--;
j=0;
	}
else
	{
i--;
j++;
	}



		}

else


{
i=i+2;
j--;
a[i][j]=val;
val++;
i--;
j++;
}
	}

		}





public void disp()
			{

System.out.println();

System.out.println("Magic Square for order:" +n);
for(i=0; i<n ; i++)
		{
for(j=0; j<n ; j++)
	{
System.out.print(a[i][j] +"\t");
	}
System.out.println();

		}

			}











}