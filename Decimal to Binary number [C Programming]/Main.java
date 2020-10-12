#include<stdio.h>
int dec_to_bin(int n)
{
   int rem, rev=0, power=1;
  while(n!=0)
  {
    rem=n%2;
    rev=rev+rem*power;
    n=n/2;
    power=power*10;
  }
  return rev;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
