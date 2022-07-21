package ru.ivanov.command.app.notification;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import ru.ivanov.command.app.NotificationInfo;
import ru.ivanov.command.app.NotificationType;

@Component
@Slf4j
public class TelegramNotification implements Notification {
  @Override
  public void send(NotificationInfo info) {
    log.info("Отправляем {} в телеграм", info.getMessage());
    log.info("1");
    log.info("1");
    log.info("1");
    log.info("1");
    log.info("1");
    log.info("1");
    log.info("1");
    log.info("1");
    log.info("1");
    log.info("1");
  }

  @Override
  public NotificationType getType() {
    return NotificationType.TELEGRAM;
  }
}
