public class Facade {
  Holodeck holodeck;
  Weapon weapon;

  public Facade() {
    holodeck = new Holodeck();
    weapon = new Weapon("Uber Uzi");
  }

  public void useHolodeck() {
    System.out.println(holodeck.bootUp());
    System.out.println(holodeck.makeHolodeckySounds());
  }

  public void grabWeaponAndFire() {
    System.out.println("You grab your " + weapon.getName());
    System.out.println(weapon.fire());
  }

}
