#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int t,even=0,od=0;
  cin>>t;
  int num[10];
  for(int i =0;i<t;i++)
  {
    cin>>num[i];
  }
  for(int i=0;i<t;i++)
  {
    if(num[i]%2==0)
    {
      even=even+1;
    }
    else
    {
      od=od+1;
    }
  }
  cout<<od<<"\n";
  cout<<even;
  return 0;
}