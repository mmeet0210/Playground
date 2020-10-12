#include<iostream>
using namespace std;
int main()
{
  
  int n,even=0,odd=0;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int arr[n];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>arr[i];
  for(int i=0;i<n;i++)
  {
    if(arr[i]%2==0)
      even++;
    else
      odd++;
  }
  if(even==0)
    cout<<"\nThe array is Odd";
  else if(odd==0)
    cout<<"\nThe array is Even";
  else
    cout<<"\nThe array is Mixed";
  return 0;
}