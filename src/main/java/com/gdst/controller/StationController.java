package com.gdst.controller;

import com.alibaba.fastjson.JSONObject;
import com.gdst.pojo.Offical_works;
import com.gdst.service.serviceImpl.StationServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jake on 2018/12/24.
 */

@RequestMapping(value = "/works")
@Controller(value = "stationController")
public class StationController {


        @Resource(name = "stationService")
        private StationServiceImpl stationService;

        @RequestMapping(value = "/offworks")
        @ResponseBody
        public Object queryOffWorks() {
            List<Offical_works> offlist=stationService.Offworks_List();

            return JSONObject.toJSONString(offlist);
        }
    @RequestMapping("/ss")
    public ModelAndView in(){
        return new ModelAndView("index");
    }
}
