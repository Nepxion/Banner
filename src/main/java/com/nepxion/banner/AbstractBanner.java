package com.nepxion.banner;

/**
 * <p>Title: Nepxion Banner</p>
 * <p>Description: Nepxion Banner</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import com.taobao.text.util.RenderUtil;

public abstract class AbstractBanner {
    // Resource类
    protected Class<?> resourceClass;

    // Resource位置
    protected String resourceLocation;

    // 默认旗标文本
    protected String defaultBanner;

    // 最终旗标文本
    protected String banner;

    public AbstractBanner(Class<?> resourceClass, String resourceLocation, String defaultBanner) {
        this.resourceClass = resourceClass;
        this.resourceLocation = resourceLocation;
        this.defaultBanner = defaultBanner;
    }

    protected void initialize() {
        InputStream inputStream = null;
        String bannerText = null;
        try {
            if (resourceLocation != null) {
                inputStream = resourceClass.getResourceAsStream(resourceLocation);
                bannerText = IOUtils.toString(inputStream, BannerConstant.ENCODING_UTF_8);
            }
        } catch (Exception e) {

        } finally {
            banner = generateBanner(bannerText);

            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
            }
        }
    }

    public String getBanner() {
        return banner;
    }

    // 显示成非ansi模式
    public String getPlainBanner() {
        return RenderUtil.ansiToPlainText(banner);
    }

    protected abstract String generateBanner(String bannerText);
}