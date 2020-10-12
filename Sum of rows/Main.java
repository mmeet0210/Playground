#include<iostream>
using namespace std;
int findsum(int s[10][10],int m,int n)
{
  for(int i=0;i<n;i++)
  {
    int sum=0;
    for(int j=0;j<m;j++)
    {
      sum=sum+s[i][j];
    }
    cout<<sum<<"\n";
  }
}
int main()
{
  int m,n,i,j;
  int a[10][10];
  cin>>m>>n;
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  findsum(a,m,n);
  return 0;
}