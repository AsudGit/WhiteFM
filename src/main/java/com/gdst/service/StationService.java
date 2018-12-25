package com.gdst.service;

import com.gdst.pojo.Anchor;
import com.gdst.pojo.AnchorWorks;
import com.gdst.pojo.Offical_works;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by jake on 2018/12/24.
 */

public interface StationService {
    public List<Offical_works> Offworks_List();

    public List<AnchorWorks> Anchorworks_List();

    public AnchorWorks QueryAnchSongInfo( int id);

    public Anchor QueryAnchInfo(int id);

}