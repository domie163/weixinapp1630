package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiangmugoumaiDao;
import com.entity.XiangmugoumaiEntity;
import com.service.XiangmugoumaiService;
import com.entity.vo.XiangmugoumaiVO;
import com.entity.view.XiangmugoumaiView;

@Service("xiangmugoumaiService")
public class XiangmugoumaiServiceImpl extends ServiceImpl<XiangmugoumaiDao, XiangmugoumaiEntity> implements XiangmugoumaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmugoumaiEntity> page = this.selectPage(
                new Query<XiangmugoumaiEntity>(params).getPage(),
                new EntityWrapper<XiangmugoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmugoumaiEntity> wrapper) {
		  Page<XiangmugoumaiView> page =new Query<XiangmugoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmugoumaiVO> selectListVO(Wrapper<XiangmugoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmugoumaiVO selectVO(Wrapper<XiangmugoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmugoumaiView> selectListView(Wrapper<XiangmugoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmugoumaiView selectView(Wrapper<XiangmugoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
