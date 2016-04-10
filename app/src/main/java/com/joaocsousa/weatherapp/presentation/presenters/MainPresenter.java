package com.joaocsousa.weatherapp.presentation.presenters;

import com.joaocsousa.weatherapp.mvp.presenters.MvpPresenter;
import com.joaocsousa.weatherapp.presentation.views.MainMvpView;

/**
 * Created by joaosousa on 31/01/16.
 */
public interface MainPresenter extends MvpPresenter<MainMvpView> {

	void onChangeLocationClicked();

}
