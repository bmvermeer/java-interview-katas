package nl.brianvermeer.kata.solutions.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution1 {

    //take a list for 0 to 50
    //output the number a String unless:
    //if a number can be divided by 3 output "Fizz"
    //if a number can be divided by 5 output "Buzz"
    //if a number can be divided by 3 and 5 output "FizzBuzz"

    public List<String> fizzBuzz() {
        return IntStream.rangeClosed(1,50)
                .mapToObj(this::fizzBuzzer)
                .collect(Collectors.toList());
    }

    private String fizzBuzzer(int i){
        if (i % 15 == 0) return "FizzBuzz";
        if (i % 3 == 0) return "Fizz";
        if (i % 5 == 0) return "Buzz";
        return String.valueOf(i);
    }

    public static void main(String[] args) {
        Solution1 fizzBuzz = new Solution1();
        System.out.println(fizzBuzz.fizzBuzz());
    }

}


