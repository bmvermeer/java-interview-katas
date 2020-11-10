package nl.brianvermeer.kata.sollutions.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution2 {

    //take a list for 0 to 50
    //output the number a String unless:
    //if a number can be devided by 3 output "Fizz"
    //if a number can be devided by 5 output "Buzz"
    //if a number can be devided by 3 and 5 output "FizzBuzz"

    public List<String> fizzBuzz() {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution2 fizzBuzz = new Solution2();
        System.out.println(fizzBuzz.fizzBuzz());
    }

}


