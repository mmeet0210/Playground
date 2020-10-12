#include<iostream>
using namespace std;
int findmax(int s[10][10],int m,int n)
{
  int max=s[0][0];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(s[i][j]>max){
        max=s[i][j];
      }
    }
  }
  return max;
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
  cout<<"The maximum element is "<<findmax(a,m,n);
  return 0;
}