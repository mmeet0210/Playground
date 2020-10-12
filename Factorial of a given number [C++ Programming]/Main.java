#include<bits/stdc++.h>
using namespace std;

int main()
{  
long int fact = 1, n, i;
cin>>n;

for(i =n; i >=1; i--)
{
     fact = fact * i;
}

cout<<fact;  
return 0;
}
