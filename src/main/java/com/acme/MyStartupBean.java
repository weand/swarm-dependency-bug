package com.acme;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import com.nimbusds.oauth2.sdk.token.BearerAccessToken;

@Singleton
@Startup
public class MyStartupBean {

    protected BearerAccessToken accesstoken;

    @PostConstruct
    public void setup() {

    }

}
