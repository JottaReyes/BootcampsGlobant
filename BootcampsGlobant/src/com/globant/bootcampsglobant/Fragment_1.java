package com.globant.bootcampsglobant;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.globant.bootcampsglobant.async.ProgressBarController;

public class Fragment_1 extends android.app.Fragment {

	TextView fragmentTitle;
	TextView mTextViewActivity;
	ProgressBar mProgressBar;
	ProgressDialog mProgressDialog;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		FrameLayout mFrameLayout = (FrameLayout) inflater.inflate(
				R.layout.activity_fragment_1, container, false);

		mProgressBar = (ProgressBar) mFrameLayout
				.findViewById(R.id.progressBarHorizontal);
		
		mProgressDialog = new ProgressDialog(getActivity().getApplicationContext());
		
		mTextViewActivity = (TextView) mFrameLayout
				.findViewById(R.id.fragment1_text);

		new ProgressBarController(mTextViewActivity, mProgressDialog).execute();

		return mFrameLayout;

	}

}
