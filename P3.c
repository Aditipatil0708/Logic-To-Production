// Accept Character from user and check whether it is digit or not (0-9). 

#include<stdio.h>
#include<stdbool.h>

bool CheckDigit(char *ptr)
{
    bool bflag = true;

    while (*ptr != '\0')
    {
        if((*ptr >= '0') && (*ptr <= '9'))
        {
            ptr++;
        }
        else
        {
            return false;
        }
    }

    return bflag;
}
int main()
{
    char Arr[50] = {'\0'};
    bool iRet = false;

    printf("Enter the String : \n");
    scanf("%[^ \n]s",Arr);

    iRet = CheckDigit(Arr);

    if(iRet == true)
    {
        printf("True");
    }
    else
    {
        printf("False");
    }

    return 0;
}