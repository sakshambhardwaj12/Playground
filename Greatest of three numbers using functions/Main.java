#include <stdio.h>
int greatest(int num1,int num2,int num3)
{
  int largest=0;
if ((num1 >= num2) && (num1 >= num3))
{
   largest = num1;
  printf("%d",largest);
}
else if ((num2 >= num1) && (num2 >= num3))
{
   largest = num2;
  printf("%d",largest);
}
  else
{
   largest = num3;
     printf("%d",largest);
}
}
int main(){
  int n1,n2,n3;
	scanf("%d %d %d",&n1,&n2,&n3);
  	greatest(n1,n2,n3);
  	return 0;
}