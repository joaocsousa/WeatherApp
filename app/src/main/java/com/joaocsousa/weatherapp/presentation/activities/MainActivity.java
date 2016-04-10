package com.joaocsousa.weatherapp.presentation.activities;

import android.os.Bundle;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.joaocsousa.weatherapp.R;
import com.joaocsousa.weatherapp.WeatherApp;
import com.joaocsousa.weatherapp.presentation.injection.MainActivityModule;
import com.joaocsousa.weatherapp.presentation.presenters.MainPresenter;
import com.joaocsousa.weatherapp.presentation.views.MainMvpView;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainMvpView {

	@Inject
	MainPresenter mPresenter;

	@Bind(R.id.activity_main_choose_location_button)
	protected Button mChangeLocationButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WeatherApp.app().getApplicationComponent()
			.plus(new MainActivityModule(this))
			.inject(this);
		ButterKnife.bind(this);
	}

	@OnClick(R.id.activity_main_choose_location_button)
	public void onChangeLocationClicked() {
		mPresenter.onChangeLocationClicked();
	}

	@Override
	public void openChangeLocationScreen() {
		Toast.makeText(this, "CLICKED", Toast.LENGTH_SHORT).show();
	}

}