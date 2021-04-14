import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void getmKey_getsKey_2() {
        Cipher cipher = new Cipher(2,"Hello");
        int key = cipher.getmKey();
        assertEquals(2,key);
    }

    @Test
    public void getInput_getsInput_Hello() {
        Cipher cipher = new Cipher(2, "Hello");
        String input = cipher.getmInput();
        assertEquals("Hello", input);
    }

    @Test
    public void isInputValid_validInput_true() {
        Cipher cipher = new Cipher();
        boolean valid = cipher.isInputValid("Hello");
        assertTrue(valid);
    }

    @Test
    public void isInputValid_allowsWhitespace_true(){
        Cipher cipher = new Cipher();
        boolean valid = cipher.isInputValid("Hello hi");
        assertTrue(valid);
    }

    @Test
    public void isKeyValid_validKey_true() {
        Cipher cipher = new Cipher();
        boolean valid = cipher.isKeyValid(5);
        assertTrue(valid);
    }

    @Test
    public void cipher_canEncode_bcd() {
        Cipher cipher = new Cipher(27, "abc a");
        String encoded = cipher.encode();
        assertEquals("bcd b", encoded);
    }

    @Test public void cipher_canDecode_abc(){
        Cipher cipher = new Cipher(27, "bcd b");
        String decoded = cipher.decode();
        assertEquals("abc a", decoded);
    }
}