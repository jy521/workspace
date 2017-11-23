package com.jk.service.impl;

import com.jk.dao.MarketRepository;
import com.jk.model.Market;
import com.jk.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/16.
 */
@Service
public class MarketServiceImpl implements MarketService {

    @Autowired
    private MarketRepository marketRepository;

    @Override
    public List<Market> getMarketList(){
        return marketRepository.findAll();
    }
    @Override
    public Market findMarketById(long id){
        return marketRepository.findById(id);
    }
    @Override
    public void save(Market market){
        marketRepository.save(market);
    }
    @Override
    public void edit(Market market){
        marketRepository.save(market);
    }
    @Override
    public void delete(long id){
        marketRepository.delete(id);
    }
}

