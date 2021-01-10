package nl.brianvermeer.kata.solutions.reverseint;

import static org.junit.Assert.assertEquals;

public class InitialSolution {

    public int reverse(int x) {
        boolean isNegative = x < 0;
        if(isNegative){
            isNegative = true;
            x *= -1;
        }
        char[] chars = Integer.toString(x).toCharArray();
        int left = 0, right = chars.length - 1;
        while(left<right){
            char tempLeft = chars[left];
            chars[left] = chars[right];
            chars[right] = tempLeft;
            left ++;
            right--;
        }
        int res = 0;
        try {
            res = Integer.parseInt(new String(chars));
        }catch (NumberFormatException e){
            return 0;
        }
        if(isNegative) return res * -1;
        return res;
    }

    public static void main(String[] args) {
        InitialSolution reverseInt = new InitialSolution();
        assertEquals(-321, reverseInt.reverse(-123));
    }

}
