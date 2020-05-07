package set;

public class MainSetClass {

  public static void main(String[] args) throws Exception {

    Card card1 = new Card();
    card1.setSurname("Петров");
    SetClass setClass = new SetClass();
    Card card = new Card();
    card.setSurname("Петров");
    setClass.addCard(card);
    setClass.addCard(card1);
    System.out.println(card.getNumberOfCard());
    System.out.println(card1.getNumberOfCard());
    System.out.println(setClass.sizeSet());

    Cargo cargo1 = new Cargo("Зерно", 100);
    Cargo cargo2 = new Cargo("Щебень", 500);
    Cargo cargo3 = new Cargo("Рыба", 400);
    Cargo cargo4 = new Cargo("Песок", 200);
    Cargo cargo5 = new Cargo("Цемент", 320);

    SetCargoBarge setCargoBarge = new SetCargoBarge();
    setCargoBarge.addSetCargo(cargo1);
    setCargoBarge.addSetCargo(cargo2);
    setCargoBarge.addSetCargo(cargo3);
    setCargoBarge.addSetCargo(cargo4);
    setCargoBarge.addSetCargo(cargo5);

    System.out.println("В баржу загружено " + setCargoBarge.size() + " видов грузов");
    setCargoBarge.fillTheBarge();
    System.out.println("В барже осталось " + setCargoBarge.size() + " видов грузов");
  }
}
