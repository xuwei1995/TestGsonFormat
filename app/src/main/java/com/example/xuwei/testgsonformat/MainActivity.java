package com.example.xuwei.testgsonformat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.example.xuwei.testgsonformat.bean.AddrBean;
import com.google.gson.GsonBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    private Spinner spProvince, spCity;
    private AddrBean addrBean;
    private ProvinceAdapter adpProvince;
    private CityAdapter adpCity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
        register();
    }

    private void register() {
        spProvince.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                adpCity.setCityBeanList(addrBean.getProvinceList().get(position).getCitylist());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void loadData() {
        try {
            InputStream inputStream = getApplicationContext().getAssets().open("addr_china.json");

            addrBean = new GsonBuilder().create().fromJson(new InputStreamReader(inputStream), AddrBean.class);

            spProvince.setAdapter(adpProvince);
            adpProvince.setProvinceBeanList(addrBean.getProvinceList());

            spCity.setAdapter(adpCity);
            adpCity.setCityBeanList(addrBean.getProvinceList().get(0).getCitylist());
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private void initView() {
        spCity = (Spinner) findViewById(R.id.city_list);
        spProvince = (Spinner) findViewById(R.id.province_list);

        adpProvince = new ProvinceAdapter(this);
        adpCity = new CityAdapter(this);
    }
}
