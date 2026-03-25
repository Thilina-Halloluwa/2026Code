package Week05.Coverage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoverageTest {
    @Test
    public void testPathCoverage() {
        // Path 1: x > 0 && x % 2 == 0  (2)
        Coverage obj1 = new Coverage();
        obj1.register(2);
        assertEquals(1, obj1.positives);
        assertEquals(1, obj1.evens);
    }

    @Test
    public void testBranchCoverage_minimal() {
        // Case 1: both conditions true
        Coverage obj1 = new Coverage();
        obj1.register(2);
        assertEquals(1, obj1.positives);
        assertEquals(1, obj1.evens);

        // Case 2: both conditions false
        Coverage obj2 = new Coverage();
        obj2.register(-1);
        assertEquals(0, obj2.positives);
        assertEquals(0, obj2.evens);
    }



}