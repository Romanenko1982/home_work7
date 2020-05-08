package sorting;

import java.util.Comparator;

public class AgeComparator implements Comparator<Pupil> {

  @Override
  public int compare(Pupil o1, Pupil o2) {
    return Integer.compare(o1.getAge(), o2.getAge());
  }
}
