/**
 * @version date (CS_251_004, 2019-01-26)
 * @author Lasair Servilla
 */

/**
 * Class FizzBuzz takes three arguments and from there prints out numbers from 1 to the limit (the third argument)
 * replacing values that are multiples of the first argument with Fizz, and multiples of the second argument
 * with Buzz. If the value is a multiple of both it will print out FizzBuzz.
 */

public class FizzBuzz {

public static void main(String[] args){

    /**
     * checking for number of arguments, if not three gives error,
     * then assigning arguments to what they represent
     */

    if(args.length != 3){
        System.out.println("You do not have the correct number of arguments.");
    } else {
        int fizz = Integer.parseInt(args[0]);
        int buzz = Integer.parseInt(args[1]);
        int limit = Integer.parseInt(args[2]);

        /**
         * Finding whether a number is a multiple of either the first or second argument, and printing out the
         * appropriate thing. If the number is a multiple either Fizz, Buzz, or FizzBuzz,
         * otherwise it prints the number.
         */

        for (int i = 1; i <= limit; i++) {

            if(i % fizz == 0 && i % buzz == 0){

                System.out.println("FizzBuzz");

            } else if(i % fizz == 0) {

                System.out.println("Fizz");

            } else if(i % buzz == 0){

                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }

        }
    }
}

}
