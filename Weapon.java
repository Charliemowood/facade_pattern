public class Weapon {
  String name;

  public Weapon(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String fire(){
    return "Firing weapon. POWZAPP!";
  }
}
