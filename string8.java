//How to print all permutation of a String? (solution)
//Write an efficient program to print all permutations of a given String in Java/C/Python or any programming language of your choice. For example, if given input is "123" then your program should print all 6 permutations e.g. "123", "132", "213", "231", "312" and "321".
public class StringPermutations {

    public static void main(String args[]) {
        permutation("123");
    }

  
   public static void permutation(String input){
          permutation("", input);
   }

   
   private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);

        } 
        else
         {
         for (int i = 0; i &lt; word.length(); i++) 
         {
                permutation(perm + word.charAt(i), word.substring(0, i) 
                                + word.substring(i + 1, word.length()));
            }
        }

    }
}
 