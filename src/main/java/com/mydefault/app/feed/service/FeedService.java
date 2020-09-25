package com.mydefault.app.feed.service;

import java.util.List;

import com.mydefault.app.feed.serviceimpl.FeedMapper;
import com.mydefault.app.generic.service.GenericService;

public interface FeedService extends GenericService<FeedVO,FeedMapper>{
	public List<FeedVO> listNew(FeedVO entity);
}
