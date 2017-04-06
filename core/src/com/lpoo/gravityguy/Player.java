package com.lpoo.gravityguy;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;

public class Player {
    private BodyDef def;
    private Body body;

    public Player(World world){
        if(world == null)
            throw new IllegalArgumentException();
        def = new BodyDef();
        def.type = BodyDef.BodyType.DynamicBody;
        body = world.createBody(def);
    }

}