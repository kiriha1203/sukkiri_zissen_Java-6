import java.util.function.*;

public class Ex3 {
  public static void main(String[] args) {
    IntBinaryOperator func = (int a, int b) -> { return a - b; };
    int a = func.applyAsInt(5, 3);
    System.out.println("5-3は" + a);
  }
}