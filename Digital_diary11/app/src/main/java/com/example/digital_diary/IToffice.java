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
 * Use the {@link IToffice#newInstance} factory method to
 * create an instance of this fragment.
 */
public class IToffice extends Fragment implements View.OnClickListener {
    Button ictcell,pgd,cc;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public IToffice() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment IToffice.
     */
    // TODO: Rename and change types and number of parameters
    public static IToffice newInstance(String param1, String param2) {
        IToffice fragment = new IToffice();
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
        View view=inflater.inflate(R.layout.fragment_i_toffice, container, false);
        ictcell=view.findViewById(R.id.ICTcell);
        ictcell.setOnClickListener(this);
        pgd=view.findViewById(R.id.PGD);
        pgd.setOnClickListener(this);
        cc=view.findViewById(R.id.CC);
        cc.setOnClickListener(this);
    return view;
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.ICTcell) {
            Intent intent = new Intent(IToffice.this.getActivity(), ICT_cell.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.PGD) {
            Intent intent1 = new Intent(IToffice.this.getActivity(), PGD_in_ict.class);
            startActivity(intent1);
        }
        else if(view.getId()==R.id.CC) {
            Intent intent2 = new Intent(IToffice.this.getActivity(), Cyber_center.class);
            startActivity(intent2);
        }
    }
}