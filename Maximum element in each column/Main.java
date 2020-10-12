#include<iostream>
using namespace std;
int findmax(int s[10][10],int m,int n)
{
  for(int i=0;i<n;i++)
  {
    int max=s[0][i];
    for(int j=0;j<m;j++)
    {
      if(s[j][i]>max)
        max=s[j][i];
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