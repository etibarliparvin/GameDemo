package abstracts;

import entity.Game;

public interface GameService {
    boolean addGame(Game game);

    boolean removeGame(Integer id);

    boolean updateGame(Game game);
}
