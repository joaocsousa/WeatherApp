package com.joaocsousa.weatherapp.presentation.injection;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by joaosousa on 31/01/16.
 */
@Module
public class ApplicationModule {

	private Application mApplication;

	public ApplicationModule(Application application) {
		mApplication = application;
	}

	@Provides
	@Singleton
	public Application provideApplication() {
		return mApplication;
	}

}
