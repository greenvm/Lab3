import java.util.Scanner;


class Main {
  public static void main(String[] args) {
  Scanner s  = new Scanner(System.in);
  
  System.out.println("Enter a number to count down or up from:");
  
  int num = s.nextInt();
  while (num >0){
    num--;
    System.out.println(num);
  }

  while (num <0){
    num++;
    System.out.println(num);
  }
  System.out.println("Blast Off!");
  }
  
  }