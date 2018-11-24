package ru.eskendarov;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class HomeWork extends ApplicationAdapter {
    SpriteBatch batch;
    Texture getImg1;
    Texture getImg2;
    TextureRegion region;

    @Override
    public void create() {
        batch = new SpriteBatch();
        getImg1 = new Texture("logo.png");
        getImg2 = new Texture("texture.png");
        region = new TextureRegion(getImg1, 50, 50);
        region.flip(true,false);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0.1f, 0.8f, 0.4f, 0.2f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(region, 0, 0);
        batch.draw(getImg1, 50, 50);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        getImg1.dispose();
        getImg2.dispose();
    }
}
