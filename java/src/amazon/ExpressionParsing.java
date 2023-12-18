package amazon;

import java.util.Stack;

public class ExpressionParsing {

    public static void main(String[] args) {
        String postFix = "a b + c ∗ d -";
        System.out.println(String.format("Postfix to Infix:\n%s gives %s", postFix, postFixToInfix(postFix)));
    }

    /*
        POSTFIX TO INFIX
        Step 1 − scan the expression from left to right
        Step 2 − if it is an operand push it to stack
        Step 3 − if it is an operator pull operand from stack and perform operation
        Step 4 − store the output of step 3, back to stack
        Step 5 − scan the expression until all operands are consumed
        Step 6 − pop the stack and perform operation
     */
    public static String postFixToInfix(String expression) {
        expression = expression.replace(" ", "");
        String output = "";
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char currentCharacter = expression.charAt(i);
            if (Character.isAlphabetic(currentCharacter)) {
                stack.push(String.valueOf(currentCharacter));
            } else {
                String a = stack.pop();
                String b = stack.pop();
                String exp = String.format("(%s%s%s)", b, currentCharacter, a);
                stack.push(exp);
            }
        }
        output = stack.peek();
        return output.substring(1, output.length()-1);
    }

}
