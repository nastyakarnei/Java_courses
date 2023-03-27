package eu.senla.task4;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    public static String getRandomString(int elementSize){
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        symbols += symbols.toLowerCase(Locale.ROOT);


        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < elementSize; i++ ) {
            stringBuffer.append(symbols.charAt(getRandomInt(0, symbols.length()-1)));
        }
        return stringBuffer.toString();
    }

    private static int getRandomInt(int from, int to){
        return (int)((Math.random() * (to - from)) + from);

    }

    public static boolean isNumber(String value){
        String regex = "[0-9]{1,4}[\\.][0-9]{1,4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        boolean matches = matcher.matches();
        return matches;
        }

    }


