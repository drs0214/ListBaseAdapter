package com.drs.baseadapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.drs.baseadapterlib.recyclerview.CommonAdapter;
import com.drs.baseadapterlib.recyclerview.base.ViewHolder;
import com.drs.baseadapterlib.recyclerview.wrapper.HeaderAndFooterWrapper;
import com.drs.baseadapterlib.recyclerview.wrapper.LoadmoreWrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: drs
 * @time: 2019/11/12 15:20
 * @des:
 */
public class RecyclerViewActivity extends Activity{
    RecyclerView recyclerview;
     private List<String> mDatas = new ArrayList<>(Arrays.asList("测试数据1",
             "测试数据25",
             "测试数据12","测试数据15","测试数据17","测试数据19"));
//    private List<String> mDatas = new ArrayList<>();
    private HeaderAndFooterWrapper mHeaderAndFooterWrapper;
    private CommonAdapter<String> mAdapter;
    private LoadmoreWrapper mLoadMoreWrapper;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
//        initDatas();
        recyclerview=(RecyclerView) findViewById(R.id.id_recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
//        recyclerview.setLayoutManager(new GridLayoutManager(this, 2));

        recyclerview.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
        mAdapter=new CommonAdapter<String>(this,R.layout.listview_item,mDatas) {
            @Override
            protected void convert(ViewHolder holder, String o, int position) {
                                holder.setText(R.id.tv,o);
//                holder.setText(R.id.tv, o + " : " + holder.getAdapterPosition() + " , " + holder.getLayoutPosition());
            }

        };
        recyclerview.setAdapter(mAdapter);
       /* initHeaderAndFooter();
        mLoadMoreWrapper = new LoadmoreWrapper(mHeaderAndFooterWrapper);
        mLoadMoreWrapper.setLoadMoreView(R.layout.default_loading);
        mLoadMoreWrapper.setOnLoadMoreListener(new LoadmoreWrapper.OnLoadMoreListener()
        {
            @Override
            public void onLoadMoreRequested()
            {
                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        for (int i = 0; i < 10; i++)
                        {
                            mDatas.add("Add:" + i);
                        }
                        mLoadMoreWrapper.notifyDataSetChanged();

                    }
                }, 1000);
            }
        });
        recyclerview.setAdapter(mLoadMoreWrapper);
        mAdapter.setOnItemClickListener(new CommonAdapter.OnItemClickListener()
        {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position)
            {
                Toast.makeText(RecyclerViewActivity.this, "pos = " + position, Toast.LENGTH_SHORT).show();
                mAdapter.notifyItemRemoved(position);
            }

            @Override
            public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position)
            {
                return false;
            }
        });*/
    }
    private void initDatas()
    {
        for (int i = 'A'; i <= 'z'; i++)
        {
            mDatas.add((char) i + "");
        }
    }
    private void initHeaderAndFooter()
    {
        mHeaderAndFooterWrapper = new HeaderAndFooterWrapper(mAdapter);

        TextView t1 = new TextView(this);
        t1.setText("Header 1");
        TextView t2 = new TextView(this);
        t2.setText("Header 2");
        mHeaderAndFooterWrapper.addHeaderView(t1);
        mHeaderAndFooterWrapper.addHeaderView(t2);
    }
}
