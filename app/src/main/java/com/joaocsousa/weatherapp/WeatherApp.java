package com.joaocsousa.weatherapp;

import android.app.Application;

import com.joaocsousa.weatherapp.presentation.injection.ApplicationComponent;
import com.joaocsousa.weatherapp.presentation.injection.ApplicationModule;
import com.joaocsousa.weatherapp.presentation.injection.DaggerApplicationComponent;

/**
 * Created by joaosousa on 31/01/16.
 */
public class WeatherApp extends Application {

	private static WeatherApp sWeatherApp;
	private ApplicationComponent mApplicationComponent;

	public static WeatherApp app() {
		return sWeatherApp;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		sWeatherApp = this;
		mApplicationComponent = DaggerApplicationComponent.builder()
			.applicationModule(new ApplicationModule(this))
			.build();
	}

	public ApplicationComponent getApplicationComponent() {
		return mApplicationComponent;
	}

}
