package serviceiml;

import mapper.GroupMapper;
import mapper.TbbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Group;
import pojo.Msg;
import pojo.TbbUser;
import pojo.TbbUserExample;
import service.UserService;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @Classname UserServiceImp
 * @Description
 * @@Author
 * @Date 2019/5/13 21:36
 * @Vestion 1.0
 **/
@Service
public class UserServiceImp  implements UserService{
    @Autowired
    private TbbUserMapper tbbUserMapper;
    @Autowired
    private GroupMapper groupMapper;


    public List<TbbUser> getAll() {
        return tbbUserMapper.selectByExample(null);
    }

    public Msg deleteById(int id) {

        Msg msg=new Msg();

        try{
            tbbUserMapper.deleteByPrimaryKey(id);
            msg.setResult(true);
        }
        catch (Exception e){
            msg.setMessage("此用户还存在存课程，所以无法删除，请先删除此用户的课程");
            msg.setResult(false);
        }

        return  msg;
    }

    public TbbUser getOneById(int id) {
        return tbbUserMapper.selectByPrimaryKey(id);
    }

    public Msg add(TbbUser tbbUser) {
        Msg msg=new Msg();

        try{
            tbbUserMapper.insert(tbbUser);
            msg.setResult(true);
        }
        catch (Exception e){
            msg.setMessage(e.getMessage());
            msg.setResult(false);
        }

        return  msg;
}

    public Msg update(TbbUser tbbUser) {
        Msg msg=new Msg();

        try{
            tbbUserMapper.updateByPrimaryKeySelective(tbbUser);
            msg.setResult(true);
        }
        catch (Exception e){
            msg.setMessage(e.getMessage());
            msg.setResult(false);
        }

        return  msg;
    }

    public Group getUserGrade(int id) {
        return groupMapper.getUserGrade(id);
    }


}
