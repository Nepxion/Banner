package com.nepxion.banner;

/**
 * <p>Title: Nepxion Banner</p>
 * <p>Description: Nepxion Banner</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

public class VersionBanner extends AbstractBanner {
    public VersionBanner(Class<?> resourceClass, String resourceLocation, String defaultBanner) {
        super(resourceClass, resourceLocation, defaultBanner);

        initialize();
    }

    @Override
    protected String generateBanner(String bannerText) {
        if (bannerText == null) {
            String implementationVersion = resourceClass.getPackage().getImplementationVersion();
            if (implementationVersion != null) {
                return implementationVersion;
            } else {
                return defaultBanner;
            }
        } else {
            return bannerText;
        }
    }
}