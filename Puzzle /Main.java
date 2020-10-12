#include<iostream>
using namespace std;
int main()
{
   int m[10][10], transM[10][10], r, c;
   cin>>r>>c;
   for(int i =0;i<r;i++) 
   {
     for(int j=0;j<c;j++) 
     {
       cin>>m[i][j];
     }
   }
   // Finding the transpose matrix.
  for(int i=0;i<r;i++) 
  {
    for(int j=0;j<c;j++) 
    {
      transM[j][i] = m[i][j];
    }
  }
  //Displaying the transpose matrix
  for(int i=0;i<c;i++) 
  {
    for(int j=0;j<r;j++) 
    {
      cout<<transM[i][j]<<" ";
      if(j==r-1)
        cout<<endl;
    }
  }
  return 0;
}