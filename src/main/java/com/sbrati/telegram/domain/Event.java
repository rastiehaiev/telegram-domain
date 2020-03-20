package com.sbrati.telegram.domain;

import lombok.Data;

@Data
public class Event<T> {

    private Long chatId;
    private Long timestamp;
    private T payload;

    public <P> Event<P> with(P payload) {
        Event<P> newEvent = new Event<P>();
        newEvent.setChatId(chatId);
        newEvent.setTimestamp(timestamp);
        newEvent.setPayload(payload);
        return newEvent;
    }
}
