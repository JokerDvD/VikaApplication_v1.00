package nit.vikaapplication_v100.ResponseAcitivity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nit.vikaapplication_v100.R;

public class NegativeResponseFragment extends Fragment
{
   ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {


        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_negative_response, container, false);

        TextView addressLisp;
        addressLisp = (TextView) v.findViewById(R.id.lisp_address);
        addressLisp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {startActivity(new Intent(getActivity(), AddressLisp.class));//startActivity();
            }
        });

        return v;
    }








}
