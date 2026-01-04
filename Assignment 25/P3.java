/* 3. Write a program which accept string from user and return
difference between frequency of small characters and frequency of
capital characters. */

import java.util.Scanner;

class P3
{
    public static int Difference(String str)
    {
        char[] Arr =str.toCharArray();

        int iDiff = 0;
        int iCap = 0;
        int iSmall = 0;

        for(int i = 0;i< Arr.length;i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                iCap++;
            }
            else if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                iSmall++;
            }
            else{
                return 0;
            }

            iDiff = Math.abs(iCap - iSmall);

        }
        return iDiff;
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Input : ");

        String str = sobj.nextLine();

        int iRet = 0;

        iRet = Difference(str);

        System.out.println("Difference of small and capital letter is : " + iRet);

    }
}