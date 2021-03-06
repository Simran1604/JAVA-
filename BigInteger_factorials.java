import java.util.*;
import java.math.BigInteger;

public class  BigInteger_factorials
{
    public static void main (String[] args) throws InputMismatchException
	{
		Scanner sc= new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    System.out.println(fac(n));
		}
		sc.close();
	} 
    
    public static BigInteger fac(int n)
    {
        BigInteger f=new BigInteger("1");
        for(int i=2;i<=n;i++)
        f=f.multiply(BigInteger.valueOf(i));
        return f;
    }
}
