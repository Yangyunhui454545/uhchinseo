package com.lightningboys.uhchinseo.Controller;

import com.lightningboys.uhchinseo.Domain.AZGame;
import com.lightningboys.uhchinseo.Domain.BalanceGame;
import com.lightningboys.uhchinseo.Domain.NewWordGame;
import com.lightningboys.uhchinseo.Domain.User;
import com.lightningboys.uhchinseo.Service.AzGameService;
import com.lightningboys.uhchinseo.Service.BalanceGameService;
import com.lightningboys.uhchinseo.Service.NewWordGameService;
import com.lightningboys.uhchinseo.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class GameController {

    private final AzGameService azGameService;
    private final BalanceGameService balanceGameService;
    private final NewWordGameService newWordGameService;
    private final UserService userService;

    @ResponseBody
    @GetMapping("/azGame")
    public List<AZGame> azGame(@RequestParam("pageNum")int pageNum){
       Page<AZGame> azGame = azGameService.findAll(pageNum);
       List<AZGame> azGameList = new ArrayList<>();
       for(AZGame game : azGame){
           azGameList.add(game);
       }
       return azGameList;
    }

    @ResponseBody
    @GetMapping("/balanceGame")
    public List<BalanceGame> BalanceGame(@RequestParam("pageNum")int pageNum){
        Page<BalanceGame> BalanceGame = balanceGameService.findAll(pageNum);
        List<BalanceGame> balanceGameList = new ArrayList<>();
        for(BalanceGame balanceGame : BalanceGame){
            balanceGameList.add(balanceGame);
        }
        return balanceGameList;
    }

    @ResponseBody
    @PostMapping("balanceGame")
    public String updateCnt(@RequestBody BalanceForm balanceForm){
        Long id  = balanceForm.getId();
        int balanceCnt = balanceForm.getBalanceCnt();
        balanceGameService.updateCnt(id, balanceCnt);
        return "updateSuccess";
    }

    @ResponseBody
    @GetMapping("/newWordGame")
    public Page<NewWordGame> NewWordGame(@RequestParam("pageNum")int pageNum){
        Page<NewWordGame> newWordGame = newWordGameService.findAll(pageNum);
        return newWordGame;
    }

    @ResponseBody
    @PostMapping("newWordGame")
    public String totalScore(@RequestBody NewWordForm newwordForm ){

        Long id = newwordForm.getId();
        Optional<User> user = userService.findById(id);
        int score  = user.get().getScore();
        int totalScore = newwordForm.getTotalScore();
        userService.updateScore(id,totalScore + score);
        return "score updated success";
    }

    //postmapping 으로 업데이트
    //requestbody 사용해서 데이터 데려오기
}