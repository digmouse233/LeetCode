class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int base = 1;

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        while (true) {
            char pop = stack.pop();
            res += base * map.get(pop);
            if (stack.empty()) {
                break;
            }
            if (map.get(stack.peek()) < map.get(pop)) {
                base = -1;
            } else {
                base = 1;
            }
        }

        return res;
    }
}