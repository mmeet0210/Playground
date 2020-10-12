#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fb, sb, tb;
  cin>>fb>>sb>>tb;
  if(fb>=sb && fb>=tb)
  {
    if(sb>=tb)
      cout<<"The treasure is in box which has number "<<sb;
    else
      cout<<"The treasure is in box which has number "<<tb;
  }
  else if(sb>=fb && sb>=tb)
  {
    if(fb>=tb)
      cout<<"The treasure is in box which has number "<<fb;
    else
      cout<<"The treasure is in box which has number "<<tb;
  }
  else
  {
    if(fb>=sb)
      cout<<"The treasure is in box which has number "<<fb;
    else
      cout<<"The treasure is in box which has number "<<sb;
  }
  int hcf,st;
  st = fb<sb?(fb<tb?fb:tb):(sb<tb?sb:tb);
  for(hcf = st; hcf>=1; hcf--)
  {
    if(fb%hcf==0 && sb%hcf==0 && tb%hcf==0)
      break;
  }
  cout<<"\nThe code to open the box is "<<hcf;
}