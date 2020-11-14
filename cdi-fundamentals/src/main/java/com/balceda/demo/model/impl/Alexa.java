package com.balceda.demo.model.impl;

import com.balceda.demo.model.VoiceAssistant;
import com.balceda.demo.qualifier.AlexaAssistant;

@AlexaAssistant
// @VoiceAssistantProvider(ALEXA)
public class Alexa implements VoiceAssistant {

    @Override
    public String greet() {
        return "Hello, I'm Alexa, you're voice assistant";
    }
}
