package com.sample.user.federation.A.provider;

import com.sample.user.federation.provider.SampleUserStorageProviderFactory;

public class VersionBSampleUserStorageProviderFactory extends SampleUserStorageProviderFactory
{
    public static final String PROVIDER_ID = "version-B";

    public String getId()
    {
        return PROVIDER_ID;
    }
}
