package codility;

import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class ValidParenthesis {

    public static void main(String[] args) {

        String a = "abc";
        String b = "abc";
        System.out.println(a.concat(b));


//        System.out.println(ValidParenthesis.isValid("(){}{[]}"));
    }



    public static boolean isValid(String s) {
        int len = s.length();
        if ((s.length() % 2) != 0) {
            return false;
        }
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push("(");
            } else if (s.charAt(i) == '{') {
                stack.push("{");
            } else if (s.charAt(i) == '[') {
                stack.push("[");
            } else if (s.charAt(i) == ')') {
                if (stack.peek().equals("(")) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (stack.peek().equals("[")) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (stack.peek().equals("{")) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
