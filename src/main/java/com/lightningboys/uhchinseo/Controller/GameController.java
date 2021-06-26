package com.lightningboys.uhchinseo.Controller;

import com.lightningboys.uhchinseo.Domain.AZGame;
import com.lightningboys.uhchinseo.Domain.BalanceGame;
import com.lightningboys.uhchinseo.Service.AzGameService;
import com.lightningboys.uhchinseo.Service.BalanceGameService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class GameController {

    private final AzGameService azGameService;
    private final BalanceGameService balanceGameService;

    @ResponseBody
    @GetMapping("/azGame")
    public Page<AZGame> azGame(HttpServletRequest request, @RequestParam("pageNum")int pageNum, Model model){
       Page<AZGame> azGame = azGameService.findAll(pageNum);
       return azGame;
    }

    @ResponseBody
    @GetMapping("/balanceGame")
    public Page<BalanceGame> BalanceGame(HttpServletRequest request, @RequestParam("pageNum")int pageNum, Model model){
        Page<BalanceGame> BalanceGame = balanceGameService.findAll(pageNum);
        return BalanceGame;
    }


}