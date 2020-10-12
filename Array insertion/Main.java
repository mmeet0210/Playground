#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,val,loc;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int arr[n+1];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>arr[i];
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>loc;
  if(loc>n)
  {cout<<"\nInvalid Input";
   return 0;}
  cout<<"\nEnter the value to insert";
  cin>>val;
  for(int i=n;i>=loc-1;i--)
    arr[i+1]=arr[i];
  arr[loc-1]=val;
  cout<<"\nArray after insertion is\n";
  for(int i=0;i<n+1;i++)
    cout<<arr[i]<<endl;
}