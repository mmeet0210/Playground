#include<iostream>
using namespace std;
int fact(int n)
{
  int factorial=1;
  if(n==0)
  {
    cout<<"The factorial of"<<n<<" is 1\n";
  }
  else if(n>1)
  {
 	factorial=n*fact(n-1); 
  }
  return factorial;
}
int main()
{
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
}