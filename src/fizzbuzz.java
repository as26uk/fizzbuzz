public class fizzbuzz {
    public static void main(String[] args) {
       int n = 100;
       String a = " ";

       for (int i = 0;  i < n;) {
           i = i +1;

           if (i % 15 == 0) {
               a = "FizzBuzz";

           } else if (i % 5 == 0) {
               a = "Buzz";

           } else if (i % 3 == 0) {
               a = "Fizz";

           } else {
               a = " ";

           }if (a == " ") {
               System.out.println(i);

           } else {
               System.out.println(a);
           }
       }
    }
}

