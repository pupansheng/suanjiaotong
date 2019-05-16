package pojo;

/**
 * @Classname Msg
 * @Description
 * @@Author
 * @Date 2019/5/13 21:43
 * @Vestion 1.0
 **/
public class Msg {
    private  String message;
    private  boolean result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Msg() {

    }

    public Msg(String message, boolean result) {
        this.message = message;
        this.result = result;
    }
}
