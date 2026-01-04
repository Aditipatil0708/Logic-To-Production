/* 2. Write a program which accept string from user and count number of
small characters. */


import java.util.Scanner;

class P2
{
    public static int CountSmall(String str)
    {
        char[] Arr = str.toCharArray();

        int i = 0;
        int iCount = 0;

        for(i = 0; i < Arr.length;i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                iCount++;
            }

        }
        return iCount;
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Input : ");

        String str = sobj.nextLine();

        int iCnt = 0;

        iCnt = CountSmall(str);

        System.out.println("Count of th captial in the String in : " + iCnt);

        sobj.close();
    }
}

