package com.gsonkeno.disruptor;


public class LogEvent {
    private String msg;

    public void setMsg(String msg){
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
