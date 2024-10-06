package com.example.digital_diary;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link otherinstitionofcampus#newInstance} factory method to
 * create an instance of this fragment.
 */
public class otherinstitionofcampus extends Fragment implements View.OnClickListener {
    Button sb,edu,cafe;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public otherinstitionofcampus() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment otherinstitionofcampus.
     */
    // TODO: Rename and change types and number of parameters
    public static otherinstitionofcampus newInstance(String param1, String param2) {
        otherinstitionofcampus fragment = new otherinstitionofcampus();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_otherinstitionofcampus, container, false);
        sb=view.findViewById(R.id.SB);
        sb.setOnClickListener(this);
        edu=view.findViewById(R.id.Eduins);
        edu.setOnClickListener(this);
        cafe=view.findViewById(R.id.Cafe);
        cafe.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.SB) {
            Intent intent = new Intent(otherinstitionofcampus.this.getActivity(), Sonali_bank.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.Eduins) {
            Intent intent1 = new Intent(otherinstitionofcampus.this.getActivity(), Educational_institution.class);
            startActivity(intent1);

        }
        else if(view.getId()==R.id.Cafe) {
            Intent intent2 = new Intent(otherinstitionofcampus.this.getActivity(), Cafeteria.class);
            startActivity(intent2);

        }
    }
}