/* 3. Write a program which accept string from user and display it in reverse order.
Input: "Marvellous"
Output : "SuollevraM" */

/* 3. Write a program which accept string from user and return
difference between frequency of small characters and frequency of
capital characters. */

import java.util.Scanner;

class P5
{
    public static void RevX(String str)
    {
        char[] Arr = str.toCharArray();

        int start = 0;
        int end = ((Arr.length) - 1);

        while(start < end )
        {
            char temp = Arr[start];
            Arr[start] = Arr[end];
            Arr[end] = temp;

            start++;
            end--;
        }

        // Convert char array back to string and print
        String reversed = new String(Arr);    // String object
        System.out.println("Output : " + reversed);
        
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Input : ");

        String str = sobj.nextLine();

        RevX(str);
         
        sobj.close();

    }
}

