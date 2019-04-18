package com.nepxion.banner;

/**
 * <p>Title: Nepxion Banner</p>
 * <p>Description: Nepxion Banner</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import static com.taobao.text.ui.Element.label;

import com.taobao.text.Color;
import com.taobao.text.Decoration;
import com.taobao.text.ui.LabelElement;
import com.taobao.text.ui.TableElement;
import com.taobao.text.util.RenderUtil;

public class LogoBanner extends AbstractBanner {
    // Logo元素的总个数
    private int elementCount;

    // Logo元素的单个占行数
    private int elementLineCount;

    // Logo元素的颜色数组
    private Color[] elementColors;

    // Logo字体是否发亮
    private boolean boldOff;

    public LogoBanner(Class<?> resourceClass, String resourceLocation, String defaultBanner, int elementCount, int elementLineCount, Color[] elementColors, boolean boldOff) {
        super(resourceClass, resourceLocation, defaultBanner);

        this.elementCount = elementCount;
        this.elementLineCount = elementLineCount;
        this.elementColors = elementColors;
        this.boldOff = boldOff;

        initialize();
    }

    @Override
    protected String generateBanner(String bannerText) {
        if (bannerText != null) {
            StringBuilder stringBuilder = new StringBuilder();
            String[] elementTexts = new String[elementCount]; // Logo元素的总个数
            int i = 0, j = 0;
            for (String line : bannerText.split("\n")) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
                if (i++ == elementLineCount - 1) { // Logo元素的单个占行数减1
                    elementTexts[j++] = stringBuilder.toString();
                    i = 0;
                    stringBuilder.setLength(0);
                }
            }

            LabelElement[] labelElements = new LabelElement[elementCount];
            for (int k = 0; k < elementCount; k++) {
                if (boldOff) {
                    labelElements[k] = label(elementTexts[k]).style(Decoration.bold_off.fg(elementColors[k]));
                } else {
                    labelElements[k] = label(elementTexts[k]).style(Decoration.bold.fg(elementColors[k]));
                }
            }

            TableElement tableElement = new TableElement();
            tableElement.row(labelElements);

            return RenderUtil.render(tableElement);
        } else {
            return defaultBanner;
        }
    }
}