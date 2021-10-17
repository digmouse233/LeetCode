import java.util.LinkedList;

class Solution {
    public String smallestSubsequence(String s, int k, char letter, int repetition) {
        LinkedList<Character> stack = new LinkedList<>();
        int countLetterInStack = 0;
        int leftLetters = s.length();
        int countLetter = 0;
        for (char c : s.toCharArray()) {
            if (c == letter) {
                countLetter++;
            }
        }

        for (char c : s.toCharArray()) {
            while (!stack.isEmpty() && (c < stack.peek() || k - stack.size() < repetition - countLetterInStack)) {
                if (leftLetters + stack.size() <= k) {
                    break;
                }

                if (stack.peek() == letter && countLetter <= repetition) {
                    break;
                }

                if (stack.pop() == letter) {
                    countLetter--;
                    countLetterInStack--;
                }
            }
            stack.push(c);
            leftLetters--;

            if (c == letter) {
                countLetterInStack++;
            }
        }

        while (stack.size() > k) {
            stack.pop();
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}