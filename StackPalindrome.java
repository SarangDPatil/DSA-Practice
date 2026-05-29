import java.util.Stack;
public class StackPalindrome {
    public static void main(String[] args) {

        String str = "madam";
        
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()) {
            stack.push(ch);
        }

        String reverse = "";

        while(!stack.isEmpty()) {
            reverse += stack.pop();
        }

        System.out.println(
            str.equals(reverse)
        );
    }
}