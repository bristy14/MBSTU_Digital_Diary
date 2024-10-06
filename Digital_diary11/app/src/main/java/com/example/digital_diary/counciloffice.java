package com.example.digital_diary;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class counciloffice extends Fragment implements View.OnClickListener  {

    Button rg,aca;
    public counciloffice() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_counciloffice, container, false);
        rg = view.findViewById(R.id.rg);
        rg.setOnClickListener(this);
        aca=view.findViewById(R.id.academic);
        aca.setOnClickListener(this);
        return view;
        }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.rg)
        {
            Intent intent = new Intent(counciloffice.this.getActivity(), regentboard.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.academic)
        {
            Intent intent1 = new Intent(counciloffice.this.getActivity(), academicboard.class);
            startActivity(intent1);
        }

    }
    }


