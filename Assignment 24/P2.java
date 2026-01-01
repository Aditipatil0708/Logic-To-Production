/*Accept character from user. If character is small display its
corresponding capital character, and if it small then display its
corresponding capital. In other cases display as it is.
Input : Q
Output : q*/

import java.util.*;

class P2
{
    public static void Display(String ch)
    {
        char[] Arr = ch.toCharArray();
        int i = 0;
        char c;

        for(i = 0;i < Arr.length;i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                c = (char)(Arr[i] + 32);
                System.out.println(c);
            }
            else if (Character.isLowerCase(Arr[i]))
            {
                System.out.print(Character.toUpperCase(Arr[i]));
            }
            else
            {
                System.out.println(Arr[i]);
            }
        }

    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        String cVal = sobj.nextLine();

        Display(cVal);

    }
}