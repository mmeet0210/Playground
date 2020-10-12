#include<iostream>
using namespace std;
int main()
{
  int n,i,j,k,s;
    scanf("%d",&s);
    for(i=1;i<=4;i++)
    {
        for(k=1;k<=i;k++)
        {
            printf("%d",s);
        }
        s++;
        printf("\n");
    }
    s--;
    for(i=4;i>=1;i--)
    {
        for(k=1;k<=i;k++)
        {
            printf("%d",s);
        }
        s--;
        printf("\n");
    }
    return 0;
}