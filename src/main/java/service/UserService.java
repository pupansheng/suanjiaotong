package service;

import pojo.Group;
import pojo.Msg;
import pojo.TbbUser;

import java.util.List;

public interface UserService {
    public List<TbbUser> getAll();
    public Msg deleteById(int id);
    public TbbUser getOneById(int id);
    public Msg add(TbbUser tbbUser);
    public Msg update(TbbUser tbbUser);
    //获得用户相关的课程 一对多查询
    public Group getUserGrade(int id);
}
