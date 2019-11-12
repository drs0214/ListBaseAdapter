package com.drs.baseadapter;

import com.drs.baseadapter.bean.NavigationBarBean;
import com.drs.baseadapterlib.listview.ViewHolder;
import com.drs.baseadapterlib.listview.base.ItemViewDelegate;

/**
 * @author: drs
 * @time: 2019/11/12 10:57
 * @des:
 */
public class TestItemDelagate implements ItemViewDelegate<NavigationBarBean>{
    @Override
    public int getItemViewLayoutId() {
        return R.layout.listview_item;
    }

    @Override
    public boolean isForViewType(NavigationBarBean item, int position) {
        return true;
    }

    @Override
    public void convert(ViewHolder holder, NavigationBarBean o, int position) {
        holder.setText(R.id.tv,o.getTitleText());
    }
}
