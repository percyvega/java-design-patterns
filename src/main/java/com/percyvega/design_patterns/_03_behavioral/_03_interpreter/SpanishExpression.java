package com.percyvega.design_patterns._03_behavioral._03_interpreter;

/**
 * Created by Percy on 1/4/2015.
 */
public class SpanishExpression extends Expression {

    @Override
    public void interpret(Context context) {
        String[] digits = context.getInput().split(" ");

        StringBuilder interpretation = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            switch (digits[i]) {
                case "0":
                    interpretation.append("cero ");
                    break;
                case "1":
                    interpretation.append("uno ");
                    break;
                case "2":
                    interpretation.append("dos ");
                    break;
                case "3":
                    interpretation.append("tres ");
                    break;
                case "4":
                    interpretation.append("cuatro ");
                    break;
                case "5":
                    interpretation.append("cinco ");
                    break;
                case "6":
                    interpretation.append("seis ");
                    break;
                case "7":
                    interpretation.append("siete ");
                    break;
                case "8":
                    interpretation.append("ocho ");
                    break;
                case "9":
                    interpretation.append("nueve ");
                    break;
                default:
                    break;
            }
        }

        context.setOutput(interpretation.toString().trim());
    }

}
