package com.gdst.service.serviceImpl;

import com.gdst.dao.StationMapper;
import com.gdst.pojo.Anchor;
import com.gdst.pojo.AnchorWorks;
import com.gdst.pojo.Offical_works;
import com.gdst.service.StationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jake on 2018/12/24.
 */
@Service(value = "stationService")
public class StationServiceImpl implements StationService {

    @Resource(name = "stationMapper")
    private StationMapper stationMapper;
    @Override
    public List<Offical_works> Offworks_List() {
        return stationMapper.QueryAllOffSongInfo();
    }

    @Override
    public List<AnchorWorks> Anchorworks_List() {
        return stationMapper.QueryAllAnchSongInfo();
    }

    @Override
    public AnchorWorks QueryAnchSongInfo(int id) {
        return stationMapper.QueryAnchSongInfo(id);
    }

    @Override
    public Anchor QueryAnchInfo(int id) {
        return stationMapper.QueryAnchInfo(id);
    }
}
