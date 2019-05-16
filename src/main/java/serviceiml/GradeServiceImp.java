package serviceiml;

import mapper.GroupMapper;
import mapper.TbGradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.*;
import service.GradeService;

import java.util.List;

/**
 * @Classname GradeServiceImp
 * @Description
 * @@Author
 * @Date 2019/5/13 22:10
 * @Vestion 1.0
 **/
@Service
public class GradeServiceImp implements GradeService {

    @Autowired
  private TbGradeMapper tbGradeMapper;
    @Autowired
    private GroupMapper groupMapper;
    public List<TbGrade> getMyAll(TbbUser tbbUser) {

        TbGradeExample exam=new TbGradeExample();
        TbGradeExample.Criteria criteria = exam.createCriteria();
        criteria.andUseridEqualTo(tbbUser.getId());
        List<TbGrade> tbGrades = tbGradeMapper.selectByExample(exam);

        return tbGrades;
    }

    public Group getMyAll(int userid) {


        return groupMapper.getUserGrade(userid);
    }

    public Msg deleteById(int id) {
       Msg m=new Msg();
       try {
           tbGradeMapper.deleteByPrimaryKey(id);
           m.setResult(true);
       }
       catch (Exception e){

           m.setMessage(e.getMessage());
           m.setResult(false);
       }
       return  m;
    }

    public TbGrade getOneById(int id) {
        return tbGradeMapper.selectByPrimaryKey(id);
    }

    public Msg update(TbGrade tbGrade) {
        Msg m=new Msg();
       try {
           tbGradeMapper.updateByPrimaryKeySelective(tbGrade);
           m.setResult(true);
       }
       catch (Exception e)
       {
           m.setResult(false);
       }
       return  m;
    }

    public Msg add(TbGrade tbGrade) {
        Msg m=new Msg();
        try {
            tbGradeMapper.insert(tbGrade);
            m.setResult(true);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            m.setResult(false);
        }
        return  m;
    }
}
