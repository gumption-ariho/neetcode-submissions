class Solution {
    public boolean isValid(String s) {
        //({}]
        Stack<Character> stack = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '[' || i == '{' || i == '(') {
                stack.push(i);
            } else {
                switch (i) {
                    case ']':
                        if (stack.isEmpty() || stack.peek() != '[') {
                            return false;
                        }
                        stack.pop();

                        break;
                    case ')':
                        if (stack.isEmpty() || stack.peek() != '(') {
                            return false;
                        }
                        stack.pop();
                        break;
                    case '}':
                        if (stack.isEmpty() || stack.peek() != '{') {
                            return false;
                        }
                        stack.pop();
                        break;
                }
            }
        }
        return stack.isEmpty();
    }
}
