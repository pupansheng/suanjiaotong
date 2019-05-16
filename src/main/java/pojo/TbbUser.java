package pojo;

public class TbbUser {
    private Integer id;

    private String tbname;

    private String tbsex;

    private String password;

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

    public String getTbsex() {
        return tbsex;
    }

    public void setTbsex(String tbsex) {
        this.tbsex = tbsex == null ? null : tbsex.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Override
    public String toString() {
        return "TbbUser{" +
                "id=" + id +
                ", tbname='" + tbname + '\'' +
                ", tbsex='" + tbsex + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}