package queue_dequeue;

public class MainQueueClass {

  public static void main(String[] args) {

    QueueClass queue = new QueueClass();
    queue.addQueue(5);
    queue.mix();
    queue.clearQueue();
    queue.addQueue(7);
    queue.hospitalQueue();

  }



}
