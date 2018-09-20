package com.sample.authentication;

import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.Authenticator;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(SampleUpdatePassAuthenticator.class)
public class SampleUpdatePassAuthenticator implements Authenticator
{
    @Override
    public void authenticate(AuthenticationFlowContext context)
    {

    }

    @Override
    public void action(AuthenticationFlowContext context)
    {

    }

    @Override
    public boolean requiresUser()
    {
        return true;
    }

    @Override
    public boolean configuredFor(KeycloakSession session, RealmModel realm, UserModel user)
    {
        return false;
    }

    @Override
    public void setRequiredActions(KeycloakSession session, RealmModel realm, UserModel user)
    {

    }

    @Override
    public void close()
    {

    }
}
