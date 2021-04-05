package WeekGames;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode2021_0404 {

        public void truncateSentence(String s, int k) {
            int count = 0;
            Deque<Character> deque = new ArrayDeque<>();

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) != ' ') {
                    deque.add(s.charAt(i));
                } else {
                    StringBuffer sb = new StringBuffer();
                    for (int j = 0; j < deque.size(); j++) {
                        sb.append(deque.peek());
                    }
                }
            }

        }


}
