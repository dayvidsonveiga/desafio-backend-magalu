package br.com.magalums.controller.dto;

import br.com.magalums.entity.Channel;
import br.com.magalums.entity.Notification;
import br.com.magalums.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDto(LocalDateTime dateTime,
                                      String destination,
                                      String message,
                                      Channel.Values channel) {

    public Notification toNotification() {
        return new Notification(
            dateTime,
            destination,
            message,
            channel.toChannel(),
            Status.Values.PENDING.toStatus()
        );
    }
}
