package Models;


import Models.Entities.PlayerModel;

public class GameModel {

    private static GameModel gameModel = null;
    private PlayerModel player;

    private GameModel(){
        player = new PlayerModel(32, 32);
    }

    public static GameModel instance(){
        if(gameModel == null)
            gameModel = new GameModel();
        return gameModel;
    }

    public static GameModel reset(){
        gameModel = new GameModel();
        return gameModel;
    }


    public PlayerModel getPlayer() {
        return player;
    }

    public void update(float delta){

    }

}
