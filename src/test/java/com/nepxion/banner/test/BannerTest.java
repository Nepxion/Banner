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
import java.util.ArrayList;
import java.util.List;

import com.nepxion.banner.Description;
import com.nepxion.banner.DescriptionBanner;
import com.nepxion.banner.LogoBanner;
import com.nepxion.banner.VersionBanner;
import com.taobao.text.Color;

public class BannerTest {
    public static void main(String[] args) {
        LogoBanner logoBanner1 = new LogoBanner(BannerTest.class, "/com/nepxion/banner/resource/logo-halo-1.txt", "Welcome to Nepxion", 4, 7, new Color[] { Color.red, Color.yellow, Color.cyan, Color.magenta }, false);
        System.out.println(logoBanner1.getBanner());
        System.out.println(logoBanner1.getPlainBanner());

        LogoBanner logoBanner2 = new LogoBanner(BannerTest.class, "/com/nepxion/banner/resource/logo-halo-2.txt", "Welcome to Nepxion", 4, 5, new Color[] { Color.red, Color.yellow, Color.cyan, Color.magenta }, false);
        System.out.println(logoBanner2.getBanner());
        System.out.println(logoBanner2.getPlainBanner());

        LogoBanner logoBanner3 = new LogoBanner(BannerTest.class, "/com/nepxion/banner/resource/logo-arthas.txt", "Welcome to Nepxion", 6, 5, new Color[] { Color.red, Color.yellow, Color.cyan, Color.magenta, Color.green, Color.blue }, true);
        System.out.println(logoBanner3.getBanner());
        System.out.println(logoBanner3.getPlainBanner());

        VersionBanner versionBanner = new VersionBanner(BannerTest.class, "/com/nepxion/banner/resource/version.txt", "Unknown Version");

        List<Description> descriptions = new ArrayList<Description>();
        descriptions.add(new Description("Version:", versionBanner.getBanner(), 0, 10));
        descriptions.add(new Description("Site:", "http://www.nepxion.com", 0, 10));
        descriptions.add(new Description("Github:", "https://github.com/Nepxion/", 0, 10));
        descriptions.add(new Description("Blog:", "https://nepxion.iteye.com/", 0, 10));

        DescriptionBanner descriptionBanner = new DescriptionBanner();
        System.out.println(descriptionBanner.getBanner(descriptions));

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}