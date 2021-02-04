package com.profesorp.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigServiceController {

    @Value("${valores.valor_fijo}")
    String valorFijo;

    @GetMapping("/getMessage")
    public String getMessage() {
        return valorFijo;
    }
}
