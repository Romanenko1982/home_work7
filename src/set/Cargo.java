package set;

import java.util.Objects;

public class Cargo {

  private String name;
  private double weight;

  public Cargo(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cargo cargo = (Cargo) o;
    return Double.compare(cargo.weight, weight) == 0 &&
        Objects.equals(name, cargo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, weight);
  }

  @Override
  public String toString() {
    return "Cargo - " +
        "name='" + name + '\'' +
        ", weight=" + weight;
  }
}
