package map;

import java.util.HashMap;

public class Network {

  HashMap<String, String> mapNetwork;

  {
    mapNetwork = new HashMap<String, String>();
  }

  public void registration(String nik, String name) {
    if (!mapNetwork.containsKey(nik)) {
      create(nik, name);
      System.out.println("Создан пользователь с ником " + nik);
    } else {
      System.out.println("Пользователь с таким nic есть, необходимо выбрать новый ");
    }
  }

  public void unregistration(String nik) {
    if (mapNetwork.containsKey(nik)) {
      remove(nik);
      System.out.println("Удален пользователь с ником " + nik);
    }
  }

  public void create(String nik, String name) {
    mapNetwork.put(nik, name);
  }

  public void remove(String nik) {
    mapNetwork.remove(nik);
  }

  public HashMap<String, String> getUsers() {
    return mapNetwork;
  }

  @Override
  public String toString() {
    return "Соцсеть " +
        "mapNetwork\n";
  }
}


