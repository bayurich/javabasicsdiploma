package ru.netology.graphics.image;

import java.util.Arrays;

public class MyTextColorSchema implements TextColorSchema{

    private static final String CHAR_SET = "#$@%*+-'";
    private static final int MAX_VALUES = 256;

    char[] setChars = CHAR_SET.toCharArray();
    int countRanges = setChars.length;

    int countInRange = (int) Math.ceil((double) MAX_VALUES / countRanges);


    @Override
    public char convert(int color) {
        return setChars[color / countInRange];
    }
}
