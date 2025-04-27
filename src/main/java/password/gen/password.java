package password.gen;

public class password {
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private static final String specialChars = "!@#$%^&*()_+[]{}|;:,.<>?";
    private static final String numbers = "0123456789";

    private int length;
    private boolean useUppercase;
    private boolean useLowercase;
    private boolean useNumbers;
    private boolean useSpecialChars;

    private StringBuilder passwordBuilder;
    private StringBuilder charSet;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isUseUppercase() {
        return useUppercase;
    }

    public void setUseUppercase(boolean useUppercase) {
        this.useUppercase = useUppercase;
    }

    public boolean isUseLowercase() {
        return useLowercase;
    }

    public void setUseLowercase(boolean useLowercase) {
        this.useLowercase = useLowercase;
    }

    public boolean isUseNumbers() {
        return useNumbers;
    }

    public void setUseNumbers(boolean useNumbers) {
        this.useNumbers = useNumbers;
    }

    public boolean isUseSpecialChars() {
        return useSpecialChars;
    }

    public void setUseSpecialChars(boolean useSpecialChars) {
        this.useSpecialChars = useSpecialChars;
    }

    public static String generate(int length, boolean useUppercase, boolean useLowercase, boolean useNumbers, boolean useSpecialChars) {
        password password = new password();
        password.setLength(length);
        password.setUseUppercase(useUppercase);
        password.setUseLowercase(useLowercase);
        password.setUseNumbers(useNumbers);
        password.setUseSpecialChars(useSpecialChars);
        return password.generatePassword();
    }

    private String generatePassword() {
        passwordBuilder = new StringBuilder();
        charSet = new StringBuilder();
        if (useUppercase) charSet.append(alphabet.toUpperCase());
        if (useLowercase) charSet.append(alphabet);
        if (useNumbers) charSet.append(numbers);
        if (useSpecialChars) charSet.append(specialChars);

        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * charSet.length());
            passwordBuilder.append(charSet.charAt(randomIndex));    
        }
        return passwordBuilder.toString();
    }
}
