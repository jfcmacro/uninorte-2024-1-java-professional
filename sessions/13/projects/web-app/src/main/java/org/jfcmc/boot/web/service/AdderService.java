package org.jfcmc.boot.web.service;

import java.util.Map;
import java.util.HashMap;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class AdderService {

    private Map<String, Integer> variables;

    public AdderService() {
        this.variables = new HashMap<>();
    }

    public void addVariables(String varname,
                             Integer value) {
        variables.put(varname, value);
    }

    public Integer getResult() {
        Integer result = 0;
        for (String variable : variables.keySet()) {
            result += variables.get(variable);
        }

        return result;
    }
}
