package com.lightningboys.uhchinseo.Repository;

import com.lightningboys.uhchinseo.Domain.AZGame;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AzGameRepository extends JpaRepository<AZGame, Long> {

    Page<AZGame> findAll(Pageable pageable);

}
