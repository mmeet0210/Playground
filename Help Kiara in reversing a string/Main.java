#include <iostream>
#include<string.h>
using namespace std;
int main()
{
char str[100];     
int len, i,j,temp;    
gets(str);
len=strlen(str);
  for(i=0,j=len-1;i<len/2;++i,--j)
  {
    temp=str[i];
    str[i]=str[j];
    str[j]=temp;
  }
cout<<str;
}