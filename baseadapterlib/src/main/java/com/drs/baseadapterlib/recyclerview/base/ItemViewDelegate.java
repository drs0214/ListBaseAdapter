package com.drs.baseadapterlib.recyclerview.base;

/**
 * @author: drs
 * @time: 2019/11/11 23:01
 * @des:
 */
public interface ItemViewDelegate<T>
{

    int getItemViewLayoutId();

    boolean isForViewType(T item, int position);

    void convert(ViewHolder holder, T t, int position);

}
