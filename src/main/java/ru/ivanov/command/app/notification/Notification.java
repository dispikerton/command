package ru.ivanov.command.app.notification;

import ru.ivanov.command.app.NotificationInfo;
import ru.ivanov.command.app.NotificationType;

public interface Notification {
  void send(NotificationInfo info);

  NotificationType getType();
}
