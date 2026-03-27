package day7;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {
        int hl = haystack.length();
        int nl = needle.length();

        if (nl == 0) return 0;

        for (int i = 0; i <= hl - nl; i++) {
            if (haystack.substring(i, i + nl).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

}
