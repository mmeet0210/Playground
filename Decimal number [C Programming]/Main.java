#include<stdio.h>
int dec_to_oct(int n)
{
    int rem, oct, power=1;
  while(n!=0)
  {
  	rem=n%8;
    oct=oct+rem*power;
    n=n/8;
   power=power*10;
  }
  return oct;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_oct(n));
}
