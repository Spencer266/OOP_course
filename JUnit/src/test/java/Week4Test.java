import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week4Test {

    @Test
    public void testMax2Int1() { assertEquals(2, Week4.max2Int(1, 2)); }

    @Test
    public void testMax2Int2() { assertEquals(12378734, Week4.max2Int(12378734, 912312)); }

    @Test
    public void testMax2Int3() { assertEquals(0, Week4.max2Int(0, 0)); }

    @Test
    public void testMax2Int4() { assertEquals(-26, Week4.max2Int(-109, -26)); }

    @Test
    public void testMax2Int5() { assertEquals(56, Week4.max2Int(56, -248)); }

    @Test
    public void testMinArray1() { assertEquals(0, Week4.minArray(new int[] {2, 1, 5, 0, 11, 8})); }

    @Test
    public void testMinArray2() {
        assertEquals(182, Week4.minArray(new int[] {182, 12367, 8127, 888, 1234}));
    }

    @Test
    public void testMinArray3() {
        assertEquals(-2000, Week4.minArray(new int[] {-1777, 0, 722, 12, -2000, 64, 69}));
    }

    @Test
    public void testMinArray4() { assertEquals(1, Week4.minArray(new int[] {1, 1, 1, 1})); }

    @Test
    public void testMinArray5() { assertEquals(999, Week4.minArray(new int[] {999})); }

    @Test
    public void testCalculateBMI1() { assertEquals("Thiếu cân", Week4.calculateBMI(52, 1.68f)); }

    @Test
    public void testCalculateBMI2() { assertEquals("Bình thường", Week4.calculateBMI(60, 1.72f)); }

    @Test
    public void testCalculateBMI3() { assertEquals("Thừa cân", Week4.calculateBMI(70, 1.7f)); }

    @Test
    public void testCalculateBMI4() { assertEquals("Béo phì", Week4.calculateBMI(80, 1.68f)); }

    @Test
    public void testCalculateBMI5() { assertEquals("Bình thường", Week4.calculateBMI(80, 2f)); }

}
