#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int temp = 0;
  int i = 1;
  int k = 0;
  int a = 1;
  cout<<"0"<<" ";
  while(temp!=n-1)
  {
    k = k+2*i;
    cout<<k<<" ";
    if(a%2!=0)
    {
    i=i+2;
    }
    else
    {
      i=i+0;
    }
    temp+=1;
    a+=1;
  }
}