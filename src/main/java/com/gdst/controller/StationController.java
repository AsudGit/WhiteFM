package com.gdst.controller;

import com.alibaba.fastjson.JSONObject;
import com.gdst.pojo.Anchor;
import com.gdst.pojo.AnchorWorks;
import com.gdst.pojo.Offical_works;
import com.gdst.service.serviceImpl.StationServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value = "/index")
    public String queryAnchWorks(Model model) {
        List<AnchorWorks> anchorlist=stationService.Anchorworks_List();
        model.addAttribute("anchorlist",anchorlist);
        return "index";
    }

    @RequestMapping(value = "/playsong/{id}")
    public String querysimpleWorks(@PathVariable(value = "id")int id, Model model) {
        AnchorWorks anchorWorks= stationService.QueryAnchSongInfo(id);
       Anchor anchor= stationService.QueryAnchInfo(anchorWorks.getAnchor_id());
        model.addAttribute("anchorWorks",anchorWorks);
        model.addAttribute("anchor",anchor);
        return "musicplay";
    }

}
