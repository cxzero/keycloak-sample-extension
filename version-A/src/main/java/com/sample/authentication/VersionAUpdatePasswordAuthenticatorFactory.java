package com.sample.authentication;

public class VersionAUpdatePasswordAuthenticatorFactory extends SampleUpdatePassAuthenticatorAuthenticatorFactory
{
    public static final String PROVIDER_ID = "version-A-update-pass";

    @Override
    public String getId()
    {
        return PROVIDER_ID;
    }

    @Override
    public String getHelpText()
    {
        return "Version A Update Password";
    }

    @Override
    public String getDisplayType()
    {
        return "Version A Update Pass";
    }
}
