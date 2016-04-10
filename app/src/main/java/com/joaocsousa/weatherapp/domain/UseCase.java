package com.joaocsousa.weatherapp.domain;

import rx.Observable;

/**
 * Created by joaosousa on 31/01/16.
 */
public interface UseCase<T> {

	Observable<T> execute();

}
