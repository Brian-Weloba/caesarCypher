public class Cypher {
    private int mKey;
    private String mInput;

    public int getmKey() {
        return mKey;
    }

    public String getmInput() {
        return mInput;
    }

    public Cypher(int mKey, String mInput) {
        this.mKey = mKey;
        this.mInput = mInput;
    }

    public Cypher() {
    }

    public boolean isInputValid(String mInput) {

        if (mInput.isEmpty() || mInput.equals(" ")) {
            System.out.println("Input is not valid");
        }

        char[] inputArray = mInput.toCharArray();

        for (char c : inputArray) {
            if (!Character.isLetter(c) && c != ' ') {
                System.out.println("Input is not valid");
                return false;
            }
        }
        return true;
    }

    public boolean isKeyValid(int key) {

        return key >= 1 && key < 26;
    }

    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private char[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();

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
}
