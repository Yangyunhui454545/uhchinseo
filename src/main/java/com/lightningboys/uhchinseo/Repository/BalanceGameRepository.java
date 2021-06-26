package com.lightningboys.uhchinseo.Repository;


import com.lightningboys.uhchinseo.Domain.AZGame;
import com.lightningboys.uhchinseo.Domain.BalanceGame;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BalanceGameRepository extends JpaRepository<BalanceGame, Long> {

    Page<BalanceGame> findAll(Pageable pageable);

    @Query("update Balance_Game b set  b.cnt =:balanceCount where b.category =:balanceCategory and b.question =:question")
    void updateCnt(int balanceCategory, String question, int balanceCount);
}
