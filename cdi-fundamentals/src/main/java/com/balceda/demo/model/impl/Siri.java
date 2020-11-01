package com.balceda.demo.model.impl;

import com.balceda.demo.model.VoiceAssistant;
import com.balceda.demo.qualifier.VoiceAssistantProvider;

import static com.balceda.demo.qualifier.VoiceAssistantProvider.Provider.SIRI;

// @com.balceda.demo.qualifiers.Siri
@VoiceAssistantProvider(SIRI)
public class Siri implements VoiceAssistant {

    @Override
    public String greet() {
        return "Hello, I'm Siri, you're voice assistant";
    }
}
