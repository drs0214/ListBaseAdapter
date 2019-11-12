package com.drs.baseadapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import com.drs.baseadapter.adapter.TestAdapter;
import com.drs.baseadapter.bean.NavigationBarBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: drs
 * @time: 2019/11/11 23:19
 * @des:
 */
public class ListViewActivity  extends Activity{
    ListView listview;
    private List<String> mDatas = new ArrayList<>(Arrays.asList("MultiItem ListView",
            "RecyclerView",
            "MultiItem RecyclerView"));
    private List<NavigationBarBean> listdata=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        listview= (ListView)findViewById(R.id.listview);
      /*  listview.setAdapter(new com.drs.baseadapterlib.listview.CommonAdapter<String>(this, R.layout.listview_item,mDatas) {
            @Override
            protected void convert(ViewHolder viewHolder, String item, int position) {
//                viewHolder.setText(R.id.tv,mDatas.get(position));
                viewHolder.setText(R.id.tv,item);
            }

            @Override
            public void onViewHolderCreated(ViewHolder holder, View itemView) {
                super.onViewHolderCreated(holder, itemView);
            }
        });*/


        for (int i = 0; i <100 ; i++) {
            NavigationBarBean navigationBarBean = new NavigationBarBean();
            navigationBarBean.setTitleText("测试数据"+i);
            listdata.add(navigationBarBean);
        }
        listview.setAdapter(new TestAdapter(this,listdata));
    }
}
