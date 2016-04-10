package com.joaocsousa.weatherapp.presentation.injection;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by joaosousa on 31/01/16.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

	MainActivityComponent plus(MainActivityModule module);

}
