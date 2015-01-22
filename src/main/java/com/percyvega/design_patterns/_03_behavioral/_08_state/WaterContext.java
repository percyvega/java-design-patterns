package com.percyvega.design_patterns._03_behavioral._08_state;

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
public class WaterContext {

    WaterState waterState;
    Temperature temperature;

    public WaterContext() {
        this.waterState = new LiquidWaterState();
        this.temperature = Temperature.COLD;
    }

    public enum Temperature {
        HEAT,
        EXTREME_HEAT,
        COLD,
        EXTREME_COLD
    }

    public WaterState getWaterState() {
        return waterState;
    }

    public void setWaterState(WaterState waterState) {
        this.waterState = waterState;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
        getWaterState().applyTemperature(this, temperature);
    }
}
