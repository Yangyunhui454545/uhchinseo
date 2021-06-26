package com.lightningboys.uhchinseo.Controller;

import com.lightningboys.uhchinseo.Domain.AZGame;
import com.lightningboys.uhchinseo.Domain.BalanceGame;
import com.lightningboys.uhchinseo.Service.AzGameService;
import com.lightningboys.uhchinseo.Service.BalanceGameService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class GameController {

    private final AzGameService azGameService;
    private final BalanceGameService balanceGameService;

    @ResponseBody
    @GetMapping("/azGame")
    public Page<AZGame> azGame(@RequestParam("pageNum")int pageNum){
       Page<AZGame> azGame = azGameService.findAll(pageNum);
       return azGame;
    }

    @ResponseBody
    @GetMapping("/balanceGame")
    public Page<BalanceGame> BalanceGame(@RequestParam("pageNum")int pageNum){
        Page<BalanceGame> BalanceGame = balanceGameService.findAll(pageNum);
        return BalanceGame;
    }

    @ResponseBody
    @PostMapping("balanceGame")
    public String updateCnt(@RequestBody BalanceForm balanceForm){
        Long id  = balanceForm.getId();
        int balanceCnt = balanceForm.getBalanceCnt();
        balanceGameService.updateCnt(id, balanceCnt);
        return "updateSuccess";
    }
}