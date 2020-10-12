#include<iostream>
using namespace std;
int main()
{
  int c,n;
  cin>>c;
  for(int i=1;i<=c;i++)
  {
    if(c%i==0)
    {
      n++;
    }
  }
    if(n==2)
    {
      cout<<"Eligible";
    }
  else
  {
    cout<<"Not eligible";
  }
 return 0;
} 