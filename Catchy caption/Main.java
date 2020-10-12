#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
  char s[101];
  gets(s);
  int l=strlen(s),cnt=0;
  //cout<<l;
  for(int i=0;i<l;i++)
  {
  	if(s[i]==' ')
      cnt++;
  }
  cnt++;
  if(cnt>10)
    cout<<"Caption not eligible for the contest";
  else
     cout<<"Caption eligible for the contest";   
}