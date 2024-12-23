package com.aptner.point.designpatternexample.example2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class LowerFilterStreamTest {

    @DisplayName("소문자 스트림 적용")
    @Test
    void lowerFilterStream() {
        int c;
        String result = "";
        try {
            String testWorld = "HELLO WORLD";
            byte[] bytes = testWorld.getBytes();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            InputStream inputStream = new LowerFilterStream(byteArrayInputStream);
            result = new String(inputStream.readAllBytes());

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assertions.assertThat(result).isEqualTo("hello world");
    }

}