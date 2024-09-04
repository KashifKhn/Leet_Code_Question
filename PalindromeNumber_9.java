// Question Link https://leetcode.com/problems/palindrome-number/description/

public class PalindromeNumber_9 {

    public static boolean isPalindrome(int x) {
        int reve =0 ;
        int org = x;
        if(x<0)
            return false;
        if(x<10) 
            return true;
        if(x%10==0) 
            return false;
        
        while(x>0) {
            reve = reve*10 +x%10;;
            x/=10;
        }

        if(reve == org )
            return true;
        else 
            return false;        
    }

    public static void main(String[] args) {
        int x = 121;
        if(isPalindrome(x))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");

    }
    
}
