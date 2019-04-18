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

import com.nepxion.banner.LogoBanner;
import com.nepxion.banner.VersionBanner;
import com.taobao.text.Color;

public class BannerTest {
    public static void main(String[] args) {
        LogoBanner banner1 = new LogoBanner(BannerTest.class, "/com/nepxion/banner/resource/logo-halo-1.txt", "Welcome to Nepxion", 4, 7, new Color[] { Color.red, Color.yellow, Color.cyan, Color.magenta }, false);
        System.out.println(banner1.getBanner());
        System.out.println(banner1.getPlainBanner());

        LogoBanner banner2 = new LogoBanner(BannerTest.class, "/com/nepxion/banner/resource/logo-halo-2.txt", "Welcome to Nepxion", 4, 5, new Color[] { Color.red, Color.yellow, Color.cyan, Color.magenta }, false);
        System.out.println(banner2.getBanner());
        System.out.println(banner2.getPlainBanner());

        LogoBanner banner3 = new LogoBanner(BannerTest.class, "/com/nepxion/banner/resource/logo-arthas.txt", "Welcome to Nepxion", 6, 5, new Color[] { Color.red, Color.yellow, Color.cyan, Color.magenta, Color.green, Color.blue }, true);
        System.out.println(banner3.getBanner());
        System.out.println(banner3.getPlainBanner());

        VersionBanner banner4 = new VersionBanner(BannerTest.class, "/com/nepxion/banner/resource/version.txt", "Unknown Version");
        System.out.println(banner4.getBanner());
        System.out.println(banner4.getPlainBanner());

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}