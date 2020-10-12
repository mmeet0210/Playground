#include<iostream>
using namespace std;
 int main()
{
 	int i, j, rows, columns, a[10][10], Sum;
  
 	cin>>i>>j;
 
 	for(rows = 0; rows < i; rows++)
  	{
   		for(columns = 0; columns < j; columns++)
    	{
      		cin>>a[rows][columns];
    	}
  	}
  int rmax=0,ri;
   	 cout<<"Sum of rows is ";
 	for(rows = 0; rows < i; rows++)
  	{
  		Sum = 0;
  		for(columns = 0;columns < j; columns++)
  		{
  			Sum = Sum + a[rows][columns];
		}
      	if(rmax<Sum)
        {rmax=Sum;
          ri = rows;}
   		cout<<Sum<<" ";
  	}
  cout<<"\nRow "<<ri+1<<" has maximum sum";
  
  int cmax=0,ci;
	 cout<<"\nSum of columns is ";
 	for(rows = 0; rows < i; rows++)
  	{
  		Sum = 0;
  		for(columns = 0;columns < j; columns++)
  		{
  			Sum = Sum + a[columns][rows];
		}
      if(cmax < Sum)
      {
        cmax=Sum;
        ci = rows;}
   		cout<<Sum<<" ";
  	  }  	
 cout<<"\nColumn "<<ci+1<<" has maximum sum";
 return 0;
}