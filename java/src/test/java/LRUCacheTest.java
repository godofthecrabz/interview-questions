import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LRUCacheTest {

    @Test
    @DisplayName("Initialization test successful")
    void initLRUCache() {
        LRUCache c = new LRUCache(5);

        assertEquals(c.csize, 5);
    }

    @Test
    @DisplayName("Test LRU last insert is head")
    void testLRULastInsertIsHead() {
        LRUCache c = new LRUCache(4);
        c.refer(4);
        c.refer(2);

        assertEquals(2, c.dq.peek());
    }

}
