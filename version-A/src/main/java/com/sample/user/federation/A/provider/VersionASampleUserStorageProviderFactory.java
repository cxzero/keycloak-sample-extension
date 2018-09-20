package com.sample.user.federation.A.provider;

import com.sample.user.federation.provider.SampleUserStorageProviderFactory;

public class VersionASampleUserStorageProviderFactory extends SampleUserStorageProviderFactory
{
    public static final String PROVIDER_ID = "version-A";

    @Override
    public String getId()
    {
        return PROVIDER_ID;
    }

    @Override
    public String getHelpText()
    {
        return "Version A";
    }
}
