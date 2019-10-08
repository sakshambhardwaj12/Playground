#include<stdio.h>
int sum(int n);
int main()
{
  int b;
  scanf("%d",&b);
    sum(b);
  	return 0;
}
int sum(int n)
{
  int s;
  s=(n*(n+1))/2;
  printf("%d",s);
}