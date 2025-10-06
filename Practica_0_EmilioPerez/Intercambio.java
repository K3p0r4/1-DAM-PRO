import java.util.*;

public class Main {
    public static void main(String[] args) {
      int x = 1;
      int y = 2;
      int intercambio = 0;
      
      intercambio = x;
      x = y;
      y= intercambio;
      
      System.out.println(" Los valores son: " + x + " " + y +" " + intercambio);
  }
}