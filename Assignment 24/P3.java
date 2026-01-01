/* 3. Accept character from user. If it is capital then display all the
characters from the input characters till Z. If input character is small
then print all the characters in reverse order till a. In other cases
return directly.
Input : Q
Output :Q R S T U V W X Y Z 

Input : a
Output : m, l, k, j, i, h, g, f, e, d, c, b, a
*/

import java.util.Scanner;

class P3
{
    public static void Display(char ch)
    {
        if(ch >= 'A' && ch <='Z')
        {
            for(char c = ch; c <= 'Z';c++)
            {
                System.out.print(c + " ");
            }
        }
        else if (ch >= 'a' && ch <='z')
        {
            for(char c = ch; c >= 'a';c--)
            {
                System.out.print(c + " ");
            }

        }
        else{
            System.out.println(ch);
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Input : ");
        char cVal = sobj.next().charAt(0);

        Display(cVal);

    }
}
