package com.andy.geogame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

import java.util.ArrayList;

/**
 * Created by aliu2 on 2/5/2015.
 */
public class BulletHandler {
    Texture texture;
    Rectangle rectangle;
    ArrayList<Bullet> bullets;

    public BulletHandler(Texture texture){
        this.texture = texture;
        bullets = new ArrayList<Bullet>();
    }
    public void add(float x, float y)  {

        bullets.add(new Bullet(texture, new Rectangle(x, y, rectangle.getWidth(), rectangle.getHeight())));
    }

    public void render(SpriteBatch batch) {
        for(Bullet bullet : bullets) {
            bullet.render(batch);

        }
    }

    private class Bullet {
        private Texture texture;
        private Rectangle rectangle;
        BitmapFont font;

        public Bullet(Texture texture, Rectangle rectangle) {
            this.texture = texture;
            this.rectangle = rectangle;
            font = new BitmapFont();
        }

        public void render(SpriteBatch batch) {
            font.draw(batch, "", 100, 100);g
            batch.draw(texture, rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
        }
    }
}



/*
You want this class to have a sprite: texture + rectangle (you probably want to contain these within a list)
        You then want to simply initialize the texture + rectangle
        Then in a render method, render the texture using the dimensions of the rectangle
        Within the render method, you also want to update the position of the bullets
 */


