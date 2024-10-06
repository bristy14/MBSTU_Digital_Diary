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
 * Use the {@link residentialhall#newInstance} factory method to
 * create an instance of this fragment.
 */
public class residentialhall extends Fragment implements View.OnClickListener {
    Button mh,akh,mrh,zh,jaha,rh,fh;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public residentialhall() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment residentialhall.
     */
    // TODO: Rename and change types and number of parameters
    public static residentialhall newInstance(String param1, String param2) {
        residentialhall fragment = new residentialhall();
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
        View view= inflater.inflate(R.layout.fragment_residentialhall, container, false);
        mh=view.findViewById(R.id.MH);
        mh.setOnClickListener(this);
        akh=view.findViewById(R.id.AKH);
        akh.setOnClickListener(this);
        mrh=view.findViewById(R.id.MRH);
        mrh.setOnClickListener(this);
        zh=view.findViewById(R.id.ZH);
        zh.setOnClickListener(this);
        jaha=view.findViewById(R.id.JIH);
        jaha.setOnClickListener(this);
        rh=view.findViewById(R.id.RH);
        rh.setOnClickListener(this);
        fh=view.findViewById(R.id.FH);
        fh.setOnClickListener(this);
    return view;
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.MH) {
            Intent intent = new Intent(residentialhall.this.getActivity(), Mannan_hall.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.AKH) {
            Intent intent1 = new Intent(residentialhall.this.getActivity(), Alema_hall.class);
            startActivity(intent1);

        }
        else if(view.getId()==R.id.MRH) {
            Intent intent2 = new Intent(residentialhall.this.getActivity(),Mujib_hall.class);
            startActivity(intent2);

        }
        else if(view.getId()==R.id.ZH) {
            Intent intent3 = new Intent(residentialhall.this.getActivity(),Zia_hall.class);
            startActivity(intent3);

        }
        else if(view.getId()==R.id.JIH) {
            Intent intent4 = new Intent(residentialhall.this.getActivity(), Zahanara_hall.class);
            startActivity(intent4);

        }
        else if(view.getId()==R.id.RH) {
            Intent intent5 = new Intent(residentialhall.this.getActivity(), Rasel_hall.class);
            startActivity(intent5);

        }
        else if(view.getId()==R.id.FH) {
            Intent intent6 = new Intent(residentialhall.this.getActivity(), Fajitul_hall.class);
            startActivity(intent6);

        }
    }
}