class Solution {
    public boolean isValid(String s) {
        Deque<String> stack = new ArrayDeque<>();
        String[] m = s.split("");
        for (int i = 0; i < m.length; i++) {
            if (m[i].equals("(") || m[i].equals("[") || m[i].equals("{")) {
                stack.push(m[i]);
            } else if (m[i].equals(")")) {
            if (stack.isEmpty() == true) {
                return false;
            }
                else if (!stack.peek().equals("(")) {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (m[i].equals("}")) {if (stack.isEmpty() == true) {
                return false;
            }
                else if (!stack.peek().equals("{")) {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (m[i].equals("]")) {
                if (stack.isEmpty() == true) {
                return false;
            }
                else if (!stack.peek().equals("[")) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }  if(stack.isEmpty()== false){
           return false;
           }
        return true;
    }
}