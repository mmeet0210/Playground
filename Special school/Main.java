#include<iostream>
#include<string.h>
using namespace std;
int main() 
{ 
char s[50],rev[50];
gets(s);
gets(rev);
  int i=0;
  int j=strlen(s)-1;
while(i<j)
   {
   char temp=s[i];
   s[i]=s[j];
   s[j]=temp;
   i++;
   j--;
   }
  if(strcmp(s,rev)==0)
  {
    cout<<"It is correct";
  }
  else
  {
    cout<<"It is wrong";
  }
}