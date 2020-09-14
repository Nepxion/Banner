# Nepxion Banner
[![Total lines](https://tokei.rs/b1/github/Nepxion/Banner?category=lines)](https://tokei.rs/b1/github/Nepxion/Banner?category=lines)  [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg?label=license)](https://github.com/Nepxion/Banner/blob/master/LICENSE)  [![Maven Central](https://img.shields.io/maven-central/v/com.nepxion/banner.svg?label=maven%20central)](https://search.maven.org/artifact/com.nepxion/banner)  [![Javadocs](http://www.javadoc.io/badge/com.nepxion/banner.svg)](http://www.javadoc.io/doc/com.nepxion/banner)  [![Build Status](https://travis-ci.org/Nepxion/Banner.svg?branch=master)](https://travis-ci.org/Nepxion/banner)  [![Codacy Badge](https://api.codacy.com/project/badge/Grade/72d939847f8e49319e009776d9c77b9a)](https://www.codacy.com/project/HaojunRen/Banner/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Nepxion/Banner&amp;utm_campaign=Badge_Grade_Dashboard)  [![Stars](https://img.shields.io/github/stars/Nepxion/Banner.svg?label=Stars&tyle=flat&logo=GitHub)](https://github.com/Nepxion/Banner/stargazers)  [![Stars](https://gitee.com/Nepxion/Banner/badge/star.svg)](https://gitee.com/nepxion/Banner/stargazers)

Nepxion Banner��һ�����Taobao Text�����������

## ����ϵ��
΢�ź͹��ں�

![](http://nepxion.gitee.io/docs/zxing-doc/΢��-1.jpg)![](http://nepxion.gitee.io/docs/zxing-doc/���ں�-1.jpg)![](http://nepxion.gitee.io/docs/zxing-doc/�ĵ�-1.jpg)

## ����

```xml
<dependency>
  <groupId>com.nepxion</groupId>
  <artifactId>banner</artifactId>
  <version>${banner.version}</version>
</dependency>
```

## ʾ��
ͨ������վ���������ı��ļ����ֹ����ı��ļ��ﴦ���һ�����Ԫ��ռ���еĸ�ʽ

[http://patorjk.com/software/taag/#p=display&f=Soft&t=Nepxion](http://patorjk.com/software/taag/#p=display&f=Soft&t=Nepxion)

����ʵ��
```java
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
```

���н��

![](http://nepxion.gitee.io/docs/banner-doc/Banner.jpg)

## Star����ͼ

[![Stargazers over time](https://starchart.cc/Nepxion/Banner.svg)](https://starchart.cc/Nepxion/Banner)