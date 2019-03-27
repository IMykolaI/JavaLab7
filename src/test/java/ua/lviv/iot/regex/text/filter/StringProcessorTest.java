package ua.lviv.iot.regex.text.filter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringProcessorTest {

    StringProcessor testStringProcessor = new StringProcessor("Hello? How are you? Listen: do you like music? Or you like tennis?");
    
    @Test
    void testFindAndReverseMiddleWordsInQuestionSentences() {
        
        testStringProcessor.findAndReverseMiddleWordsInQuestionSentences();
        Assertions.assertEquals("olleH", testStringProcessor.getResultsList().get(0));
        Assertions.assertEquals("era", testStringProcessor.getResultsList().get(1));
        Assertions.assertEquals("uoy", testStringProcessor.getResultsList().get(2));
    }

}
