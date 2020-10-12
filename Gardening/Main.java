#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,t;
  cin>>r>>c>>t;
  if((t>r && t<=2*r) || (t<=r*(c-1) && t>r*(c-2)))
     cout<<"It is a mango tree";
  else
     cout<<"It is not a mango tree";
     return 0;
}