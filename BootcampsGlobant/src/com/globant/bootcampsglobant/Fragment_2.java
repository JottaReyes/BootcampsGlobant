package com.globant.bootcampsglobant;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class Fragment_2 extends android.app.Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		FrameLayout mFrameLayout = (FrameLayout) inflater.inflate(
				R.layout.activity_fragment_2, container, false);

		return mFrameLayout;

	}

}
