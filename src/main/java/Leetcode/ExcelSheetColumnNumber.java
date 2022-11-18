package Leetcode;

public class ExcelSheetColumnNumber {

    public static int titleToNumber(String s)
    {
        int ans=0;
        for(char c:s.toCharArray())
        {
            ans= ans*26 + (c-'A'+1);
        }

        return ans;
    }

    public static void main(String args[])
    {

        System.out.println( titleToNumber("BC") ) ;
    }


}
