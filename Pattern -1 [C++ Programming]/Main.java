#include<bits/stdc++.h>
using namespace std;

int main(){ 
   int i, j, n;    
  cin>>n; 
  for(i = 1; i<n; i++)    
  {        
      for(j = i-1; j<n; j++)        
      {            
    	cout<<i;       
      }       
      cout<<endl;   
   } 
  cout<<j;
  return 0;
}