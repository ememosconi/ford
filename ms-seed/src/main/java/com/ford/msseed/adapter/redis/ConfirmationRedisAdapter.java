package com.ford.msseed.adapter.redis;

import com.ford.msseed.application.exception.NotFoundException;
import com.ford.msseed.application.port.out.ConfirmationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.ford.msseed.adapter.redis.model.ConfirmationSeedModel;
import com.ford.msseed.domain.Seed;

import java.util.UUID;

@Component
@Slf4j
public class ConfirmationRedisAdapter implements ConfirmationRepository {

    private final ConfirmationSeedRedisRepository confirmationSeedRedisRepository;

    public ConfirmationRedisAdapter(ConfirmationSeedRedisRepository confirmationSeedRedisRepository) {
        this.confirmationSeedRedisRepository = confirmationSeedRedisRepository;
    }

    @Override
    public void save(Seed seed, UUID uuid) {
        ConfirmationSeedModel confirmationUserModel = ConfirmationSeedModel.fromDomain(seed, uuid);
        log.info("Guardando en redis el objeto de confirmacion de usuario {}", confirmationUserModel);
        confirmationSeedRedisRepository.save(confirmationUserModel);
    }

    @Override
    public Seed findById(String id) {
        ConfirmationSeedModel confirmationSeedModel = confirmationSeedRedisRepository
                .findById(UUID.fromString(id))
                .orElseThrow(() -> new NotFoundException("No se encontrĂ³ el usuario con id " + id));
        return ConfirmationSeedModel.toDomain(confirmationSeedModel);
    }
}
