package com.joaocsousa.weatherapp.model.api;

/**
 * Created by joaosousa on 31/01/16.
 */
public abstract class Constants {

	private Constants() {
		throw new UnsupportedOperationException("Can't build an instance of this class!");
	}

	public static final String BASE_URL = "http://api.openweathermap.org/data";

	public static final String API_VERSION = "2.5";

}
