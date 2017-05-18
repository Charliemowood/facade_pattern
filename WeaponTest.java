import static org.junit.Assert.assertEquals;
import org.junit.*;

public class WeaponTest {
  Weapon weapon;

  @Before
  public void before() {
    weapon = new Weapon("Laser Uzi");
  }

  @Test
  public void hasName() {
    assertEquals("Laser Uzi", weapon.getName());
  }

  @Test
  public void canFire() {
    assertEquals("Firing weapon. POWZAPP!", weapon.fire());
  }
}
