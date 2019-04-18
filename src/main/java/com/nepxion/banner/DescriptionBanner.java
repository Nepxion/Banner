package com.nepxion.banner;

/**
 * <p>Title: Nepxion Banner</p>
 * <p>Description: Nepxion Banner</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.util.List;

import com.taobao.text.ui.TableElement;
import com.taobao.text.util.RenderUtil;

public class DescriptionBanner {
    public String getBanner(List<Description> descriptions) {
        TableElement table = new TableElement();
        for (Description description : descriptions) {
            table.leftCellPadding(description.getLeftCellPadding()).rightCellPadding(description.getRightCellPadding()).row(description.getName(), description.getDescription());
        }

        return RenderUtil.render(table);
    }
}