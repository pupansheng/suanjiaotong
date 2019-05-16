package pojo;

/**
 * @Classname TbAdmin
 * @Description
 * @@Author
 * @Date 2019/5/14 14:50
 * @Vestion 1.0
 **/
public class TbAdmin {

    private int id;
    private String tbname;
    private  String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTbname() {
        return tbname;
    }

    public void setTbname(String tbname) {
        this.tbname = tbname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
