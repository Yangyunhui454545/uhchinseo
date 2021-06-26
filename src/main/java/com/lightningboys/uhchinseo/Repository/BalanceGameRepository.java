package com.lightningboys.uhchinseo.Repository;


import com.lightningboys.uhchinseo.Domain.AZGame;
import com.lightningboys.uhchinseo.Domain.BalanceGame;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BalanceGameRepository extends JpaRepository<BalanceGame, Long> {

    Page<BalanceGame> findAll(Pageable pageable);

    @Modifying
    @Query("update Balance_Game b set b.cnt =:balanceCount where b.id =:id")
    void updateCnt(@Param("id")Long id, @Param("balanceCount")int balanceCount);
}
