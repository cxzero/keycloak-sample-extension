
package com.sample.authentication;

import org.keycloak.Config;
import org.keycloak.authentication.Authenticator;
import org.keycloak.authentication.AuthenticatorFactory;
import org.keycloak.authentication.ConfigurableAuthenticatorFactory;
import org.keycloak.models.AuthenticationExecutionModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.provider.ProviderConfigProperty;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.ArrayList;
import java.util.List;

public abstract class SampleUpdatePassAuthenticatorAuthenticatorFactory
        implements AuthenticatorFactory, ConfigurableAuthenticatorFactory
{
    @Override
    public synchronized Authenticator create(KeycloakSession session)
    {
        try {
            InitialContext ctx = new InitialContext();
            return (SampleUpdatePassAuthenticator) ctx
                    .lookup("java:global/sample-user-federation/" + SampleUpdatePassAuthenticator.class
                            .getSimpleName());

        } catch (NamingException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static AuthenticationExecutionModel.Requirement[] REQUIREMENT_CHOICES =
            {AuthenticationExecutionModel.Requirement.REQUIRED};

    @Override
    public AuthenticationExecutionModel.Requirement[] getRequirementChoices()
    {
        return REQUIREMENT_CHOICES;
    }

    @Override
    public boolean isUserSetupAllowed()
    {
        return true;
    }

    @Override
    public boolean isConfigurable()
    {
        return false;
    }

    @Override
    public List<ProviderConfigProperty> getConfigProperties()
    {
        return configProperties;
    }

    private static final List<ProviderConfigProperty> configProperties = new ArrayList<>();

    @Override
    public String getReferenceCategory()
    {
        return "Category Common";
    }

    @Override
    public void init(Config.Scope config)
    {

    }

    @Override
    public void postInit(KeycloakSessionFactory factory)
    {

    }

    @Override
    public void close()
    {

    }
}
