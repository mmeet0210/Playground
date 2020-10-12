#include<iostream>
#include<math.h>
using namespace std;
int bacteria(int,int);
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int s= bacteria(m,n);
  if(s>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
int bacteria(int x,int y)
{
  int a=pow(x,y);
  return a;
}