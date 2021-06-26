package com.lightningboys.uhchinseo.Service;

import com.lightningboys.uhchinseo.Domain.AZGame;
import com.lightningboys.uhchinseo.Repository.AzGameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AzGameService {

    private final AzGameRepository azGameRepository;

    public Page<AZGame> findAll(int pageNum){
        return azGameRepository.findAll(PageRequest.of(pageNum-1, 3));
    }
}
