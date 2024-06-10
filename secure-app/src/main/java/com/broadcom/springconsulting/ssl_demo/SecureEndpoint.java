package com.broadcom.springconsulting.ssl_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SecureEndpoint {

    private static final Logger log = LoggerFactory.getLogger( SecureEndpoint.class );

    @GetMapping( "/secured" )
    public Map<String, String> secured() {
        log.info( "secured : enter" );

        return Map.of( "content", "this is accessible with ssl" );
    }

}
