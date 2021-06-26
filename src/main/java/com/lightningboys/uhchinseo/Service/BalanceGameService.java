package com.lightningboys.uhchinseo.Service;

import com.lightningboys.uhchinseo.Domain.AZGame;
import com.lightningboys.uhchinseo.Domain.BalanceGame;
import com.lightningboys.uhchinseo.Repository.AzGameRepository;
import com.lightningboys.uhchinseo.Repository.BalanceGameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BalanceGameService {

    private final BalanceGameRepository balanceGameRepository;

    public Page<BalanceGame> findAll(int pageNum){
        return balanceGameRepository.findAll(PageRequest.of(pageNum-1, 2));
    }
    @Transactional
    public void updateCnt(Long id, int balanceCount) {
        balanceGameRepository.updateCnt(id, balanceCount + 1);

    }
}
