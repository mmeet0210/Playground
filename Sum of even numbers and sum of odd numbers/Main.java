#include<iostream>
using namespace std;
int main()
{
  int n,even,odd;
  cin>>n;
  int a[15];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      even=even+a[i];
    }
    else
    {
      odd=odd+a[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<even;
  cout<<"\nThe sum of the odd numbers in the array is "<<odd;
  return 0;
}