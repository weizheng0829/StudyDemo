package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：weizheng
 * @date ：Created in 2020/6/30 16:48
 * @description：
 * @modified By：
 * @version: $
 */
public class ResultVO {


    private int code;
    private StringBuilder result;
    private String time;
    private String msg;

    public void setResult(StringBuilder result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultVO() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public StringBuilder getResult() {
        return result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(Date time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss");
        this.time = sdf.format(time);
    }

}
