import java.util.Scanner;

class BasicThree {
  public static void main(String[] args) {
    helloUser();
    palindromeChecker();
    perfectSquareChecker();
  }

  // first basic program: 
  public static void helloUser() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Who is it?");
    String name = sc.nextLine();
    System.out.println("Hello " + name);
  }

  // second String program
  public static void palindromeChecker() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word for the palindrome checker");
    String word = sc.nextLine();
    for (int i = 0 ; i < word.length()/2 ; i++) {
      if (word.charAt(i) != word.charAt(word.length()-1-i)) {
        System.out.println("Nope, sorry :'(");
        return ;
      }
    }
    System.out.println("Yes it is! :)");
  }

  // third mathematical program
  public static void perfectSquareChecker() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an Integer for the perfect square checker");
    Integer n = sc.nextInt();
    for (int i = 0 ; i <= n ; i++) {
      if (i*i == n) {
        System.out.println("Yes it is! :)");
        return ;
      }
    }
    System.out.println("Nope, sorry :'(");
  }
}