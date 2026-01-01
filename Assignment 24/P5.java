/* 5. Accept character from user and display its ASCII value in decimal,
octal and hexadecimal format.
Input : A

Decimal 65
Octal 0101
Hexadecimal OX41
 */

import java.util.Scanner;

class P5
{
    public static void Display(char ch)
    {
        int val = ch;   // ASCII value

        // Decimal
        System.out.println("Decimal : " + val);

        // Octal
        System.out.print("Octal : ");
        int temp = val;
        String octal = "";

        while (temp > 0)
        {
            octal = (temp % 8) + octal;
            temp = temp / 8;
        }
        System.out.println(octal);

        // Hexadecimal
        System.out.print("Hexadecimal : 0X");
        temp = val;
        String hex = "";

        while (temp > 0)
        {
            int rem = temp % 16;

            if (rem < 10)
                hex = rem + hex;
            else
                hex = (char)(rem - 10 + 'A') + hex;

            temp = temp / 16;
        }
        System.out.println(hex);
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Input : ");
        char cVal = sobj.next().charAt(0);

        Display(cVal);

        sobj.close();
    }
}
