package baseball;

import java.util.ArrayList;
import java.util.List;

public class Play {

    public static void startGame(){
        List<Integer> playerNum = new ArrayList<Integer>();

        System.out.println("숫자 야구 게임을 시작합니다.");
        System.out.println("숫자를 입력해주세요 : ");
        User.inputNum(playerNum);
        User.exception(playerNum);
    }
    public static void run(List<Integer> playerNum){
        List<Integer> computer = new ArrayList<Integer>();
        Computer.CreateRandomNum(computer);

    }
}