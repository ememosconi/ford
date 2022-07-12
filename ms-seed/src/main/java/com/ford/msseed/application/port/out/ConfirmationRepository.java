package com.ford.msseed.application.port.out;

import com.ford.msseed.domain.Seed;

import java.util.UUID;

public interface ConfirmationRepository {

    void save(Seed seed, UUID uuid);

    Seed findById(String id);
}
