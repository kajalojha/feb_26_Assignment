package feb_26_Question_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_Scrambled_String
{
    // Method to check if one string is a scrambled  of the other
    public int isScrambleStr(String s1 , String s2)
    {
        // Check if both strings are identical, if yes, return 1
        if(s1.equals(s2))// check
        {
            return 1;
        }
        // If lengths of both strings are not equal, they cannot be scrambled, return 0
        if(s1.length() != s2.length())
        {
            return 0;
        }
        // Convert strings to character arrays and sort them
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        // If sorted character arrays are not equal, strings cannot be scrambled, return 0
        if(!Arrays.equals(c1,c2))
        {
            return 0;
        }
        int n= s1.length();
        // Explore all possible splits and recursively check if they are scrambled
        for(int i=1;i<n;i++)
        {
            // Split both strings into left and right parts
            String s1left = s1.substring(0,i);
            String s1ryt  = s1.substring(i);
            String s2left = s2.substring(0,i);
            String s2ryt = s2.substring(i);
            String s2rytreversed = s2.substring(n-i);
            // If either of the splits forms a scrambled string, return 1
            if ((isScrambleStr(s1left, s2left) == 1 && isScrambleStr(s1ryt, s2ryt) == 1) ||
                    (isScrambleStr(s1left, s2rytreversed) == 1 && isScrambleStr(s1ryt, s2left) == 1))
            {
                return 1;
            }


        }
       // If no split forms a scrambled string, return 0
           return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first String");
        String s1 = sc.next();
        System.out.println("enter the second String");
        String s2 = sc.next();
        Q3_Scrambled_String obj = new Q3_Scrambled_String();
        int ans = obj.isScrambleStr(s1 ,s2);
        System.out.println(ans);

    }
}
