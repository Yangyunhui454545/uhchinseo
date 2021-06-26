package com.lightningboys.uhchinseo.Repository;

import com.lightningboys.uhchinseo.Domain.AZGame;
import com.lightningboys.uhchinseo.Domain.NewWordGame;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface NewWordGameRepository extends JpaRepository<NewWordGame, Long> {

    Page<NewWordGame> findAll(Pageable pageable);

    //user table에 점수를 업데이트하는 sql문이 필요.


}
