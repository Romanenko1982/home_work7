package set;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

  Set<Card> creditCardsOfBank = new HashSet<>();

  public void addCard(Card element) {
    creditCardsOfBank.add(element);
  }

  public int sizeSet() {
    return creditCardsOfBank.size();
  }
}
