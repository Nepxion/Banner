# Nepxion Banner
![Total visits](https://visitor-badge.laobi.icu/badge?page_id=Nepxion&title=total%20visits)  [![Total lines](https://tokei.rs/b1/github/Nepxion/Banner?category=lines)](https://tokei.rs/b1/github/Nepxion/Banner?category=lines)  [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg?label=license)](https://github.com/Nepxion/Banner/blob/master/LICENSE)  [![Maven Central](https://img.shields.io/maven-central/v/com.nepxion/banner.svg?label=maven)](https://search.maven.org/artifact/com.nepxion/banner)  [![Javadocs](http://www.javadoc.io/badge/com.nepxion/banner.svg)](http://www.javadoc.io/doc/com.nepxion/banner)  [![Build Status](https://travis-ci.org/Nepxion/Banner.svg?branch=master)](https://travis-ci.org/Nepxion/banner)  [![Codacy Badge](https://app.codacy.com/project/badge/Grade/e47993bb61a34f98a39b4bb9afdd5daf)](https://www.codacy.com/gh/Nepxion/Banner/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Nepxion/Banner&amp;utm_campaign=Badge_Grade)  [![Stars](https://img.shields.io/github/stars/Nepxion/Banner.svg?label=Stars&tyle=flat&logo=GitHub)](https://github.com/Nepxion/Banner/stargazers)  [![Stars](https://gitee.com/Nepxion/Banner/badge/star.svg)](https://gitee.com/Nepxion/Banner/stargazers)

<a href="https://github.com/Nepxion" tppabs="#" target="_blank"><img width="25" height="25" src="http://nepxion.gitee.io/discovery/docs/icon-doc/github.png"></a>&nbsp;  <a href="https://gitee.com/Nepxion" tppabs="#" target="_blank"><img width="25" height="25" src="http://nepxion.gitee.io/discovery/docs/icon-doc/gitee.png"></a>&nbsp;  <a href="https://search.maven.org/search?q=g:com.nepxion" tppabs="#" target="_blank"><img width="25" height="25" src="http://nepxion.gitee.io/discovery/docs/icon-doc/maven.png"></a>&nbsp;  <a href="http://nepxion.gitee.io/discovery/docs/contact-doc/wechat.jpg" tppabs="#" target="_blank"><img width="25" height="25" src="http://nepxion.gitee.io/discovery/docs/icon-doc/wechat.png"></a>&nbsp;  <a href="http://nepxion.gitee.io/discovery/docs/contact-doc/dingding.jpg" tppabs="#" target="_blank"><img width="25" height="25" src="http://nepxion.gitee.io/discovery/docs/icon-doc/dingding.png"></a>&nbsp;  <a href="http://nepxion.gitee.io/discovery/docs/contact-doc/gongzhonghao.jpg" tppabs="#" target="_blank"><img width="25" height="25" src="http://nepxion.gitee.io/discovery/docs/icon-doc/gongzhonghao.png"></a>&nbsp;  <a href="mailto:1394997@qq.com" tppabs="#"><img width="25" height="25" src="http://nepxion.gitee.io/discovery/docs/icon-doc/email.png"></a>

Nepxion Banner是一款基于Taobao Text的旗标生成器

## 依赖

```xml
<dependency>
  <groupId>com.nepxion</groupId>
  <artifactId>banner</artifactId>
  <version>${banner.version}</version>
</dependency>
```

## 示例
通过此网站制作旗标的文本文件，手工在文本文件里处理成一个旗标元素占单行的格式

[http://patorjk.com/software/taag/#p=display&f=Soft&t=Nepxion](http://patorjk.com/software/taag/#p=display&f=Soft&t=Nepxion)

具体实现
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

运行结果

![](http://nepxion.gitee.io/discovery/docs/banner-doc/Banner.jpg)

## 请联系我
微信、钉钉、公众号和文档

![](http://nepxion.gitee.io/discovery/docs/contact-doc/wechat-1.jpg)![](http://nepxion.gitee.io/discovery/docs/contact-doc/dingding-1.jpg)![](http://nepxion.gitee.io/discovery/docs/contact-doc/gongzhonghao-1.jpg)![](http://nepxion.gitee.io/discovery/docs/contact-doc/document-1.jpg)

## Star走势图
[![Stargazers over time](https://starchart.cc/Nepxion/Banner.svg)](https://starchart.cc/Nepxion/Banner)