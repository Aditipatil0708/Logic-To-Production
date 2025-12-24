/* 5. Accept division of student from user and depends on the division
display exam timing. There are 4 divisions in school as A,B,C,D. Exam
of division A at 7 AM, B at 8.30 AM, C at 9.20 AM and D at 10.30 AM.
(Application should be case insensitive) */ 

#include<stdio.h>

void DisplaySchedule(char cVal)
{
    switch(cVal)
    {
        case 'A' :
        case 'a' :
        {
            printf("7 AM \n");
            break;
        }

        case 'B' :
        case 'b' :
        {
            printf("8.30 AM");
            break;
        }

        case 'C' :
        case 'c' :
        {
            printf("9.20 AM");
            break;
        }

        case 'D' :
        case 'd' :
        {
            printf("10.30 AM");
            break;
        }
    }
}

int main()
{
    char ch = '\0';

    printf("enter the divison : \n");
    scanf("%[^ \n]s",&ch);

    DisplaySchedule(ch);
    
    return 0;
}