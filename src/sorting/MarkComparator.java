package sorting;

import java.util.Comparator;

public class MarkComparator implements Comparator<Pupil> {

  @Override
  public int compare(Pupil o1, Pupil o2) {
    return Integer.compare(o1.getMark(), o2.getMark());
  }
}
