package com.balceda.demo.web;


import com.balceda.demo.model.VoiceAssistant;
import com.balceda.demo.qualifier.VoiceAssistantProvider;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import static com.balceda.demo.qualifier.VoiceAssistantProvider.Provider.*;

@Named
@RequestScoped
public class RequestScopeBean {

    @Inject
    // @Alexa
    @VoiceAssistantProvider(ALEXA)
    private VoiceAssistant alexa;

    @Inject
    //@Siri
    @VoiceAssistantProvider(SIRI)
    private VoiceAssistant siri;

    public String greeting() {
        return "Alexa says: " + alexa.greet() + ", Siri says: " + siri.greet();
    }

}
