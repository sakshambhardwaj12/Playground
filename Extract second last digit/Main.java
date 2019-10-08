#include<stdio.h>
int main()
{int num;
scanf("%d",&num);
  num=num%100;
  num=num/10;
  printf("%d",num);
}