#include<iostream>
using namespace std;
int main() {
  int n;
   int largest, i;
  int a[10];
   largest = a[0];
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0; i<n; i++) {
      if(a[i]>largest) {
         largest = a[i];
      }
   }
   cout<<largest;
   return 0;
}