package com.gdst.dao;

import com.gdst.pojo.Offical_works;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jake on 2018/12/24.
 */
@Repository(value = "stationMapper")
public interface StationMapper {
   public List<Offical_works>  QueryAllOffSongInfo();


}
