package com.mydefault.app.interest.service;

import java.util.List;

import com.mydefault.app.generic.service.GenericService;
import com.mydefault.app.interest.serviceimpl.InterestMapper;

public interface InterestService extends GenericService<InterestVO,InterestMapper>{
	public List<InterestVO> listAll();
}
