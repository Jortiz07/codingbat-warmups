package com.josegortiz;

public class Coding {

  public static boolean makes10(int a, int b) {
    // if (a == 10 || b == 10) {
    //   return true;
    // } else if (a + b == 10) {
    //   return true;
    // } else {
    //   return false;
    // }
    return (a == 10 || b == 10 || a + b == 10);
  }

  public static boolean posNeg(int a, int b, boolean negative) {
    if (negative && a+b < Math.abs(a+b)) {
      return true;
    } else if (a < 0 && b < 0) {
      return false;
    } else return !negative && a+b < Math.abs(a) + Math.abs(b);
  }

}
