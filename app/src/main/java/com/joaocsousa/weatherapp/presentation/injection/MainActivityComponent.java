package com.joaocsousa.weatherapp.presentation.injection;

import com.joaocsousa.weatherapp.presentation.views.MainMvpView;

import dagger.Subcomponent;

/**
 * Created by joaosousa on 01/02/16.
 */
@ActivityScope
@Subcomponent(modules = {MainActivityModule.class})
public interface MainActivityComponent {

	MainMvpView inject(MainMvpView mainView);

}