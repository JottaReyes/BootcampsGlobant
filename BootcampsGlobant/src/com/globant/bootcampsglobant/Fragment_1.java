package com.globant.bootcampsglobant;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.globant.bootcampsglobant.async.ProgressBarController;

public class Fragment_1 extends android.app.Fragment {

	TextView fragmentTitle;
	TextView mTextViewActivity;
	ProgressBar mProgressBar;
	ProgressDialog mProgressDialog;
	Button mButtonLoad;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		FrameLayout mFrameLayout = (FrameLayout) inflater.inflate(
				R.layout.activity_fragment_1, container, false);

		mButtonLoad = (Button) mFrameLayout.findViewById(R.id.button1);

		mProgressDialog = new ProgressDialog(getActivity());

		mButtonLoad.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				new ProgressBarController(mTextViewActivity, mProgressDialog)
						.execute();

			}
		});

		return mFrameLayout;

	}

}
