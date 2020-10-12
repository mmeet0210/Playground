#include<iostream>
using namespace std;
int main()
{
  int n,k,cnt;
  int a[10];
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>k;
  for(int i=0;i<n;i++)
  {
    if(a[i]==k)
    {
      cnt=1;
      break;
    }
  }
  if(cnt==0)
  {
    cout<<"She failed";
  }
  else
  {
    cout<<"She passed her exam";
  }
}