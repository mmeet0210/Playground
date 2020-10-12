#include<iostream>
using namespace std;
int isMagicSquare(int ma[5][5], int n)
{  
    int sum1=0,sum2=0;
    for (int i=0;i<n;i++) 
        sum1=sum1+ma[i][i];
    for (int i=0;i<n;i++) 
        sum2=sum2+ma[i][n-1-i]; 
    if(sum1 != sum2)  
        return 0;
}
int main()
{
  int m,n,i,j;
  int a[5][5];
  cin>>n;
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  if (isMagicSquare(a,n))
      {
        cout<<"Yes";
      }
      else
      {
        cout<<"No";
      }
 }