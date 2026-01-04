/* Write a program which accept string from user and check whether
it contains vowels in it or not.
Input : "marvellous"
Output : TRUE
Input : "Demo"
Output: TRUE
Input : "xyz"
Output : FALSE */

import java.util.Scanner;

class P4
{
    public static boolean CheckVowel(String str)
    {
        boolean bFlag = false;

        char[] Arr = str.toCharArray();

        for(int i = 0;i < Arr.length;i++)
        {
            if(Arr[i] == 'a' || Arr[i] == 'e' || Arr[i] == 'i' || Arr[i] == 'o' || Arr[i] == 'u' ||
                Arr[i] == 'A' || Arr[i] == 'E' || Arr[i] == 'I' || Arr[i] == 'O' || Arr[i] == 'U' )
                {
                    bFlag = true;
                }
                else{
                    return bFlag;
                }       
        }
        return bFlag;
    }
    
    public static void main(String arg[])
    {
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Input : ");

        String str =  sobj.nextLine();

        bRet = CheckVowel(str);

        if(bRet == true)
        {
            System.out.println("TRUE");
        }
        else{
            System.out.println("False");

        }

        sobj.close();

    }
}





