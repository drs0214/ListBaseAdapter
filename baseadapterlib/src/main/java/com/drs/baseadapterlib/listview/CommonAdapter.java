package com.drs.baseadapterlib.listview;

import android.content.Context;

import com.drs.baseadapterlib.listview.base.ItemViewDelegate;

import java.util.List;

/**
 * @author: drs
 * @time: 2019/11/11 22:43
 * @des:
 */
public abstract class CommonAdapter<T> extends MultiItemTypeAdapter<T>
{

    public CommonAdapter(Context context, final int layoutId, List<T> datas)
    {
        super(context, datas);

        addItemViewDelegate(new ItemViewDelegate<T>()
        {
            @Override
            public int getItemViewLayoutId()
            {
                return layoutId;
            }

            @Override
            public boolean isForViewType(T item, int position)
            {
                return true;
            }

            @Override
            public void convert(ViewHolder holder, T t, int position)
            {
                CommonAdapter.this.convert(holder, t, position);
            }
        });
    }

    protected abstract void convert(ViewHolder viewHolder, T item, int position);

}
