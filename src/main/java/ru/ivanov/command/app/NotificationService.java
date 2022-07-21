package ru.ivanov.command.app;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import ru.ivanov.command.app.notification.Notification;

@Service
@Slf4j
public class NotificationService {
  private final Map<NotificationType, Notification> notificationMap;

  public NotificationService(List<Notification> list) {
    this.notificationMap = list.stream().collect(Collectors.toMap(Notification::getType, Function.identity()));
  }

  //{ NotificationType.EMAIL, EmailNotification }
  //{ NotificationType.SMS, SmsNotification }
  //{ NotificationType.TELEGRAM, TelegramNotification }

  public void send(NotificationInfo info) {
    Notification notification = notificationMap.get(info.getType());
    notification.send(info);
  }

}
