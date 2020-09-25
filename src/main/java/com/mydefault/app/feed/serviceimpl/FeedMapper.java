package com.mydefault.app.feed.serviceimpl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mydefault.app.feed.service.FeedVO;
import com.mydefault.app.generic.serviceimpl.GenericMapper;

@Mapper
public interface FeedMapper extends GenericMapper<FeedVO>{
	public List<FeedVO> listNew(FeedVO entity);
}
