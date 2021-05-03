package concrete;

import abstracts.GameService;
import entity.Game;

public class GameManager implements GameService {
    @Override
    public boolean addGame(Game game) {
        System.out.println("Game has been added : " + game.getName());
        return true;
    }

    @Override
    public boolean removeGame(Integer id) {
        if(id != null){
            System.out.println("Game has been removed.");
            return true;
        }
        return false;
    }

    @Override
    public boolean updateGame(Game game) {
        System.out.println("Game has been updated : " + game.getName());
        return true;
    }
}
