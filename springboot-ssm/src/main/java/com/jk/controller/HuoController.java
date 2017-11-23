package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.Huo;
import com.jk.service.HuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by yy on 2017/11/15.
 */
@RestController
public class HuoController extends  BaseController{

    @Autowired
    private HuoService huoService;

    @RequestMapping("findHuo")
    public void findHuo(HttpServletRequest request, HttpServletResponse response,String callback,Huo huo){
        List<Huo> list = huoService.findHou(huo);
        String json = JSON.toJSONStringWithDateFormat(list,"yyyy-MM-dd HH:mm:ss");
        json = callback+"("+json+")";
        super.outString(json,response);
    }




}
