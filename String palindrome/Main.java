#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str[20];
  int i,len,flag=0;
 scanf("%s",str);
  len=strlen(str);
  for(int i=0;i<len;i++)
  {
    if(str[i]!=str[len-i-1])
    {
      flag=1;
      break;
    }
  }
  if(flag==1)
  {
    printf("%s is not a palindrome",str);
  }
  else
  {
    printf("%s is a palindrome",str);
  }
  return 0;
}