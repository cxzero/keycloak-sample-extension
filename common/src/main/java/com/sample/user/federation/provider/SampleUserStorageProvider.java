package com.sample.user.federation.provider;

import org.keycloak.component.ComponentModel;
import org.keycloak.credential.CredentialInput;
import org.keycloak.credential.CredentialInputValidator;
import org.keycloak.credential.CredentialModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;
import org.keycloak.models.cache.CachedUserModel;
import org.keycloak.models.cache.OnUserCache;
import org.keycloak.storage.StorageId;
import org.keycloak.storage.UserStorageProvider;
import org.keycloak.storage.user.UserLookupProvider;

import javax.ejb.Local;
import javax.ejb.Remove;
import javax.ejb.Stateful;

@Stateful
@Local(SampleUserStorageProvider.class)
public class SampleUserStorageProvider
        implements UserStorageProvider, CredentialInputValidator, UserLookupProvider, OnUserCache
{
    protected ComponentModel model;

    protected KeycloakSession session;

    public void setModel(ComponentModel model)
    {
        this.model = model;
    }

    public void setSession(KeycloakSession session)
    {
        this.session = session;
    }

    @Remove
    @Override
    public void close()
    {

    }

    @Override
    public boolean supportsCredentialType(String credentialType)
    {
        return CredentialModel.PASSWORD.equals(credentialType);
    }

    @Override
    public boolean isConfiguredFor(RealmModel realm, UserModel user, String credentialType)
    {
        return true;
    }

    @Override
    public boolean isValid(RealmModel realm, UserModel user, CredentialInput input)
    {
        // Not implemented
        return true;
    }

    @Override
    public UserModel getUserById(String id, RealmModel realm)
    {
        String username = StorageId.externalId(id);
        return getUserByUsername(username, realm);
    }

    @Override
    public UserModel getUserByUsername(String username, RealmModel realm)
    {
        // Not implemented
        return null;
    }

    @Override
    public UserModel getUserByEmail(String email, RealmModel realm)
    {
        // Not implemented
        return null;
    }

    @Override
    public void onCache(RealmModel realm, CachedUserModel user, UserModel delegate)
    {
        // Not implemented
    }
}
