
package com.sample.user.federation.provider;

import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.storage.UserStorageProviderFactory;

import javax.naming.InitialContext;

public abstract class SampleUserStorageProviderFactory implements UserStorageProviderFactory<SampleUserStorageProvider>
{
    @Override
    public SampleUserStorageProvider create(KeycloakSession session, ComponentModel model)
    {
        try {
            InitialContext ctx = new InitialContext();
            SampleUserStorageProvider provider = (SampleUserStorageProvider) ctx
                    .lookup("java:global/sample-user-federation/" + SampleUserStorageProvider.class.getSimpleName());

            provider.setModel(model);
            provider.setSession(session);

            return provider;

        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }

    @Override
    public void close()
    {

    }
}
