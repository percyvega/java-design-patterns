package com.percyvega.design_patterns._03_behavioral._03_interpreter;

import java.util.HashMap;

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
