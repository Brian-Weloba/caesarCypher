import org.junit.Test;

import static org.junit.Assert.*;

public class CypherTest {
    @Test
    public void getmKey_getsKey_2() {
        Cypher cypher = new Cypher(2,"Hello");
        int key = cypher.getmKey();
        assertEquals(2,key);
    }

    @Test
    public void getInput_getsInput_Hello() {
        Cypher cypher = new Cypher(2, "Hello");
        String input = cypher.getmInput();
        assertEquals("Hello", input);
    }

    @Test
    public void isInputValid_validInput_true() {
        Cypher cypher = new Cypher();
        boolean valid = cypher.isInputValid("Hello");
        assertTrue(valid);
    }

    @Test
    public void isKeyValid_validKey_true() {
        Cypher cypher = new Cypher();
        boolean valid = cypher.isKeyValid(5);
        assertTrue(valid);
    }

    @Test
    public void cypher_canEncode_bcd() {
        Cypher cypher = new Cypher(27, "abc a");
        String encoded = cypher.encode();
        assertEquals("bcd b", encoded);
    }

    @Test public void cypher_canDecode_abc(){
        Cypher cypher = new Cypher(27, "bcd b");
        String decoded = cypher.decode();
        assertEquals("abc a", decoded);
    }
}