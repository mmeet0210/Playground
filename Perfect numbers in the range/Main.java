#include<iostream>
using namespace std;
int main()
{
  int a,z;
  int sum=0,p,i;
  cin>>a>>z;
  for(i=a;i<=z;i++)
  {
    p=1;
    while(p<=(i/2))
    {
      if(i%p==0)
      sum=sum+p;
      p++;
    }
    if(sum==i)
    cout<<i<<" ";
    sum=0;
  }
  return 0;
}
  