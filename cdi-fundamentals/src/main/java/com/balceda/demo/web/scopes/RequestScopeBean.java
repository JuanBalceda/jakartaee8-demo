package com.balceda.demo.web.scopes;

import com.balceda.demo.model.VoiceAssistant;
import com.balceda.demo.qualifier.AlexaAssistant;
import com.balceda.demo.qualifier.VoiceAssistantProvider;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import static com.balceda.demo.qualifier.VoiceAssistantProvider.Provider.SIRI;

@RequestScoped
public class RequestScopeBean {

    @Inject
    @AlexaAssistant
    // @VoiceAssistantProvider(ALEXA)
    private VoiceAssistant alexa;

    @Inject
    // @Siri
    @VoiceAssistantProvider(SIRI)
    private VoiceAssistant siri;

    // Lifecycle Callbacks
    @PostConstruct
    public void init() {
        System.out.println("RequestScopeBean::init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("RequestScopeBean::destroy");
    }

    public String greeting() {
        return "Alexa says: " + alexa.greet() +
                "\nSiri says: " + siri.greet();
    }

    public int getHashCode() {
        return this.hashCode();
    }
}
