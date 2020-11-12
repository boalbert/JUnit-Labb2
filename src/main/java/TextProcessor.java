class TextProcessor {

    public static void main(String[] args) {

    }

    public String returnStringCapitalized(String string) {
        return string.toUpperCase();
    }

    public String returnStringLowercase(String string) {
        return string.toLowerCase();
    }

    public String returnStringReversed(String string) {
        StringBuilder sb = new StringBuilder(string);
        return String.valueOf(sb.reverse());
    }
}