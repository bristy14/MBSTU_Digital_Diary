package com.example.digital_diary;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link deanoffaculty#newInstance} factory method to
 * create an instance of this fragment.
 */
public class deanoffaculty extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    Button ef,lsf,ssf,af,sf,bsf;

    public deanoffaculty() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment deanoffaculty.
     */
    // TODO: Rename and change types and number of parameters
    public static deanoffaculty newInstance(String param1, String param2) {
        deanoffaculty fragment = new deanoffaculty();
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
        View view= inflater.inflate(R.layout.fragment_deanoffaculty, container, false);
        ef=view.findViewById(R.id.EF);
        ef.setOnClickListener(this);
        lsf=view.findViewById(R.id.Lsf);
        lsf.setOnClickListener(this);
        af=view.findViewById(R.id.AF);
        af.setOnClickListener(this);
        ssf=view.findViewById(R.id.SSF);
        ssf.setOnClickListener(this);
        sf=view.findViewById(R.id.SF);
        sf.setOnClickListener(this);
        bsf=view.findViewById(R.id.BSF);
        bsf.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {

       if(view.getId()==R.id.EF) {
           Intent intent = new Intent(deanoffaculty.this.getActivity(), Engineering_faculty.class);
           startActivity(intent);

       }
       else if(view.getId()==R.id.Lsf) {
           Intent intent1 = new Intent(deanoffaculty.this.getActivity(), Lifescience_faculty.class);
           startActivity(intent1);

       }
       else if(view.getId()==R.id.SF) {
           Intent intent2 = new Intent(deanoffaculty.this.getActivity(), Science_faculty.class);
           startActivity(intent2);
       }
           else if(view.getId()==R.id.SSF) {

           Intent intent3 = new Intent(deanoffaculty.this.getActivity(), Socialscience_faculty.class);
           startActivity(intent3);
       }
           else if(view.getId()==R.id.BSF) {
           Intent intent4 = new Intent(deanoffaculty.this.getActivity(), Businessstudies_faculty.class);
           startActivity(intent4);
       }
           else if(view.getId()==R.id.AF)
       {
                Intent intent5=new Intent(deanoffaculty.this.getActivity(),Art_faculty.class);
                startActivity(intent5);

        }

    }
}