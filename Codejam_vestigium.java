
   import java.util.*;
   class Codejam_vestigium
   {
	   public static void main(String args[]) throws InputMismatchException
	   {
		  Scanner sc=new Scanner(System.in); 
		  int t=sc.nextInt();
		  int tr=0,c=0,r=0;
		  for(int p=0;p<t;p++)
		  {
			  int n=sc.nextInt();
			  int a[][]=new int[n][n];
			  for(int i=0;i<n;i++)
			  {
				  for(int j=0;j<n;j++)
				  {
					  a[i][j]=sc.nextInt();
				  }
			  }
			  for(int i=0;i<n;i++)
			  {
				  for(int j=0;j<n;j++)
				  {
					  if(i==j)
					  tr+=a[i][j];
				  }
			  }
			  System.out.print("Case #"+p+1+": "+tr+" ");
			  for (int i=0;i<n;i++)
			  {
				  for(int j=0;j<n-1;j++)
				  {
					  if(a[i][j]==a[i][j+1])
					  {
						  c++;
						  break;
					  }
				  }
			  }
			  System.out.print(c+" ");
			  for (int j=0;j<n;j++)
			  {
				  for(int i=0;i<n-1;i++)
				  {
					  if(a[i][j]==a[i+1][j])
					  {
						  r++;
						  break;
					  }
				  }
			  }
			  System.out.print(r);
		  }
		  sc.close();
	   }
   }