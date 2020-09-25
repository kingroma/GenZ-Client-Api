package com.mydefault.app.feed.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mydefault.app.feed.service.FeedService;
import com.mydefault.app.feed.service.FeedVO;
import com.mydefault.app.generic.serviceimpl.GenericServiceImpl;

@Service
public class FeedServiceImpl extends GenericServiceImpl<FeedVO,FeedMapper> implements FeedService {
	protected static final Logger logger = LoggerFactory.getLogger(FeedServiceImpl.class);
	
	public FeedServiceImpl() {
		super(FeedMapper.class);
	}
	
	public List<FeedVO> listNew(FeedVO entity){
		if ( entity != null ) { 
			return mapper.listNew(entity);
		}
		return null ; 
	}
}
