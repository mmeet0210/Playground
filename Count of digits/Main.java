#include<iostream>
using namespace std;
int main()
{
  int a,n=0;
  cin>>a;
  do
  {
    a=a/10;
    n++;
  }
  while(a>0);
  cout<<n;
}