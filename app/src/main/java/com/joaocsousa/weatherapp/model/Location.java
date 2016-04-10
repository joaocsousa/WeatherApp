package com.joaocsousa.weatherapp.model;

import android.support.annotation.StringRes;

import com.joaocsousa.weatherapp.R;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by joaosousa on 31/01/16.
 */
public enum Location {

	LONDON(R.string.location_london, 2643743),
	NEW_YORK(R.string.location_new_york, 5128638),
	LISBON(R.string.location_lisbon, 6458923),
	PARIS(R.string.location_paris, 2988507),
	BERLIN(R.string.location_berlin, 2950158),
	RIO_DE_JANEIRO(R.string.location_rio_de_jabeiro, 3451190),
	BRUSSELS(R.string.location_brussels, 2800866);

	@StringRes
	private final int mName;
	private final long mId;

	private Location(@StringRes int name, long id) {
		mName = name;
		mId = id;
	}

	public int getName() {
		return mName;
	}

	public long getId() {
		return mId;
	}

	/**
	 * Gets the full list of locations sorted alphabetically.
	 *
	 * @return
	 */
	public List<Location> getLocations() {
		Location[] locations = values();
//		Arrays.sort(locations, new Comparator<Location>() {
//			@Override
//			public int compare(Location lhs, Location rhs) {
//				return app().getString(lhs.getName()).compareTo(app().getString(rhs.getName()));
//			}
//		});
		return asList(locations);
	}

}
