#include<iostream>
using namespace std;
int main()
{
  int r,c,t,flag=0;
  cin>>r>>c>>t;
  for(int i=1;i<=r;i++)
  {
    if(t==i)
    {cout<<"Yes";
     flag=1;
     break;}
    else if(t == ((i-1)*r+1))
    {cout<<"Yes";
     flag=1;
     break;}
    else if(t == i*r)
    {cout<<"Yes";
     flag=1;
     break;}
  }
  if(flag==0)
    {cout<<"No";
    }
  return 0;
}