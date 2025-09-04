package org.acme.functions;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.Map;
import java.util.HashMap;

@ApplicationScoped
public class ExternalCIPValidation {
    public Map<String, Object> externalCipValidation(Map<String, Object> input) {
        Map<String, Object> result = new HashMap<>(input);
        result.put("cipStatus", "CIP Validated");
        System.out.println(">>> External CIP Validation executed");
        return result;
    }
}
