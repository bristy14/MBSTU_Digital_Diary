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
 * Use the {@link commiteeandboard#newInstance} factory method to
 * create an instance of this fragment.
 */
public class commiteeandboard extends Fragment implements View.OnClickListener {
    Button ec,mwc,db,vco,pvco;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public commiteeandboard() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment commiteeandboard.
     */
    // TODO: Rename and change types and number of parameters
    public static commiteeandboard newInstance(String param1, String param2) {
        commiteeandboard fragment = new commiteeandboard();
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
        View view= inflater.inflate(R.layout.fragment_commiteeandboard, container, false);
        ec=view.findViewById(R.id.EC);
        ec.setOnClickListener(this);
        mwc=view.findViewById(R.id.MWC);
        mwc.setOnClickListener(this);
        db=view.findViewById(R.id.DB);
        db.setOnClickListener(this);
        vco=view.findViewById(R.id.VCO);
        vco.setOnClickListener(this);
        pvco=view.findViewById(R.id.PVCO);
        pvco.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.EC) {
            Intent intent = new Intent(commiteeandboard.this.getActivity(), Economic_commitee.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.MWC) {
            Intent intent1 = new Intent(commiteeandboard.this.getActivity(), Management_commitee.class);
            startActivity(intent1);

        }
        else if(view.getId()==R.id.DB) {
            Intent intent2 = new Intent(commiteeandboard.this.getActivity(), Discipline_board.class);
            startActivity(intent2);
        }
        else if(view.getId()==R.id.VCO) {
            Intent intent3 = new Intent(commiteeandboard.this.getActivity(), Vice_chancellor.class);
            startActivity(intent3);
        }
        else if(view.getId()==R.id.PVCO) {
            Intent intent4 = new Intent(commiteeandboard.this.getActivity(),Pro_vice.class);
            startActivity(intent4);
        }
    }
}