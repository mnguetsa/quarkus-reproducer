package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class DummyListener {

    @Incoming("queue")
    public void process(String message) {
        System.out.println("Received message: " + message);
    }
}
