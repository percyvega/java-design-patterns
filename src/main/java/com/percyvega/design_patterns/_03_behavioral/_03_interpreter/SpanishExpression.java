package com.percyvega.design_patterns._03_behavioral._03_interpreter;

/**
 * Copyright 2015 Percy Vega
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
