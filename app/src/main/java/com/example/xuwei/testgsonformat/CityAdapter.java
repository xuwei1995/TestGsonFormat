package com.example.xuwei.testgsonformat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.xuwei.testgsonformat.bean.AddrBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xu Wei on 2017/4/26.
 */

public class CityAdapter extends BaseAdapter {
    private Context context;
    private List<AddrBean.ProvinceBean.CityBean> cityBeanList = new ArrayList<>();

    public void setCityBeanList(List<AddrBean.ProvinceBean.CityBean> cityBeanList) {
        this.cityBeanList = cityBeanList;
        notifyDataSetChanged();
    }

    public CityAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return cityBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return cityBeanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv = new TextView(context);
        tv.setText(cityBeanList.get(position).getCityName());
        return tv;
    }
}
