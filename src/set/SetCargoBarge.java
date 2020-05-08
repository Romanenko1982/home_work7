package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCargoBarge {

  final double BARGE_CAPACITY;
  Set<Cargo> barge;
  private double sum;

  {
    BARGE_CAPACITY = 1500;
    barge = new HashSet<>();
    sum = 0;
  }

  public void addSetCargo(Cargo element) {
    barge.add(element);
  }

  public int size() {
    return barge.size();
  }

  public void fillTheBarge() {
    Iterator<Cargo> iterator = barge.iterator();
    while (iterator.hasNext()) {
      sum += iterator.next().getWeight();
    }
    System.out.println("Сумма грузов равна " + " " + sum + " тонн");
    if (sum > BARGE_CAPACITY) {
      double overweight = sum - BARGE_CAPACITY;
      System.out.println("Перегруз составляет " + overweight + " тонн");
      higher(overweight);
    } else {
      System.out.println("Баржа загружена и готова к отправке, общий вес груза составляет " + sum);
    }
    ceiling();
  }

  private void higher(double overweight) {
    double minOverweight = Double.MAX_VALUE;
    Cargo remove = null;
    Iterator<Cargo> iterator = barge.iterator();
    while (iterator.hasNext()) {
      Cargo weight = iterator.next();
      if (weight.getWeight() > overweight) {
        if (weight.getWeight() < minOverweight) {
          minOverweight = weight.getWeight();
          remove = weight;
        }
      }
    }
    System.out
        .println("Необходимо убрать груз " + remove.getName() + " весом " + remove.getWeight());
    barge.remove(remove);
  }

  private void ceiling() {
    double weight = 0;
    Iterator<Cargo> iterator = barge.iterator();
    while (iterator.hasNext()) {
      Cargo cargo = iterator.next();
      System.out.println("Груз " + cargo.getName() + " выгружен массой " + cargo.getWeight());
      weight += cargo.getWeight();
    }
    barge.clear();
    System.out.println("Баржа расгружена, общий вес перевезенного груза равен " + weight);
  }
}
