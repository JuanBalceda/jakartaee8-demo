package com.balceda.demo.model.impl;

import com.balceda.demo.model.VoiceAssistant;
import com.balceda.demo.qualifier.VoiceAssistantProvider;

import static com.balceda.demo.qualifier.VoiceAssistantProvider.Provider.ALEXA;

// @com.balceda.demo.qualifiers.Alexa
@VoiceAssistantProvider(ALEXA)
public class Alexa implements VoiceAssistant {

    @Override
    public String greet() {
        return "Hello, I'm Alexa, you're voice assistant";
    }
}
