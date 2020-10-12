#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s[50];
  gets(s);
  int a=strlen(s);
  cout<<"The number of letters in the name is "<<a;
}