#include<iostream>
#include <string>
using namespace std;
struct Student { 
  string name; 
  string department; 
  int yearOfStudy; 
  float cgpa; };
int main()
{
  //Type your code here.
  cout<<"Enter the number of students\n";
  int a;cin>>a;
  Student b[a];
  for(int i = 0; i < a; i++) {
  	cout<<"Enter the details of student "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    cin>>b[i].name;
    cout<<"Enter department\n";
    cin>>b[i].department;
    cout<<"Enter year of study\n";
    cin>>b[i].yearOfStudy;
    cout<<"Enter cgpa\n";
    cin>>b[i].cgpa;
  }
  cout<<"Details of students\n";
  for(int j = 0; j < a; j++) {
    for(int i = 0; i < a - 1; i++) {
      if(b[i].name > b[i+1].name) {
        Student s;
        s = b[i];
        b[i] = b[i+1];
        b[i+1] = s;
      }
    }
  }
  for(int j = 0; j < a; j++) {
  	cout<<"Student "<<j+1<<endl<<"Name:";
    cout<<b[j].name<<endl;
    cout<<"Department:";
    cout<<b[j].department<<endl;
    cout<<"Year of study:";
    cout<<b[j].yearOfStudy<<endl;
    cout<<"CGPA:";
    cout<<b[j].cgpa<<endl;
  }
  return 0;
}