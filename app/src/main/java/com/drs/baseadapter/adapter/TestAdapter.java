package com.drs.baseadapter.adapter;

import android.content.Context;

import com.drs.baseadapter.TestItemDelagate;
import com.drs.baseadapterlib.listview.MultiItemTypeAdapter;

import java.util.List;

/**
 * @author: drs
 * @time: 2019/11/12 10:48
 * @des:
 */
public class TestAdapter extends MultiItemTypeAdapter{
    public TestAdapter(Context context, List datas) {
        super(context, datas);
        addItemViewDelegate(new TestItemDelagate());
    }
}
