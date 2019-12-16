package princeton.algorithms1.unionfind;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickFindTest {

    public static final ImmutableList<int[]> UNIONS = ImmutableList.of(
            new int[]{4, 3},
            new int[]{3, 8},
            new int[]{6, 5},
            new int[]{9, 4},
            new int[]{2, 1},
            new int[]{8, 9},
            new int[]{5, 0},
            new int[]{7, 2},
            new int[]{6, 1},
            new int[]{1, 0},
            new int[]{6, 7}
    );

    @Test
    public void basicTest() {
        QuickFind uf = new QuickFind(10);
        UNIONS.forEach(ints -> uf.union(ints[0], ints[1]));

        assertTrue(uf.connected(4, 3));
        assertTrue(uf.connected(3, 9));
        assertFalse(uf.connected(1, 9));
    }
}