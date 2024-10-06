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
 * Use the {@link versityoffices#newInstance} factory method to
 * create an instance of this fragment.
 */
public class versityoffices extends Fragment  implements View.OnClickListener{
    Button ro,po,cl,mc;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public versityoffices() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment versityoffices.
     */
    // TODO: Rename and change types and number of parameters
    public static versityoffices newInstance(String param1, String param2) {
        versityoffices fragment = new versityoffices();
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
        View view=inflater.inflate(R.layout.fragment_versityoffices, container, false);
        ro=view.findViewById(R.id.RO);
        ro.setOnClickListener(this);
        po=view.findViewById(R.id.PO);
        po.setOnClickListener(this);
        cl=view.findViewById(R.id.CL);
        cl.setOnClickListener(this);
        mc=view.findViewById(R.id.MC);
        mc.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.RO) {
            Intent intent = new Intent(versityoffices.this.getActivity(), Register_office.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.PO)
             {
            Intent intent1 = new Intent(versityoffices.this.getActivity(), Proctor_office.class);
            startActivity(intent1);
        }
        else if(view.getId()==R.id.CL) {
            Intent intent2 = new Intent(versityoffices.this.getActivity(), Central_library.class);
            startActivity(intent2);
        }
        else if(view.getId()==R.id.MC) {
            Intent intent3 = new Intent(versityoffices.this.getActivity(), Medical_center.class);
            startActivity(intent3);
        }
    }
}