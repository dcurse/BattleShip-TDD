import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by dcurs_000 on 9/17/2016.
 */
public class CellTest {

    @Test
    public void IsHitTest(  ){
        Cell testCell;
        testCell = new Cell(1,2);
        assertTrue(testCell.hit(1,2));
    }
}
