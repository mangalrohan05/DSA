class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> paran = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(')
                paran.push(i);
            else if (c == '*')
                star.push(i);
            else if (c == ')') {
                if (!paran.isEmpty())
                    paran.pop();
                else if (!star.isEmpty())
                    star.pop();
                else
                    return false;
            }
        }

        while (!paran.isEmpty() && !star.isEmpty()) {
            if (paran.pop() > star.pop())
                return false;
        }

        return paran.isEmpty();
    }
}