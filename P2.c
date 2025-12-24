// Accept Character from user and check whether it is capital or not (A-Z).

#include<stdio.h>
#include<stdbool.h>

bool CheckCapital(char *ptr)
{
    bool bflag = false;

    while (*ptr != '\0')
    {
        if((*ptr >= 'A') && (*ptr <= 'Z'))
        {
            bflag = true;
        }
        else
        {
            bflag = false;
        }
        ptr++;
    }

    return bflag;
}
int main()
{
    char Arr[50] = {'\0'};
    bool iRet = false;

    printf("Enter the String : \n");
    scanf("%[^ \n]s",Arr);

    iRet = CheckCapital(Arr);

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