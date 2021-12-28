package com.gmail.mateendev3.frags.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gmail.mateendev3.frags.R;
import com.gmail.mateendev3.frags.model.Student;

public class GetDataFromActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_get_data_from_activity, container, false);
        TextView tvResultF = view.findViewById(R.id.tv_resultF);
        Bundle bundle = getArguments();
        if (bundle != null && bundle.getParcelable("key") != null) {
            Student student = bundle.getParcelable("key");
            tvResultF.setText(student.getName() + "\n");
            tvResultF.append(student.getAge() + "\n");
            tvResultF.append("" + student.getHeight());
        }
        return view;
    }

    public static GetDataFromActivity getInstance(Student student) {
        Bundle args = new Bundle();
        args.putParcelable("key", student);
        GetDataFromActivity fragment = new GetDataFromActivity();
        fragment.setArguments(args);
        return fragment;
    }
}