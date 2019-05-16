package pojo;

public class TbGrade {
    private Integer id;

    private String tbname;

    private Double tbscore;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTbname() {
        return tbname;
    }

    public void setTbname(String tbname) {
        this.tbname = tbname == null ? null : tbname.trim();
    }

    public Double getTbscore() {
        return tbscore;
    }

    public void setTbscore(Double tbscore) {
        this.tbscore = tbscore;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "TbGrade{" +
                "id=" + id +
                ", tbname='" + tbname + '\'' +
                ", tbscore=" + tbscore +
                ", userid=" + userid +
                '}';
    }
}