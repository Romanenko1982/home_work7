package map;

import java.util.HashMap;

public class MainMap {

  public static void main(String[] args) {

    Network network = new Network();
    network.registration("Trus", "Vicin");
    network.registration("Tus", "Vicn");
    network.registration("Tru", "Vcin");

    System.out.println(network.toString());
    System.out.println(network.getUsers());


  }

}
