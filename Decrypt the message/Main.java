#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  int i=1,sum=0;
  cin>>x>>y;
  z=x+y;
  while(i<z)
  {
	if(z%i==0)
      sum=sum+i;
    i++;
  }
  if(sum==z)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  return 0;
}
  
  