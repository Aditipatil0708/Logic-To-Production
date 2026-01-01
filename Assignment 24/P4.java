/* Accept Character from user and check whether it is special symbol
or not (!, @, #, $, %, ^, &, *).
Input : %
Output : TRUE
Input : d
Output: FALSE */

import java.util.Scanner;

class P4
{
    public static boolean Display(char ch)
    {
        if(ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*')
        {
            return true;
        }
        
        return false;

    }
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Input : ");
        char cVal = sobj.next().charAt(0);

        bRet = Display(cVal);

        if(bRet == true)
        {
            System.out.println("Input is Special Character");
        }
        else
        {
            System.out.println("Input is NOT special Character");
        }

    }
}