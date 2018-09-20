package com.sample.authentication;

public class VersionBUpdatePasswordAuthenticatorFactory extends SampleUpdatePassAuthenticatorAuthenticatorFactory
{
    public static final String PROVIDER_ID = "version-B-update-pass";

    @Override
    public String getId()
    {
        return PROVIDER_ID;
    }

    @Override
    public String getHelpText()
    {
        return "Version B Update Password";
    }

    @Override
    public String getDisplayType()
    {
        return "Version B Update Pass";
    }
}
