package sorting;

public class MainSort {

  public static void main(String[] args) {

    SortingClassUpName sortingClassUpName = new SortingClassUpName();

    Pupil pupil1 = new Pupil("Иванов", "Иван", 10, 8, 3);
    Pupil pupil2 = new Pupil("Петров", "Петя", 8, 7, 2);
    Pupil pupil3 = new Pupil("Сидоров", "Сергей", 9, 7, 2);
    Pupil pupil4 = new Pupil("Иванов", "Дима", 10, 4, 3);
    Pupil pupil5 = new Pupil("Захаренко", "Петя", 10, 5, 6);
    Pupil pupil6 = new Pupil("Романенко", "Иван", 8, 7, 2);
    Pupil pupil7 = new Pupil("Романекно", "Алексей", 10, 5, 5);
    Pupil pupil8 = new Pupil("Романов", "Александр", 10, 9, 3);
    Pupil pupil9 = new Pupil("Царевич", "Гвидон", 11, 5, 3);
    Pupil pupil10 = new Pupil("Иванов", "Иван", 11, 6, 4);

    sortingClassUpName.addList(pupil1);
    sortingClassUpName.addList(pupil2);
    sortingClassUpName.addList(pupil3);
    sortingClassUpName.addList(pupil4);
    sortingClassUpName.addList(pupil5);
    sortingClassUpName.addList(pupil6);
    sortingClassUpName.addList(pupil7);
    sortingClassUpName.addList(pupil8);
    sortingClassUpName.addList(pupil9);
    sortingClassUpName.addList(pupil10);

    System.out.println(sortingClassUpName.getListPupils());

    NumberOfClassComparator numberOfClassComparator = new NumberOfClassComparator();
    System.out.println(numberOfClassComparator.compare(pupil1, pupil3));

    System.out.println(sortingClassUpName.sortByAge());
    System.out.println(sortingClassUpName.sortByNumberOfClass());
    System.out.println(sortingClassUpName.sortByMark());

  }
}
