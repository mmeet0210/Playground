#include<iostream>
using namespace std;
int main()
{
 int X,Y,R,A;
 float I,d,fs;
 cin>>X>>Y>>R;
 I=(X*Y*R)/100;
  cout<<I<<"\n";
 A=(X+I);
  cout<<A<<"\n";
 d=(0.02*I);
  cout<<d<<"\n";
 fs=(X+I-d);
   cout<<fs;
}