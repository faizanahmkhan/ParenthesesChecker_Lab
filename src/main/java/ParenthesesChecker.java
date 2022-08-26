import java.util.List;
import java.util.Stack;

public class ParenthesesChecker {

    public Stack<String> parentheses;

    public static void main(String[] args) {

    Stack<String> parentheses = new Stack<String>();

    parentheses.add("");
    parentheses.add("()");
    parentheses.add("(())");
    parentheses.add("test (for parentheses)");
    parentheses.add("test (for multiple) opening (and closing) brackets");
    parentheses.add("test for (lots of (nested)) brackets");

        }

    public boolean checkParentheses(String testString){
        if (parentheses.search("")){
            return true;
        }


    }







//    public boolean checkParentheses(String testString, Stack<String> onlyParentheses) {
//
////        for(String parentheses : onlyParentheses );
////            if(onlyParentheses.equals(onlyParentheses)){
////                return true;
////            }
////            return false;
////    }

}
