package ua.lviv.iot.regex.text.filter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String userInput = StringProcessor.readInputText();
        StringProcessor stringProcessor = new StringProcessor(userInput);
        stringProcessor.findAndReverseMiddleWordsInQuestionSentences();
        stringProcessor.showResults();
    }

}
