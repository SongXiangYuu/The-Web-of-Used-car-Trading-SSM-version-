package cn.com.service;
import cn.com.pojo.*;

import java.util.*;

import org.springframework.stereotype.Repository;
@Repository
public interface ICarBrandService {
	public Map<Integer, Carbrand> getCarBrandByCount();
	public Map<Integer, Carbrand> getAllBrand();
	public Carbrand getBrandByID(Carbrand carBrand);
	public Carbrand getBrandByName(Carbrand carBrand);
}
