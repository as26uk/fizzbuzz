public class fizzbuzz {
    public static void main(String[] args) {
       int n = 30;
       String a = " ";
       System.out.println(" ");

       for (int i = 1;  i < n+1; i++) {

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

