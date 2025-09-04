package org.acme.functions;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.Map;

@ApplicationScoped
public class FinalResponse {
    public Map<String, Object> finalResponse(Map<String, Object> input) {
        System.out.println(">>> Final Response: " + input);
        return input;
    }
}
