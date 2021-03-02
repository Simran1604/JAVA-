
   import java.util.*;
   class Codejam_vestigium
   {
	   public static void main(String args[]) throws InputMismatchException
	   {
		  Scanner sc=new Scanner(System.in); 
		  int t=sc.nextInt();
		  int tr=0,c=0,r=0,is=0;

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
			  System.out.print("Case #"+(p+1)+": "+tr+" ");
			  tr=0;
			  
			  for (int i=0;i<n;i++)
			  {
				  for(int j=0;j<n;j++)
				  {
					  for(int k=j+1;k<n;k++)
					  {
						  if(a[i][j]==a[i][k])
						  {is=1;
						   break;
						  }

					  }
					  if(is==1)
				  {c++;
				  is=0;
				  break;
				  }
				  }
			  }
			  is=0;
			  System.out.print(c+" ");
			  c=0;
			  for (int j=0;j<n;j++)
			  {
				  for(int i=0;i<n-1;i++)
				  {
					  for(int k=i+1;k<n;k++)
					  {
						  if(a[i][j]==a[k][j])
					  {
						  is=1;
						  break;
					  }
					}
					if(is==1)
				  {r++;
				  is=0;
				  break;
				  } 
				  }
				  
			  }
			  System.out.print(r);
			  r=0;
		  }
		  sc.close();
	   }
   }