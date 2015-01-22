package com.percyvega.design_patterns._03_behavioral._08_state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class GaseousWaterState implements WaterState {

    private final static Logger logger = LoggerFactory.getLogger(GaseousWaterState.class);

    @Override
    public String toString() {
        return "GASEOUS";
    }

    @Override
    public void applyTemperature(WaterContext waterContext, WaterContext.Temperature temperature) {
        switch (temperature) {
            case COLD:
                waterContext.setWaterState(new LiquidWaterState());
                logger.debug("Applied " + temperature + ". Going from " + this + " to " + waterContext.getWaterState() + ".");
                break;
            case EXTREME_COLD:
                waterContext.setWaterState(new SolidWaterState());
                logger.debug("Applied " + temperature + ". Going from " + this + " to " + waterContext.getWaterState() + ".");
                break;
            default:
                logger.debug("Applied " + temperature + ". Water staying in " + this + " state.");
        }
    }
}
