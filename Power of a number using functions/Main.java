#include<stdio.h>
#include<math.h>
int power(int m, int p)
{
  int x;
  x=pow(m,p);
  return x;
  
}
int main(){
  int n,e,p;
   scanf("%d",&n);
  scanf("%d",&e);
  p=power(n,e);
  printf("%d",p);
  	return 0;
}