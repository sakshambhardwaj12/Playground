// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int i,n,a[100],max=0,f;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
      scanf("%d",&a[i]);
  } 
  for(i=0;i<n;i++)
  {
    if(a[i]>max)
    {
      max=a[i];
      f=i;
    }
  }
  printf("%d",f);


  
   return 0;
}