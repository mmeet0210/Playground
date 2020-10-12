#include<iostream>
#include<ctype.h>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  int ws=0,v=0,c=0,sy=0,d=0;
  getline(cin,s);
  for(int i=0;s[i]!='\0';i++)
  {
    if(s[i]==' ')
      ws++;
    else if(isalpha(s[i]))
    {
      if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' || s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U')
      	v++;
      else
        c++;
    }
    else if(isdigit(s[i]))
      d++;
    else
      sy++;
  }
  cout<<"Vowels:"<<v<<"\nConsonants:"<<c<<"\nWhite Spaces:"<<ws<<"\nDigits:"<<d<<"\nSymbols:"<<sy;
}