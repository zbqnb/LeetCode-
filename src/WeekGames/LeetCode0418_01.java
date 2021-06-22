package WeekGames;

public class LeetCode0418_01 {
    public boolean checkIfPangram(String sentence) {

      char[] ints = sentence.toCharArray();
      int[] Alphabet = new int[26];
        for (int i = 0; i < ints.length; i++) {
           Alphabet[ints[i] - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (Alphabet[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sb = new String("thequickbrownfoxjumpsoverthelazydog");
        LeetCode0418_01 test = new LeetCode0418_01();
        test.checkIfPangram(sb);
    }
}
