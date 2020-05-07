package set;

import java.util.Objects;

public class Card {

  private static int id = 1;
  private String surname;
  private int numberOfCard;

  public Card() {
    numberOfCard = id;
    id++;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getNumberOfCard() {
    return numberOfCard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return numberOfCard == card.numberOfCard &&
        Objects.equals(surname, card.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surname, numberOfCard);
  }
}
