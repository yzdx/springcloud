package com.example.micprovider.news.dao;


import com.example.micprovider.news.entities.News;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@Mapper
@FeignClient(name= "mic-provider")
public interface NewsMapper {

    /**
     *  获取全部消息
     * @return
     */
    List<News> getAll();
}
