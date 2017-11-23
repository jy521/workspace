package com.jk.service.impl;

import com.jk.dao.HuoMapper;
import com.jk.model.Huo;
import com.jk.service.HuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yy on 2017/11/15.
 */
@Service
public class HuoServiceImpl implements HuoService{

    @Autowired
    private HuoMapper huoMapper;

    @Override
    public List<Huo> findHou(Huo huo) {
        return huoMapper.findHou();
    }
}
