import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution6 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')','(');
        mapping.put('}','{');
        mapping.put(']','[');

        for(char c: s.toCharArray()){
            if(mapping.containsValue(c)){
                stack.push(c);
            }else if(mapping.containsKey(c)){
                if(stack.isEmpty() || mapping.get(c) != stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}