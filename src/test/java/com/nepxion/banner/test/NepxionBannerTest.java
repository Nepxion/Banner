package com.nepxion.banner.test;

/**
 * <p>Title: Nepxion Banner</p>
 * <p>Description: Nepxion Banner</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.io.IOException;

import com.nepxion.banner.BannerConstant;
import com.nepxion.banner.Description;
import com.nepxion.banner.LogoBanner;
import com.nepxion.banner.NepxionBanner;
import com.taobao.text.Color;

public class NepxionBannerTest {
    public static void main(String[] args) {
        System.setProperty(BannerConstant.BANNER_SHOWN, "true");
        System.setProperty(BannerConstant.BANNER_SHOWN_ANSI_MODE, "true");

        LogoBanner logoBanner = new LogoBanner(NepxionBannerTest.class, "/com/nepxion/banner/resource/logo-permission.txt", "Welcome to Nepxion", 10, 5, new Color[] { Color.red, Color.yellow, Color.cyan, Color.magenta, Color.green, Color.blue, Color.red, Color.yellow, Color.cyan, Color.magenta }, true);

        NepxionBanner.show(logoBanner, new Description(BannerConstant.VERSION + ":", "3.0.5", 0, 1), new Description(BannerConstant.GITHUB + ":", BannerConstant.NEPXION_GITHUB, 0, 1));

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}