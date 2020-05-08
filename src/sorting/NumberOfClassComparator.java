package sorting;

import java.util.Comparator;

public class NumberOfClassComparator implements Comparator<Pupil> {

  @Override
  public int compare(Pupil o1, Pupil o2) {
    return Integer.compare(o1.getNumberOfClass(), o2.getNumberOfClass());
  }
}
