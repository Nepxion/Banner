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

import com.taobao.text.ui.TableElement;
import com.taobao.text.util.RenderUtil;

public class Version {
    // 下游系统的类，所的包寻址版本号
    private Class<?> clazz;

    // Version文本文件位置
    private String location;

    // Version
    private String version = "unknown";

    public Version(Class<?> clazz) {
        this(clazz, null);
    }

    public Version(Class<?> clazz, String location) {
        this.clazz = clazz;
        this.location = location;

        initialize();
    }

    private void initialize() {
        InputStream inputStream = null;
        try {
            if (location != null) {
                inputStream = clazz.getResourceAsStream(location);
            }

            if (inputStream != null) {
                version = IOUtils.toString(inputStream, BannerConstant.ENCODING_UTF_8).trim();
            } else {
                String implementationVersion = clazz.getPackage().getImplementationVersion();
                if (implementationVersion != null) {
                    version = implementationVersion;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
            }
        }
    }

    public String getVersion() {
        return version;
    }

    public String getRenderedVersion() {
        TableElement table = new TableElement().rightCellPadding(1).row("version", version);

        return RenderUtil.render(table);
    }
}