package tech.makers.twitter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TweetFormTest {

    private TweetForm subject;

    @BeforeEach
    void beforeEach() {
        subject = new TweetForm("Hello, World!");
    }

    @Test
    void getBody() {
        assertEquals("Hello, World!", subject.getBody());
    }
}