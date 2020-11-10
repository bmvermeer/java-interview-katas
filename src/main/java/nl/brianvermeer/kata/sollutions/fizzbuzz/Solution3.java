package nl.brianvermeer.kata.sollutions.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution3 {

    //take a list for 0 to 50
    //output the number a String unless:
    //if a number can be divided by 3 output "Fizz"
    //if a number can be divided by 5 output "Buzz"
    //if a number can be divided by 3 and 5 output "FizzBuzz"

    public List<String> fizzBuzz() {
        return IntStream.rangeClosed(1,50)
                .boxed().map( n -> {
                    if(n % 3 == 0 && n % 5 == 0 ) return "FizzBuzz";
                    if(n % 3 == 0) return "Fizz";
                    if(n % 5 == 0) return "Buzz";
                    return n.toString();
                })
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Solution2 fizzBuzz = new Solution2();
        System.out.println(fizzBuzz.fizzBuzz());
    }

}
