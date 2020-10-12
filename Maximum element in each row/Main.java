#include<iostream>
using namespace std;
int findmax(int s[10][10],int m,int n)
{
  for(int i=0;i<m;i++)
  {
    int max=s[i][0];
    for(int j=0;j<n;j++)
    {
      if(s[i][j]>max)
        max=s[i][j];
    }
    cout<<max<<"\n";
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
  findmax(a,m,n);
  return 0;
}