package com.example.xuwei.testgsonformat.bean;

import java.util.List;

/**
 * Created by Xu Wei on 2017/4/26.
 */

public class AddrBean {
    @com.google.gson.annotations.SerializedName("城市代码")
    private List<ProvinceBean> provinceList;

    public List<ProvinceBean> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<ProvinceBean> provinceList) {
        this.provinceList = provinceList;
    }

    public static class ProvinceBean {
        /**
         * 省 : 北京
         * 市 : [{"市名":"北京","编码":"101010100"},{"市名":"朝阳","编码":"101010300"},{"市名":"顺义","编码":"101010400"},{"市名":"怀柔","编码":"101010500"},{"市名":"通州","编码":"101010600"},{"市名":"昌平","编码":"101010700"},{"市名":"延庆","编码":"101010800"},{"市名":"丰台","编码":"101010900"},{"市名":"石景山","编码":"101011000"},{"市名":"大兴","编码":"101011100"},{"市名":"房山","编码":"101011200"},{"市名":"密云","编码":"101011300"},{"市名":"门头沟","编码":"101011400"},{"市名":"平谷","编码":"101011500"},{"市名":"八达岭","编码":"101011600"},{"市名":"佛爷顶","编码":"101011700"},{"市名":"汤河口","编码":"101011800"},{"市名":"密云上甸子","编码":"101011900"},{"市名":"斋堂","编码":"101012000"},{"市名":"霞云岭","编码":"101012100"},{"市名":"北京城区","编码":"101012200"},{"市名":"海淀","编码":"101010200"}]
         */

        @com.google.gson.annotations.SerializedName("省")
        private String province;
        @com.google.gson.annotations.SerializedName("市")
        private List<CityBean> citylist;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public List<CityBean> getCitylist() {
            return citylist;
        }

        public void setCitylist(List<CityBean> citylist) {
            this.citylist = citylist;
        }

        public static class CityBean {
            /**
             * 市名 : 北京
             * 编码 : 101010100
             */

            @com.google.gson.annotations.SerializedName("市名")
            private String cityName;
            @com.google.gson.annotations.SerializedName("编码")
            private String cityCode;

            public String getCityName() {
                return cityName;
            }

            public void setCityName(String cityName) {
                this.cityName = cityName;
            }

            public String getCityCode() {
                return cityCode;
            }

            public void setCityCode(String cityCode) {
                this.cityCode = cityCode;
            }
        }
    }
}
