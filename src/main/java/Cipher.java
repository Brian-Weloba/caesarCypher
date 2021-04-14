public class Cipher {
    private int mKey;
    private String mInput;

    public int getmKey() {
        return mKey;
    }

    public String getmInput() {
        return mInput;
    }

    public Cipher(int mKey, String mInput) {
        this.mKey = mKey;
        this.mInput = mInput;
    }

    public Cipher() {
    }

    public boolean isInputValid(String mInput) {
        if ((mInput != null) && (!mInput.equals("") && (mInput.matches("^[a-zA-Z ]*$")))) {
            return true;
        } else {
            System.out.println("Invalid Input. Your text appears to have non-alphabet characters!");
            return false;
        }
    }

    public boolean isKeyValid(int key) {
        if (key >= 1 && key < 100) {
            return true;
        } else {
            System.out.println("Invalid input. Key should be an integer value between 1 and 100");
            return false;
        }
    }

    final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    final char[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    String encode() {
        char[] inputArray = mInput.toCharArray();
        StringBuilder encoded = new StringBuilder();

        for (char c : inputArray) {
            if (c == ' ') {
                encoded.append(' ');
            }
            for (char letter : alphabetArray) {
                if (c == letter) {
                    encoded.append(alphabetArray[(alphabet.indexOf(c) + mKey) % 26]);
                }
            }
        }

        return encoded.toString();
    }

    String decode() {
        char[] inputArray = mInput.toCharArray();
        StringBuilder decoded = new StringBuilder();

        for (char c : inputArray) {
            if (c == ' ') {
                decoded.append(' ');
            }
            for (char letter : alphabetArray) {
                if (c == letter) {
                    try {
                        decoded.append(alphabetArray[alphabet.indexOf(c) - ((mKey) % 26)]);
                    } catch (Exception e) {
                        decoded.append(alphabetArray[alphabet.indexOf(c) - ((mKey) % 26) + 26]);
                    }
                }
            }
        }

        return decoded.toString();
    }
}
