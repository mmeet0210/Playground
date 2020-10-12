#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s[100];
  int i;
  getline(cin,s[0]);
  for(i=1;s[i-1]!="####";i++)
  	getline(cin,s[i]);
  cout<<s[0]<<endl;
  int c = i--;
  for(int i = 1; i < c; i++) {
    for(int j =0;j<i;j++)
      if(s[i] == s[j]) break;
    int l =s[i-1].size();
    if(s[i][0] != s[i-1][l-1])
      break;
    else
      cout<<s[i]<<endl;
  }
}