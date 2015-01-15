package com.percyvega.design_patterns._03_behavioral._03_interpreter;

import java.util.HashMap;

/**
 * Created by Percy on 1/4/2015.
 */
public class EnglishExpression extends Expression {

    private HashMap map = new HashMap<String, String>();

    public EnglishExpression() {
        map.put("0", "zero");
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        map.put("6", "six");
        map.put("7", "seven");
        map.put("8", "eight");
        map.put("9", "nine");
    }

    @Override
    public void interpret(Context context) {
        String[] digits = context.getInput().split(" ");

        StringBuilder interpretation = new StringBuilder();
        for (int i = 0; i < digits.length; i++)
            interpretation.append(map.get(digits[i]) + " ");

        context.setOutput(interpretation.toString().trim());
    }

}
