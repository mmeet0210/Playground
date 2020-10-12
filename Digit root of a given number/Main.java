#include<iostream>
using namespace std;
int sum(int n)
{
  int r,add;
  while(n>0 || add>9)
  {
    if(n==0)
    {
      n=add;
      add=0;
    }
    add=add+n%10;
    n=n/10;
  }
  return add;
}
int main()
{
  int n;
  cin>>n;
  cout<<sum(n);
}