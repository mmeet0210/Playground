#include <iostream>
using namespace std;
int main() 
{
  int a,r=0,rem;
  cin>>a;
  while(a!=0)
  {
    rem=a%10;
    r=r*10+rem;
    a=a/10;
  }
  cout<<r;
    return 0;
}