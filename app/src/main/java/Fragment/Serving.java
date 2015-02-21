package Fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.peter.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Serving extends Fragment {

    /* Fields */

    private static volatile Serving instance;

    public static Serving getInstance(){
        if(instance == null){
            instance = new Serving();
        }

        return instance;
    }


    public Serving() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_serving, container, false);
    }


}
