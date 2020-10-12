#include<iostream>
using namespace std;
int swap(int &x,int &y)
{
  cout<<"\nAfter swapping a= "<<y<<" and b="<<x;
}
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b;
  swap(a,b);
}
  