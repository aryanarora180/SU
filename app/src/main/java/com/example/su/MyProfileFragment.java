package com.example.su;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyProfileFragment extends Fragment {


	public MyProfileFragment() {}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_my_profile, container, false);



		return rootView;
	}

}
