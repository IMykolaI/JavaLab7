package main.java.ua.lviv.iot.regex.text.filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringProcessor {

    public static void main(String[] args) throws IOException {

        String textString = readInputText();
        System.out.println(textString);
    }

    public static String readInputText() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the text you want to filter : ");
        String text = br.readLine();
        br.close();
        return text;

    }

}
