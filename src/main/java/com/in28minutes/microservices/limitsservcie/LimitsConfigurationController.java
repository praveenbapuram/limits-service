package com.in28minutes.microservices.limitsservcie;

import com.in28minutes.microservices.limitsservcie.bean.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @GetMapping("limits")
    public LimitConfiguration retrieveLimitsFromConfigurations(){
        return new LimitConfiguration(1000,1);
    }
}
