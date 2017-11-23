package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.Json;
import com.jk.model.Ztree;
import com.jk.service.ZtreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yy on 2017/11/15.
 */
@RestController
public class ZtreeController extends  BaseController{

   @Autowired
    private ZtreeService ztreeService;

    @RequestMapping("queryZtree")
    public void queryZtree(Ztree ztree, HttpServletResponse response, String callback,HttpServletRequest request){
        List<Ztree> list = ztreeService.queryZtree(ztree);
        String json = JSON.toJSONStringWithDateFormat(list,"yyyy-MM-dd HH:mm:ss");
        json = callback+"("+json+")";
        super.outString(json,response);

    }
}
