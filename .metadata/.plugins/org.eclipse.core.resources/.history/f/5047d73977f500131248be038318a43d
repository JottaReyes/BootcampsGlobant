package com.globant.progressbar.async;

import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.globant.progressbar.R;

public final class LoadingAsync extends AsyncTask<Void, Integer, Void> {

	private int fileSize = 0;

	private final ProgressBar mProgressBar;
	private final TextView mTextView;

	public LoadingAsync(final ProgressBar progress, final TextView textView) {

		this.mProgressBar = progress;
		this.mTextView = textView;

	}

	@Override
	protected void onPreExecute() {

		int max = 100;
		mProgressBar.setMax(max);
		mProgressBar.setProgress(0);
		mTextView.setText(R.string.text_loading);
		mProgressBar.setVisibility(View.VISIBLE);

	}

	@Override
	protected Void doInBackground(final Void... params) {
		mProgressBar.setVisibility(View.VISIBLE);
		mProgressBar.setProgress(doSomeTasks());
		publishProgress();
		return null;
	}

	@Override
	protected void onProgressUpdate(final Integer... values) {
		mProgressBar.setVisibility(View.VISIBLE);
		mProgressBar.setProgress(doSomeTasks());

	}

	@Override
	protected void onPostExecute(final Void result) {
		mTextView.setText(R.string.text_loaded);
		mProgressBar.setVisibility(View.INVISIBLE);
	}

	public int doSomeTasks() {

		while (fileSize <= 1000000) {

			fileSize++;

			if (fileSize == 100000) {
				return 10;
			} else if (fileSize == 200000) {
				return 20;
			} else if (fileSize == 300000) {
				return 30;
			} else if (fileSize == 400000) {
				return 40;
			} else if (fileSize == 500000) {
				return 50;
			} else if (fileSize == 600000) {
				return 60;
			} else if (fileSize == 800000) {
				return 70;
			} else if (fileSize == 800000) {
				return 80;
			} else if (fileSize == 900000) {
				return 90;
			}
		}

		return 100;

	}

}
