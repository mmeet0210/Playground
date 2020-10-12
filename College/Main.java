#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  struct student
  {
    string name,ci,pp;
    int yr;
  } ;
  
  int n;
  cout<<"Enter the number of colleges";
  cin>>n;
  
   struct student st[n];
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
    cin>>st[i].name;
    cout<<"\nEnter city";
    cin>>st[i].ci;
    cout<<"\nEnter year of establishment";
    cin>>st[i].yr;
    cout<<"\nEnter pass percentage";
    cin>>st[i].pp;
}
  cout<<"\nDetails of colleges";
 for(int i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<i+1;
    cout<<"\nName:"<<st[i].name;
    cout<<"\nCity:"<<st[i].ci;
    cout<<"\nYear of establishment:"<<st[i].yr;
    cout<<"\nPass percentage:"<<st[i].pp;
}
}