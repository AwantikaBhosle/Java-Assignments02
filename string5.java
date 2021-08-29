//How to check if two strings are rotations of each other? (solution)
//Write an efficient program to test if two given String is a rotation of each other or not, e.g. if the given String is "XYZ" and "ZXY" then your function should return true, but if the input is "XYZ" and "YXZ" then return false.

import java.util.Scanner;
public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scnr = new Scanner(System.in);
    System.out.println("Please enter original String");
    String input = scnr.nextLine();

    System.out.println("Please enter rotation of String");
    String rotation = scnr.nextLine();

    if (checkRotatation(input, rotation)) {
      System.out.println(input + " and " + rotation
          + " are rotation of each other");
    } else {
      System.out.println("Sorry, they are not rotation of another");
    }

    scnr.close();
  }
  public static boolean checkRotatation(String original, String rotation) {
    if (original.length() != rotation.length()) {
      return false;
    }

    String concatenated = original + original;

    if (concatenated.indexOf(rotation) != -1) {
      return true;
    }

    return false;
  }
}