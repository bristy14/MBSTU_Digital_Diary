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
 * Use the {@link eduandresearchcenter#newInstance} factory method to
 * create an instance of this fragment.
 */
public class eduandresearchcenter extends Fragment implements View.OnClickListener {
    Button mbrc,rc,iqac,js;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public eduandresearchcenter() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment eduandresearchcenter.
     */
    // TODO: Rename and change types and number of parameters
    public static eduandresearchcenter newInstance(String param1, String param2) {
        eduandresearchcenter fragment = new eduandresearchcenter();
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
        View view= inflater.inflate(R.layout.fragment_eduandresearchcenter, container, false);
        mbrc=view.findViewById(R.id.MBRC);
        mbrc.setOnClickListener(this);
        rc=view.findViewById(R.id.RC);
        rc.setOnClickListener(this);
        js=view.findViewById(R.id.JST);
        js.setOnClickListener(this);
        iqac=view.findViewById(R.id.IQAC);
        iqac.setOnClickListener(this);
    return view;
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.MBRC) {
            Intent intent = new Intent(eduandresearchcenter.this.getActivity(), MB_researchcenter.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.RC) {
            Intent intent1 = new Intent(eduandresearchcenter.this.getActivity(), Research_cell.class);
            startActivity(intent1);

        }
        else if(view.getId()==R.id.JST) {
            Intent intent2= new Intent(eduandresearchcenter.this.getActivity(), Journal_ofscience.class);
            startActivity(intent2);

        }
        else if(view.getId()==R.id.IQAC) {
            Intent intent3 = new Intent(eduandresearchcenter.this.getActivity(), IQAC.class);
            startActivity(intent3);

        }
    }
}