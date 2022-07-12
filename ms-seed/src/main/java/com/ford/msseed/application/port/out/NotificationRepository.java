package com.ford.msseed.application.port.out;

import com.ford.msseed.domain.Seed;

import java.util.UUID;

public interface NotificationRepository {

    void notify(Seed seed, UUID notificationId);
}
