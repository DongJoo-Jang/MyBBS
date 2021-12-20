package com.dongjoo.bbs.model.service;

import java.util.List;

import com.dongjoo.bbs.vo.MyBBS_VO;

public interface IMyBBSService {

	public int insert(MyBBS_VO vo);
	
	public List<MyBBS_VO> selectAll() ;
}
