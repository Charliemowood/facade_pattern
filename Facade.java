public class Facade {
  Holodeck holodeck;

  public Facade() {
    holodeck = new Holodeck();
  }

  public void useHolodeck() {
    System.out.println(holodeck.bootUp());
    System.out.println(holodeck.makeHolodeckySounds());
  }

}
