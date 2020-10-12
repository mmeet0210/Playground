#include<iostream>
using namespace std;
int main()
{
  struct employee
  {
    int id;
    char name[20];
    int age;
    char designation[20];
    int salary;
  }s;
  cout<<"Enter name:";
  cin>>s.name;
  cout<<"\nEnter ID:";
  cin>>s.id;
  cout<<"\nEnter age:";
  cin>>s.age;
  cout<<"\nEnter designation:";
  cin>>s.designation;
  cout<<"\nEnter Salary:";
  cin>>s.salary;
  
  cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<s.name;
  cout<<"\nID of the Employee : "<<s.id;
  cout<<"\nAge of the Employee : "<<s.age;
  cout<<"\nDesignation of the Employee : "<<s.designation;
  cout<<"\nSalary of the Employee : "<<s.salary;
}