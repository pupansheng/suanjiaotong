package pojo;

import java.util.List;

/**
 * @Classname Group
 * @Description  封装关联查询数据
 * @@Author
 * @Date 2019/5/14 15:43
 * @Vestion 1.0
 **/
public class Group  extends  TbbUser{


    List<TbGrade> grades;


    public List<TbGrade> getGrades() {
        return grades;
    }
    public void setGrades(List<TbGrade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {

        return  super.toString()+"Group{" +
                "grades=" + grades +
                '}';
    }
}
