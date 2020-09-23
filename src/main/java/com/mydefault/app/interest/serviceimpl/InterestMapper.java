package com.mydefault.app.interest.serviceimpl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mydefault.app.generic.serviceimpl.GenericMapper;
import com.mydefault.app.interest.service.InterestVO;

@Mapper
public interface InterestMapper extends GenericMapper<InterestVO>{
	public List<InterestVO> listAll();
}
