package cn.com.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.com.pojo.*;
@Repository
public interface ICommentDao {
          public int addComment(Comment1 comment);
          public int deleteComment(Comment1 comment);
          public Comment1 getComment(Comment1 comment);
          public Map<Long, Comment1> getTheTowComment(Comment1  comment,int min,int max);
        
}
