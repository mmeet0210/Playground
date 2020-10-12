#include<iostream>
using namespace std;
int main()
{
  int n,m,s=0;
  cin>>n>>m;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
    s+=arr[i];
  }
  if(s<=m)
    cout<<"YES";
  else
    cout<<"NO";
}