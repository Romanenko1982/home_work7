package arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListClass {

  List<String> list = new ArrayList<>();

  public void task(int n) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        list.add(0, (reader.readLine()));
      } else {
        list.add(reader.readLine());
      }
    }

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        System.out.println(list.remove(list.size() - 1));
      } else {
        System.out.println(list.remove(0));
      }
    }
  }

  public void createList(int n) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < n; i++) {
      try {
        list.add(reader.readLine());
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public void foo() {

    int random = (int) (Math.random() * (list.size() - 2)) + 1;
    list.add(list.remove(random));
  }

  @Override
  public String toString() {
    return list.toString();
  }

  public void clear() {
    list.clear();
  }
}


