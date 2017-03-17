package com.gina.gdx.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.gina.gdx.MyGdxGina;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
            GwtApplicationConfiguration config = new GwtApplicationConfiguration(1000, 800);
            return config;
        }

        @Override
        public ApplicationListener createApplicationListener () {
                return new MyGdxGina();
        }
}