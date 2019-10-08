#include<stdio.h>
int square(int n);
int main() {
   int a;
  scanf("%d",&a);
  square(a);
   return 0;
}
int square(int n)
{
  int s;
  s=n*n;
  printf("%d",s);
}