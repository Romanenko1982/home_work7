package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingClassUpName {

  private ArrayList<Pupil> listPupils = new ArrayList<>();


  private void sor() {
    Collections.sort(listPupils);
  }

  public void addList(Pupil pupil) {
    listPupils.add(pupil);
    sor();
  }

  public ArrayList<Pupil> getListPupils() {
    return listPupils;
  }

  public ArrayList<Pupil> sortByNumberOfClass() {
    Collections.sort(listPupils, new NumberOfClassComparator());
    return listPupils;
  }

  public ArrayList<Pupil> sortByMark() {
    Collections.sort(listPupils, new MarkComparator());
    return listPupils;
  }

  public ArrayList<Pupil> sortByAge() {
    Collections.sort(listPupils, new AgeComparator());
    return listPupils;
  }
}
