package com.joaocsousa.weatherapp.presentation.presenters;

import com.joaocsousa.weatherapp.mvp.presenters.BaseMvpPresenter;
import com.joaocsousa.weatherapp.presentation.views.MainMvpView;

import javax.inject.Inject;

/**
 * Created by joaosousa on 31/01/16.
 */
public class MainPresenterImpl extends BaseMvpPresenter<MainMvpView> implements MainPresenter {

	private MainMvpView mView;

	@Inject
	public MainPresenterImpl(MainMvpView view) {
		mView = view;
	}

	@Override
	public void onChangeLocationClicked() {
		getView().openChangeLocationScreen();
	}

}
