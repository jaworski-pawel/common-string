package com.cgm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommonStringTest {

    @Test
    public void shouldReturnMessageBrakBecauseTextsAreNulls() {
        //given
        CommonString commonString = new CommonString();
        String text1 = null;
        String text2 = null;

        //when
        String result = commonString.getCommonStringLength(text1, text2);

        //then
        assertEquals("brak", result);
    }

    @Test
    public void shouldReturnMessageBrakBecauseTextsAreEmpty() {
        //given
        CommonString commonString = new CommonString();
        String text1 = "";
        String text2 = "";

        //when
        String result = commonString.getCommonStringLength(text1, text2);

        //then
        assertEquals("brak", result);
    }

    @Test
    public void shouldReturnMessageBrakBecauseCommonStringIsShorterThan3() {
        //given
        CommonString commonString = new CommonString();
        String text1 = "janko";
        String text2 = "jajko";

        //when
        String result = commonString.getCommonStringLength(text1, text2);

        //then
        assertEquals("brak", result);
    }

    @Test
    public void shouldReturnMessageThreeBecauseCommonStringLengthIs3() {
        //given
        CommonString commonString = new CommonString();
        String text1 = "jan";
        String text2 = "janek";

        //when
        String result = commonString.getCommonStringLength(text1, text2);

        //then
        assertEquals("3", result);
    }

    @Test
    public void shouldReturnMessageFiveBecauseCommonStringLengthIs5() {
        //given
        CommonString commonString = new CommonString();
        String text1 = "krzysztofkowal";
        String text2 = "jankowalski";

        //when
        String result = commonString.getCommonStringLength(text1, text2);

        //then
        assertEquals("5", result);
    }


}