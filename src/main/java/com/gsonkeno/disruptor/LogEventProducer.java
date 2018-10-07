package com.gsonkeno.disruptor;

import com.lmax.disruptor.EventTranslatorOneArg;
import com.lmax.disruptor.RingBuffer;

public class LogEventProducer {
    private final RingBuffer<LogEvent> ringBuffer;

    public LogEventProducer(RingBuffer<LogEvent> ringBuffer) {
        this.ringBuffer = ringBuffer;
    }

    private static final EventTranslatorOneArg<LogEvent, String> TRANSLATOR = new EventTranslatorOneArg<LogEvent, String>() {
        @Override
        public void translateTo(LogEvent event, long l, String s) {
            event.setMsg(s);
        }
    };


    public void onData(String msg){
        ringBuffer.publishEvent(TRANSLATOR, msg);
    }
}
