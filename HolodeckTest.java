import static org.junit.Assert.assertEquals;
import org.junit.*;

public class HolodeckTest {
  Holodeck holodeck;

  @Before
  public void before() {
    holodeck = new Holodeck();
  }

  @Test
  public void canBootUp() {
    assertEquals("Starting up...", holodeck.bootUp());
  }

  @Test
  public void canMakeHolodeckySounds() {
    assertEquals("Shhhbzzzaadky", holodeck.makeHolodeckySounds());
  }
}
