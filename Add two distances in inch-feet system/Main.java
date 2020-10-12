#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i1;
  float f1;
  int i2;
  float f2;
  int i;
  float f;
  cin>>i1>>f1>>i2>>f2;
  f = f1 + f2;
  i = i1 + i2;
  if(f>=12) {
    f -= 12;
    i++;
  }
  cout<<i<<"'-"<<f<<"\" ";
  return 0;
}