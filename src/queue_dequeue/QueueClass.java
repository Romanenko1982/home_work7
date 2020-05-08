package queue_dequeue;

import java.util.Collections;
import java.util.LinkedList;

public class QueueClass {

  private LinkedList<String> myQueue = new LinkedList<>();

  public void hospitalQueue() {
    int count = 1;
    System.out.println("В очереди находиться " + myQueue.size());
    System.out.println("Врач начал прием и очередь ожевилась");
    System.out.println();
    while (!myQueue.isEmpty()) {

      if (count % 3 == 0) {
        System.out.printf("входит %s без очереди\n%s вышел от врача\n", myQueue.peekLast(),
            myQueue.removeLast());
      } else {
        System.out.printf("%s зашел в кабинет\n%s вышел от врача\n", myQueue.peekFirst(),
            myQueue.removeFirst());
      }
      if (count % 2 == 0) {
        myQueue.addLast(Integer.toString(count));
        System.out.printf("приходит новый %s в очередь\n", myQueue.peekLast());
      }
      count++;
    }
  }

  public void addQueue(int n) {
    for (int i = 1; i <= n; i++) {
      myQueue.add(Integer.toString(i));
    }
  }

  public void clearQueue() {
    myQueue.clear();
  }

  public void mix() {
    while (!(myQueue.size() == 1)) {
      Collections.shuffle(myQueue);
      System.out.println(myQueue.removeLast());
    }
  }
}

