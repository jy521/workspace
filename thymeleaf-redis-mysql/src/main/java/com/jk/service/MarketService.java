package com.jk.service;

import com.jk.model.Market;

import java.util.List;

/**
 * Created by Administrator on 2017/11/16.
 */
public interface MarketService {
    public List<Market> getMarketList();
    public Market findMarketById(long id);
    public void save(Market market);
    public void edit(Market market);
    public void delete(long id);
}
