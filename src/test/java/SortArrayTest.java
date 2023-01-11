import org.junit.Assert;
import org.junit.Test;
import org.resume.SortArray;

public class SortArrayTest {
    @Test
    public void testArraySorting() {
        int[] actualArray = {5, 2, 4, 6, 1, 3, 2, 6};
        int[] expectedArray = {1, 2, 2, 3, 4, 5, 6, 6};
        SortArray sortArray = new SortArray();
        int[] sortedArray = sortArray.sort(actualArray, 0, actualArray.length);
        Assert.assertArrayEquals(expectedArray, sortedArray);
    }
}
