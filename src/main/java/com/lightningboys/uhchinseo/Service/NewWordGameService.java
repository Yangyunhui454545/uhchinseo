package com.lightningboys.uhchinseo.Service;

import com.lightningboys.uhchinseo.Domain.AZGame;
import com.lightningboys.uhchinseo.Domain.NewWordGame;
import com.lightningboys.uhchinseo.Repository.AzGameRepository;
import com.lightningboys.uhchinseo.Repository.NewWordGameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class NewWordGameService {

    private final NewWordGameRepository newwordGameRepository;

    public Page<NewWordGame> findAll(int pageNum){
        return newwordGameRepository.findAll(PageRequest.of(pageNum-1, 3));
    }

    //score 변경하는거 구현 더하는 로직 구현(누적)



}
