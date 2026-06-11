package Projects;

public class number_analysis_tool {
    static void main(String[] args) {
        int n = 12321;
        int original = n;
        int rev = 0;
        int sum = 0;
        int count = 0;

        while(n > 0){
            count++;
            int digit = n % 10;
            rev = rev * 10 + digit;
            sum = sum+digit;
            n = n / 10;

        }
        System.out.println(count);
        System.out.println(sum);
        System.out.println(rev);
        if(rev == original){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not a palindrome number");
        }


    }}



