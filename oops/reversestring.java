package oops;

public class reversestring {
    public static void main(String[] args) {
        String palindrome="Snp since 2004";
        int len=palindrome.length();
        char[] tempCharArray=new char[len];
        char[] charArray=new char[len];

        // putting th e string in the array of characters
        for(int i=0;i<len;i++)
        {
            tempCharArray[i]=palindrome.charAt(i);

        }
        //System.out.println(tempCharArray);

        // for reverse the string

        for(int j=0;j<len;j++)
        {
            charArray[j]=tempCharArray[len-1-j];
        }

        // String reversePalindrome=new String(charArray);
        // System.out.println(reversePalindrome);
        System.out.println(charArray);
    }
    
}

