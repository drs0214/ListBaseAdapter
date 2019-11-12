package com.drs.baseadapterlib.listview.base;

/**
 * @author: drs
 * @time: 2019/11/11 22:45
 * @des:
 */
import com.drs.baseadapterlib.listview.ViewHolder;

public interface ItemViewDelegate<T>
{

    public abstract int getItemViewLayoutId();

    public abstract boolean isForViewType(T item, int position);

    public abstract void convert(ViewHolder holder, T t, int position);



}
