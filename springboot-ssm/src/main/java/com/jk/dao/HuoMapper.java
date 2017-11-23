package com.jk.dao;

import com.jk.model.Huo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yy on 2017/11/15.
 */
@Mapper
public interface HuoMapper {

    @Select("select * from jy_huo")
    List<Huo> findHou();
}
