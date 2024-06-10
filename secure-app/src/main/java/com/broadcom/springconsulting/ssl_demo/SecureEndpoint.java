package com.broadcom.springconsulting.ssl_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SecureEndpoint {

    @GetMapping( "/secured" )
    public Map<String, String> secured() {

        return Map.of( "content", "this is accessible with ssl" );
    }

}
