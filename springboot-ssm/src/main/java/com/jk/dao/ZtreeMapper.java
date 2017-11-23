package com.jk.dao;

import com.jk.model.Ztree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yy on 2017/11/15.
 */
@Mapper
public interface ZtreeMapper {
    @Select("select * from jy_ztree")
    List<Ztree> queryZtree();
}
