package cn.com.service;

import org.springframework.stereotype.Repository;

import cn.com.pojo.*;;
@Repository
public interface IPersonNeedService {
	public boolean addPersonNeed(Personneed personNeed);
	public boolean deletePersonNeed(Personneed personNeed);
	public Personneed getPerSonNeed(Personneed personNeed);
	public boolean updatePersonNeed(Personneed personNeed);
	public boolean chekUidPerson(Personneed personneed);
	public boolean deleteUidPerson(Personneed personneed);
}
