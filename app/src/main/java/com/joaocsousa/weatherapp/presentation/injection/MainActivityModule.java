package com.joaocsousa.weatherapp.presentation.injection;

import com.joaocsousa.weatherapp.presentation.presenters.MainPresenter;
import com.joaocsousa.weatherapp.presentation.presenters.MainPresenterImpl;
import com.joaocsousa.weatherapp.presentation.views.MainMvpView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by joaosousa on 01/02/16.
 */
@Module
public class MainActivityModule {

	private MainMvpView mMainView;

	public MainActivityModule(MainMvpView mainView) {
		mMainView = mainView;
	}

	@Provides
	@ActivityScope
	MainMvpView provideMainView() {
		return mMainView;
	}

	@Provides
	@ActivityScope
	MainPresenter provideMainPresenter() {
		return new MainPresenterImpl(mMainView);
	}

}
