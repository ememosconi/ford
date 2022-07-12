package com.ford.msseed.application.port.in;

import lombok.Builder;
import lombok.Value;
import com.ford.msseed.domain.Seed;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface CreateSeedCommand {

    Seed createSeed(Command command);

    @Value
    @Builder
    class Command {
        BigDecimal amount;
        LocalDateTime date;
    }
}

