package com.ford.msseed.adapter.jdbc.model;

import lombok.Builder;
import lombok.Data;
import com.ford.msseed.domain.Seed;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class SeedJdbcModel {

    String nroSeed;
    LocalDateTime fechaSeed;
    BigDecimal montoSeed;

    public Seed toDomain() {

        return Seed.builder()
                .seedAmount(montoSeed)
                .seedDate(fechaSeed)
                .seedId(nroSeed)
                .build();
    }
}
