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

import com.nepxion.banner.Logo;
import com.nepxion.banner.Version;
import com.taobao.text.Color;

public class BannerTest {
    public static void main(String[] args) {
        Logo logo1 = new Logo("/com/nepxion/banner/res/logo-halo-1.txt", 4, 7, new Color[] { Color.red, Color.yellow, Color.cyan, Color.magenta }, false);
        System.out.println(logo1.getLogo());
        System.out.println(logo1.getPlainTextLogo());

        Logo logo2 = new Logo("/com/nepxion/banner/res/logo-halo-2.txt", 4, 5, new Color[] { Color.red, Color.yellow, Color.cyan, Color.magenta }, false);
        System.out.println(logo2.getLogo());
        System.out.println(logo2.getPlainTextLogo());

        Logo logo3 = new Logo("/com/nepxion/banner/res/logo-arthas.txt", 6, 5, new Color[] { Color.red, Color.yellow, Color.cyan, Color.magenta, Color.green, Color.blue }, true);
        System.out.println(logo3.getLogo());
        System.out.println(logo3.getPlainTextLogo());

        Version version = new Version(Version.class, "/com/nepxion/banner/res/version.txt");
        System.out.println(version.getVersion());

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}