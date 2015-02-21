package Fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.peter.myapplication.R;

import java.util.ArrayList;

import Model.Poem;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuillList extends Fragment {

    /* Fields */

    //Singleton
    private static volatile QuillList instance;
    //contains list of poems that need to be rendered
    private ArrayList<Poem> mPoems = new ArrayList<Poem>();
    //number of poems to be displayed in list
    private static final int POEM_COUNT = 10;

    /* Fragment States and related */

    public static QuillList getInstance(){
        if(instance == null)
            instance = new QuillList();

        return instance;
    }

    public QuillList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quilllist, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }


    /* Getter Setters */

    public void setPoems(ArrayList<Poem> mPoems) {
        this.mPoems = mPoems;
    }
}
