package ru.ivanov.command.app;

import lombok.Data;

@Data
public class NotificationInfo {
  private long id;
  private long userId;
  private String message;
  private NotificationType type;
}
