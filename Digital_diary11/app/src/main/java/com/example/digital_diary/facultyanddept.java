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
 * Use the {@link facultyanddept#newInstance} factory method to
 * create an instance of this fragment.
 */
public class facultyanddept extends Fragment implements View.OnClickListener {
Button cse,ict,te,esrm,ftns,cps,eng,bge,bmb,phar,che,phy,math,stat,eco;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public facultyanddept() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment facultyanddept.
     */
    // TODO: Rename and change types and number of parameters
    public static facultyanddept newInstance(String param1, String param2) {
        facultyanddept fragment = new facultyanddept();
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
        View view= inflater.inflate(R.layout.fragment_facultyanddept, container, false);
        cse=view.findViewById(R.id.CSE);
        cse.setOnClickListener(this);
        ict=view.findViewById(R.id.ICT);
        ict.setOnClickListener(this);
        te=view.findViewById(R.id.TE);
        te.setOnClickListener(this);
        esrm=view.findViewById(R.id.ESRM);
        esrm.setOnClickListener(this);
        ftns=view.findViewById(R.id.FTNS);
        ftns.setOnClickListener(this);
        cps=view.findViewById(R.id.CPS);
        cps.setOnClickListener(this);
        eng=view.findViewById(R.id.Eng);
        eng.setOnClickListener(this);
        phar=view.findViewById(R.id.Phar);
        phar.setOnClickListener(this);
        che=view.findViewById(R.id.Che);
        che.setOnClickListener(this);
        phy=view.findViewById(R.id.Phy);
        phy.setOnClickListener(this);
        math=view.findViewById(R.id.Math);
        math.setOnClickListener(this);
        bmb=view.findViewById(R.id.BMB);
        bmb.setOnClickListener(this);
        bge=view.findViewById(R.id.BGE);
        bge.setOnClickListener(this);
        eco=view.findViewById(R.id.ECO);
        eco.setOnClickListener(this);
        stat=view.findViewById(R.id.Stat);
        stat.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.CSE) {
            Intent intent = new Intent(facultyanddept.this.getActivity(), CSE.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.ICT) {
            Intent intent1 = new Intent(facultyanddept.this.getActivity(),ICT.class);
            startActivity(intent1);
        }
        else if(view.getId()==R.id.TE) {
            Intent intent2 = new Intent(facultyanddept.this.getActivity(),TE.class);
            startActivity(intent2);
        }
        else if(view.getId()==R.id.ESRM) {
            Intent intent3 = new Intent(facultyanddept.this.getActivity(),ESRM.class);
            startActivity(intent3);
        }
        else if(view.getId()==R.id.FTNS) {
            Intent intent4 = new Intent(facultyanddept.this.getActivity(),FTNS.class);
            startActivity(intent4);
        }
        else if(view.getId()==R.id.CPS) {
            Intent intent5 = new Intent(facultyanddept.this.getActivity(),CPS.class);
            startActivity(intent5);
        }
        else if(view.getId()==R.id.BGE) {
            Intent intent6 = new Intent(facultyanddept.this.getActivity(),BGE.class);
            startActivity(intent6);
        }
        else if(view.getId()==R.id.BMB) {
            Intent intent7 = new Intent(facultyanddept.this.getActivity(),BMB.class);
            startActivity(intent7);
        }
        else if(view.getId()==R.id.Eng) {
            Intent intent8 = new Intent(facultyanddept.this.getActivity(),English.class);
            startActivity(intent8);
        }
        else if(view.getId()==R.id.Phar) {
            Intent intent9 = new Intent(facultyanddept.this.getActivity(),Pharmacy.class);
            startActivity(intent9);
        }
        else if(view.getId()==R.id.Che) {
            Intent intent10 = new Intent(facultyanddept.this.getActivity(),Chemistry.class);
            startActivity(intent10);
        }
        else if(view.getId()==R.id.Phy) {
            Intent intent11 = new Intent(facultyanddept.this.getActivity(),Physcis.class);
            startActivity(intent11);
        }
        else if(view.getId()==R.id.Math) {
            Intent intent12 = new Intent(facultyanddept.this.getActivity(),Math.class);
            startActivity(intent12);
        }
        else if(view.getId()==R.id.Stat) {
            Intent intent13 = new Intent(facultyanddept.this.getActivity(),Statistics.class);
            startActivity(intent13);
        }
        else if(view.getId()==R.id.ECO) {
            Intent intent14 = new Intent(facultyanddept.this.getActivity(),Economics.class);
            startActivity(intent14);
        }

    }
}