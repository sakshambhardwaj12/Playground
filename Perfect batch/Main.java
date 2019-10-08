/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int i,n,a[100],sum1=0,sum=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n/2;i++)
  {
    sum=sum+a[i];
  }
  for(i=n/2;i<n;i++)
  {
    sum1=sum1+a[i];
  }
  if(sum==sum1)
  {
    printf("Perfect Batch");
  }
  else
  {
    printf("Not a Perfect Batch");
  }
  
    
    
  return 0;
}