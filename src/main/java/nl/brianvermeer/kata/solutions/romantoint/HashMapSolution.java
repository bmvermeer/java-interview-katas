package nl.brianvermeer.kata.solutions.romantoint;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class HashMapSolution {

    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if(i + 1 < s.length()) {
                if (((s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') && s.charAt(i) == 'I')
                        || ((s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') && s.charAt(i) == 'X')
                        || ((s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') && s.charAt(i) == 'C')) {
                    result -= map.get(s.charAt(i));
                    continue;
                }
            }
            result += map.get(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        HashMapSolution romanToInteger = new HashMapSolution();
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}
