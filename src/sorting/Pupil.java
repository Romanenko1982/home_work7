package sorting;

public class Pupil implements Comparable<Pupil> {

  private String surname;
  private String name;
  private int age;
  private int mark;
  private int numberOfClass;

  public Pupil(String surname, String name, int age, int mark, int numberOfClass) {
    this.surname = surname;
    this.name = name;
    this.age = age;
    this.mark = mark;
    this.numberOfClass = numberOfClass;
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Имя ").append(name)
        .append(", Фамилия ").append(surname)
        .append(", Возраст ").append(age)
        .append(", Оценка ").append(mark)
        .append(", Класс ").append(numberOfClass);
    return stringBuilder.toString();
  }

  @Override
  public int compareTo(Pupil anotherPupil) {
    return this.name.compareTo(anotherPupil.name);
  }

  public String getSurname() {
    return surname;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getMark() {
    return mark;
  }

  public int getNumberOfClass() {
    return numberOfClass;
  }
}
