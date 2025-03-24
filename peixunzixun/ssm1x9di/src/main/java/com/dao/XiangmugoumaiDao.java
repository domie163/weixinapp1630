package com.dao;

import com.entity.XiangmugoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmugoumaiVO;
import com.entity.view.XiangmugoumaiView;


/**
 * 项目购买
 * 
 * @author 
 * @email 
 * @date 2021-05-02 01:18:52
 */
public interface XiangmugoumaiDao extends BaseMapper<XiangmugoumaiEntity> {
	
	List<XiangmugoumaiVO> selectListVO(@Param("ew") Wrapper<XiangmugoumaiEntity> wrapper);
	
	XiangmugoumaiVO selectVO(@Param("ew") Wrapper<XiangmugoumaiEntity> wrapper);
	
	List<XiangmugoumaiView> selectListView(@Param("ew") Wrapper<XiangmugoumaiEntity> wrapper);

	List<XiangmugoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmugoumaiEntity> wrapper);
	
	XiangmugoumaiView selectView(@Param("ew") Wrapper<XiangmugoumaiEntity> wrapper);
	
}
