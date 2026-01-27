import java.util.HashMap;
import java.util.HashSet;

public class ContainsValidAnagram {
    static boolean containsValidAnagram(String s, String t) {
        //Program wants to check if a word contains all the same letters and letter counts of a specific second word.
        //Create two hashmaps with the letters as the key and the values as the count. Compare the two hashmaps when done.
        //Is there a possible better solution with only one hashmap?
        HashMap<Character, Integer> hashMapS = new HashMap<>();
        HashMap<Character, Integer> hashMapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (hashMapS.containsKey(s.charAt(i))) {
                hashMapS.put(s.charAt(i), hashMapS.get(s.charAt(i)) + 1);
            }
            else {
                hashMapS.put(s.charAt(i), 1);
            }

            if (hashMapT.containsKey(t.charAt(i))) {
                hashMapT.put(t.charAt(i), hashMapT.get(t.charAt(i)) + 1);
            }
            else {
                hashMapT.put(t.charAt(i), 1);
            }
        }
        return hashMapS.equals(hashMapT);
    }

//        THIS SOLUTION DOES NOT DO LETTER COUNTS. COULD MISTAKE ANAGRAMS LIKE BBAL AND BALL. Hashmap instead to count letter uses?
//        HashSet<Character> hashSetS = new HashSet<>();
//            for (int i = 0; i < s.length(); i++) {
//                hashSetS.add(s.charAt(i));
//            }
//            for (int i = 0; i < t.length(); i++) {
//                if (!hashSetS.contains(t.charAt(i))) {
//                    return false;
//                }
//            }
//        return true;
//    }
}
