package com.ford.msseed.application.port.out;

import org.springframework.data.domain.Page;
import com.ford.msseed.domain.Seed;

public interface SeedRepository {
    Page<Seed> getByFilters(int page, int size);
}
