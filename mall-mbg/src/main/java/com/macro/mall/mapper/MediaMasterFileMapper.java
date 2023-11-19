package com.macro.mall.mapper;

import com.macro.mall.model.MediaMasterFile;
import com.macro.mall.model.MediaMasterFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MediaMasterFileMapper {
    long countByExample(MediaMasterFileExample example);

    int deleteByExample(MediaMasterFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MediaMasterFile row);

    int insertSelective(MediaMasterFile row);

    List<MediaMasterFile> selectByExample(MediaMasterFileExample example);

    MediaMasterFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") MediaMasterFile row, @Param("example") MediaMasterFileExample example);

    int updateByExample(@Param("row") MediaMasterFile row, @Param("example") MediaMasterFileExample example);

    int updateByPrimaryKeySelective(MediaMasterFile row);

    int updateByPrimaryKey(MediaMasterFile row);
}