package Fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
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
        Log.d(null, "Reader instance called");

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
    public void onCreate(Bundle savedInstanceStates){
        super.onCreate(savedInstanceStates);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_reader, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceStates){
        super.onActivityCreated(savedInstanceStates);
        TextView username = (TextView) getActivity().findViewById(R.id.reader_username);
        TextView poem = (TextView) getActivity().findViewById(R.id.reader_poem);
        TextView rating = (TextView) getActivity().findViewById(R.id.reader_rating);

        username.setText(mPoem.getAuthor());
        poem.setText(mPoem.getPoem());
        rating.setText(Integer.toString(mRating.getRating()));
    }


}
