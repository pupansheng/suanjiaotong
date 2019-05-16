package serviceiml;

import mapper.TbAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.TbAdmin;
import service.AdminService;

/**
 * @Classname AdminServiceImp
 * @Description
 * @@Author
 * @Date 2019/5/14 15:02
 * @Vestion 1.0
 **/
@Service
public class AdminServiceImp implements AdminService {
    @Autowired
    private TbAdminMapper tbAdminMapper;
    public TbAdmin login(TbAdmin admin) {
        return tbAdminMapper.login(admin);
    }
}
