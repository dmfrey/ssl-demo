package com.broadcom.springconsulting.ssl_demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ssl.SslBundles;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile( "prod" )
public class SslBundleLogger {

    private static final Logger log = LoggerFactory.getLogger( SslBundleLogger.class );

    private final SslBundles sslBundles;

    public SslBundleLogger( SslBundles sslBundles ) {

        this.sslBundles = sslBundles;

    }

    @PostConstruct
    void init() {

        log.info( "Initializing SSL Bundles" );

        var sslBundle = sslBundles.getBundle( "server" );
        log.info( "SSL Bundle Key: [{}]", sslBundle.getKey() );

        log.info( "KeyStore type: [{}]", sslBundle.getStores().getKeyStore().getType() );
        log.info( "TrustStore type: [{}]", sslBundle.getStores().getTrustStore().getType() );

    }

}
