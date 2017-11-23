package com.jk.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by yy on 2017/11/15.
 */
public class Huo implements Serializable {
    private static final long serialVersionUID = 2986851937965527592L;

    private Integer id;
    private  String danhao;
    private String shoptime;
    private String gongyingshang;
    private BigDecimal summonery;
    private Integer dengji;
    private Integer state;

    private String starttime;
    private String endtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDanhao() {
        return danhao;
    }

    public void setDanhao(String danhao) {
        this.danhao = danhao;
    }

    public String getShoptime() {
        return shoptime;
    }

    public void setShoptime(String shoptime) {
        this.shoptime = shoptime;
    }

    public String getGongyingshang() {
        return gongyingshang;
    }

    public void setGongyingshang(String gongyingshang) {
        this.gongyingshang = gongyingshang;
    }

    public BigDecimal getSummonery() {
        return summonery;
    }

    public void setSummonery(BigDecimal summonery) {
        this.summonery = summonery;
    }

    public Integer getDengji() {
        return dengji;
    }

    public void setDengji(Integer dengji) {
        this.dengji = dengji;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Huo huo = (Huo) o;

        return id.equals(huo.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Huo{" +
                "id=" + id +
                ", danhao='" + danhao + '\'' +
                ", shoptime='" + shoptime + '\'' +
                ", gongyingshang='" + gongyingshang + '\'' +
                ", summonery=" + summonery +
                ", dengji=" + dengji +
                ", state=" + state +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                '}';
    }
}
