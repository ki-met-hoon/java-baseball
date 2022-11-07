package baseball;

import baseball.domain.Game;
import baseball.domain.User;
import baseball.utils.Parser;
import baseball.utils.RandomUtils;
import baseball.view.SystemMessage;
import baseball.view.RequestInput;
import camp.nextstep.edu.missionutils.Console;

public class GameService {
    int size;
    Game game;
    User user = new User();
    SystemMessage systemMessage = new SystemMessage();

    public void setGame(int size, int start, int end) {
        this.size = size;
        game = new Game(RandomUtils.getRandomNumbers(size, start, end));
    }

    private int[] getUserNumber() {
        RequestInput.requestInputData();
        String input = Console.readLine();
        return Parser.parseUserInput(input, size);
    }

    private void computeScore() {
        for (int i = 0; i < size; i++) {
            compute(game.getGameNumbers(), user.getUserNumbers(), i);
        }
    }

    private void compute(int[] gameNumber, int[] userNumber, int index) {
        int temp = -1;
        for (int i = 0; i < gameNumber.length; i++) {
            if (gameNumber[i] == userNumber[index]) {
                temp = i;
                break;
            }
        }
    }
}
