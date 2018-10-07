package com.gsonkeno.disruptor;


import com.lmax.disruptor.EventHandler;

/**
 * 消费者
 * @author gaosong
 * @since 2018-10-08
 */
public class LogEventConsumer implements EventHandler<LogEvent> {

    @Override
    public void onEvent(LogEvent event, long l, boolean b) throws Exception {
        System.out.println(Thread.currentThread().getName() + " | Event : " + event);
    }
}
