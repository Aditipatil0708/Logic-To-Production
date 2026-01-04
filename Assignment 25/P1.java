/* 1.Write a program which accept string from user and count number of
capital characters. */

import java.util.Scanner;

class P1
{
    public static int CountCapital(String str)
    {
        char[] Arr = str.toCharArray();

        int i = 0;
        int iCount = 0;

        for(i = 0; i < Arr.length;i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
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

        iCnt = CountCapital(str);

        System.out.println("Count of th captial in the String in : " + iCnt);

        sobj.close();
    }
}