package org.acme.functions;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.Map;
import java.util.HashMap;

@ApplicationScoped
public class EIAValidation {
    public Map<String, Object> eiaValidation(Map<String, Object> input) {
        boolean valid = input.containsKey("eia") && "OK".equals(input.get("eia"));
        Map<String, Object> result = new HashMap<>(input);
        result.put("eiaValid", valid);
        System.out.println(">>> EIA Validation Result: " + valid);
        return result;
    }
}
