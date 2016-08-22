package cn.com.dao.impl;


import java.util.*;

import org.springframework.stereotype.Repository;

import cn.com.pojo.*;
import cn.com.dao.*;

@Repository
public class PriceIntervalDaoImpl extends BaseDao implements IPriceIntervalDao{

	@Override
	public Map<Integer, Priceinterval> getPriceIntervalByCount() {
		// TODO Auto-generated method stub
		Map<Integer, Priceinterval> priceIntervalMap=new HashMap<Integer, Priceinterval>();
	
	    try{
	    	priceIntervalMap=super.getSqlSessionTemplate().selectMap("cn.com.pojo.PriceintervalMapper.getPriceIntervalByCount", "pId");
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return priceIntervalMap;
	}

}
