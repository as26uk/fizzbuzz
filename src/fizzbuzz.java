public class fizzbuzz {
    public static void main(String[] args) {
       int n = 30;
       String a = " ";
       System.out.println(a);

       for (int i = 1;  i < n+1; i++) {
           if (i % 15 == 0) a = "FIZZBUZZ";
           else if (i % 5 == 0) a = "Buzz";
           else if (i % 3 == 0) a = "Fizz";
           else a = " ";

           if (a.equals(" ")) System.out.println(i);
           else System.out.println(a);
           }
       }
    }


