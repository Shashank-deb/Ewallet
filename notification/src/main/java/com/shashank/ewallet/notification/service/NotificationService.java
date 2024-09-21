package com.shashank.ewallet.notification.service;

import com.shashank.ewallet.notification.service.resource.NotificationRequest;

public interface NotificationService {

    public void sendCommunication(NotificationRequest notificationRequest);
}
