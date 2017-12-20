/*
  Write a program that displays the result of
  1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
  output is: 1
3
6
10
15
21
28
36
45

*/


public class E1_06 {
  public static void main(String[] args){
    int r = 0;

    for (int n = 1; n <= 9; n++) {
      r += n;
      System.out.println(r);
    }
  }
}
