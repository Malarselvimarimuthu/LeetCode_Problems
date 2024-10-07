class Solution {
    public int compress(char[] chars) {
        char old = chars[0];
        int cnt = 0;
        int index = 0;

        for (char ch : chars) {
            if (ch == old) {
                cnt++;
            } else {
                chars[index++] = old;
                if (cnt > 1) {
                    String countStr = String.valueOf(cnt);
                    for (char c : countStr.toCharArray()) {
                        chars[index++] = c;
                    }
                }
                old = ch;
                cnt = 1;
            }
        }

        // Add the last group to the array
        chars[index++] = old;
        if (cnt > 1) {
            String countStr = String.valueOf(cnt);
            for (char c : countStr.toCharArray()) {
                chars[index++] = c;
            }
        }

        return index;
    }
}
