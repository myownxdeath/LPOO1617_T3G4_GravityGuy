package Controller.Entities;


import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;

import Game.GravityGuy;
import Models.Entities.PlayerModel;

public class PlayerBody extends EntityBody {
    PlayerModel model;

    public PlayerBody(World world, PlayerModel model) {
        super(world, model);
        this.model = model;
        createFixture();
        body.setSleepingAllowed(false);
    }

    @Override
    protected BodyDef createBodyDef() {
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        return bodyDef;
    }

    @Override
    protected void createFixture() {
        FixtureDef fixtureDef = new FixtureDef();
        CircleShape shape = new CircleShape();

        shape.setRadius(9 / GravityGuy.PPM);

        fixtureDef.shape = shape;
        fixtureDef.restitution = 0;
        body.createFixture(fixtureDef);
    }

}
