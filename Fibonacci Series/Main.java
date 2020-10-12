#include<iostream>
#include<stdio.h>
using namespace std;
int fib(int n)
{
 int a=0,b=1,c,i;
  if(n==0)
    return a;
  for(i=2;i<=n;i++)
  {
    c=a+b;
    a=b;
    b=c;
}
  return b;
}
int main()
{
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n-1);
  return 0;
}