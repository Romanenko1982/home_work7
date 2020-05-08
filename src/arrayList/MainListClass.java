package arrayList;

import java.io.IOException;

public class MainListClass {

  public static void main(String[] args) throws IOException {
    ListClass list = new ListClass();
//    list.createList(5);
    list.task(5);
    list.foo();
    System.out.println(list.toString());
  }
}
