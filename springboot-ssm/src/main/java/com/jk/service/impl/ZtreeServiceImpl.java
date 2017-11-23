package com.jk.service.impl;

import com.jk.dao.ZtreeMapper;
import com.jk.model.Ztree;
import com.jk.service.ZtreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yy on 2017/11/15.
 */
@Service
public class ZtreeServiceImpl implements ZtreeService{

    @Autowired
    private ZtreeMapper ztreeMapper;


    @Override
    public List<Ztree> queryZtree(Ztree ztree) {
        return ztreeMapper.queryZtree();


    }
}
