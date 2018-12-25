package com.gdst.dao;

import com.gdst.pojo.Anchor;
import com.gdst.pojo.AnchorWorks;
import com.gdst.pojo.Offical_works;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jake on 2018/12/24.
 */
@Repository(value = "stationMapper")
public interface StationMapper {
   public List<Offical_works>  QueryAllOffSongInfo();

   public List<AnchorWorks> QueryAllAnchSongInfo();


   public AnchorWorks  QueryAnchSongInfo(@Param(value = "id") int anchor_worksId);
   public Anchor QueryAnchInfo(@Param(value = "anchor_id") int anchor_id);

}
