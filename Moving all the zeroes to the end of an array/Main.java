#include <stdio.h>
int main()
{
   int i,n,a[100],c[100],j=0,k;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    if(a[i]!=0)
    {
      c[j]=a[i];
    j++;
    }
  }
   for(i=0;i<n;i++)
  {
    if(a[i]==0)
    {
      c[j]=a[i];
    j++;
    }
  }
  for(k=0;k<n;k++)
  {
  printf("%d ",c[k]);
}
}
  