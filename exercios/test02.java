public class test02 {

  public static void main(String[] args) {
    int a = 1;
    while (a < 3) {
      System.out.println("a=" + a);
      if (a == 2) {
        break; //跳出循环
      } else {
        ++a;
      }
      continue; //结束本次循环，继续下一次循环
    }
  }
}
