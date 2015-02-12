package com.andy.geogame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by aliu2 on 2/5/2015.
 */
public class Bullet {
    Texture texture;

    public Bullet(Texture texture){
        this.texture = texture;
    }
    public void create(){
        texture = new Texture("Bullet.class");
    }
}



/*
You want this class to have a sprite: texture + rectangle (you probably want to contain these within a list)
        You then want to simply initialize the texture + rectangle
        Then in a render method, render the texture using the dimensions of the rectangle
        Within the render method, you also want to update the position of the bullets
 */


