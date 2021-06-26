package com.lightningboys.uhchinseo.Repository;


import com.lightningboys.uhchinseo.Domain.AZGame;
import com.lightningboys.uhchinseo.Domain.BalanceGame;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceGameRepository extends JpaRepository<BalanceGame, Long> {

    Page<BalanceGame> findAll(Pageable pageable);

}
