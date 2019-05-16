package service;

import pojo.Group;
import pojo.Msg;
import pojo.TbGrade;
import pojo.TbbUser;

import java.util.List;

public interface GradeService {
    public List<TbGrade> getMyAll(TbbUser tbbUser);
    //利用关联查询
    public Group getMyAll(int userid);

    public Msg deleteById(int id);
    public TbGrade getOneById(int id);
    public Msg update(TbGrade tbGrade);
    public Msg add(TbGrade tbGrade);


}
