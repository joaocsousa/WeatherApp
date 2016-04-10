package com.joaocsousa.weatherapp.domain;

import rx.Observable;

public interface UseCase<T> {

	Observable<T> execute();

}
