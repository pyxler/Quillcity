package Fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.peter.myapplication.R;

import Model.Poem;
import Model.Rating;

/**
 * A simple {@link Fragment} subclass.
 */
public class Reader extends Fragment {

    /* Fields */
    private static volatile Reader instance;
    private static Poem mPoem;
    private static Rating mRating;

    public static Reader getInstance(){
        if (instance==null){
            instance = new Reader();
        }

        return instance;
    }

    public Reader() {
        // Required empty public constructor
    }

    public static void setPoem(Poem poem){
        mPoem = poem;
    }

    public static void setRating(Rating rating){
        mRating = rating;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        return textView;
    }


}
