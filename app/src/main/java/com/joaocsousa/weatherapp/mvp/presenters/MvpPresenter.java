package com.joaocsousa.weatherapp.mvp.presenters;

import com.joaocsousa.weatherapp.mvp.views.MvpView;

/**
 * Created by joaosousa on 31/01/16.
 */
public interface MvpPresenter<V extends MvpView> {

	V getView();

	void initialize(V mvpView);

	void destroy();

}
