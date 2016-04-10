package com.joaocsousa.weatherapp.mvp.presenters;

import com.joaocsousa.weatherapp.mvp.views.MvpView;

/**
 * Created by joaosousa on 31/01/16.
 */
public abstract class BaseMvpPresenter<V extends MvpView> implements MvpPresenter<V> {

	private V mView;

	@Override
	public V getView() {
		return mView;
	}

	@Override
	public void initialize(V view) {
		mView = view;
	}

	@Override
	public void destroy() {

	}
}
