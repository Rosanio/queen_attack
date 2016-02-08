import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class AppTest {
  @Test
  public void queenCanAttack_isFalseIftheQueenCannotAttack_false() {
    App queenAttack = new App();
    ArrayList<Object> queenLocation = new ArrayList<Object>();
    queenLocation.add(1);
    queenLocation.add(1);
    ArrayList<Object> targetLocation = new ArrayList<Object>();
    targetLocation.add(2);
    targetLocation.add(3);
    assertEquals(false, queenAttack.queenCanAttack(queenLocation, targetLocation));
  }

  @Test
  public void queenCanAttack_isTrueIftheQueenCanAttackVertically_true() {
    App queenAttack = new App();
    ArrayList<Object> queenLocation = new ArrayList<Object>();
    queenLocation.add(1);
    queenLocation.add(1);
    ArrayList<Object> targetLocation = new ArrayList<Object>();
    targetLocation.add(1);
    targetLocation.add(3);
    assertEquals(true, queenAttack.queenCanAttack(queenLocation, targetLocation));
  }

  @Test
  public void queenCanAttack_isTrueIftheQueenCanAttackHorizontally_true() {
    App queenAttack = new App();
    ArrayList<Object> queenLocation = new ArrayList<Object>();
    queenLocation.add(1);
    queenLocation.add(1);
    ArrayList<Object> targetLocation = new ArrayList<Object>();
    targetLocation.add(4);
    targetLocation.add(1);
    assertEquals(true, queenAttack.queenCanAttack(queenLocation, targetLocation));
  }
}
