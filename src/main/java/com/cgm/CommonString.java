package com.cgm;

public class CommonString {

    private final static String NO_COMMON_STRING_MESSAGE = "brak";
    private final static int MINIMAL_COMMON_STRING = 3;
    private String shorterText;
    private String longerText;
    private int commonStringLength;

    public String getCommonStringLength(String text1, String text2) {

        if (text1 == null || text2 == null) {
            commonStringLength = 0;
        } else {
            checkLengthOfStrings(text1, text2);
            commonStringLength = getCommonStringLength();
        }

        return getReturnMessage();
    }

    private String getReturnMessage() {
        if (commonStringLength < MINIMAL_COMMON_STRING) {
            return NO_COMMON_STRING_MESSAGE;
        } else {
            return String.valueOf(commonStringLength);
        }
    }

    private void checkLengthOfStrings(String text1, String text2) {
        if (text1.length() > text2.length()) {
            shorterText = text2;
            longerText = text1;
        } else {
            shorterText = text1;
            longerText = text2;
        }
    }

    private int getCommonStringLength() {
        int checkedLength = shorterText.length();

        while (checkedLength >= MINIMAL_COMMON_STRING) {

            int beginOfTextToCheck = 0;
            int endOfTextToCheck = checkedLength;

            while (endOfTextToCheck <= shorterText.length()) {
                String textToCheck = shorterText.substring(beginOfTextToCheck, endOfTextToCheck);

                if (longerText.contains(textToCheck)) {
                    return checkedLength;
                } else {
                    beginOfTextToCheck++;
                    endOfTextToCheck++;
                }
            }
            checkedLength--;
        }
        return 0;
    }
}
