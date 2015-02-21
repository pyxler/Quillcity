package Fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.peter.myapplication.R;

import java.util.ArrayList;

import Adapter.PoemAdapter;
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

        Log.d(null, "Quill instance called");

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

        //DEMO
        mPoems.add(new Poem("Shakespeare", "All the world's a stage and all the men and women merely players"));
        mPoems.add(new Poem("Balzac", "Notre soleil s'est couché, nous avons tous froid maintenant." ));

        //Declares ListView
        ListView listView = (ListView) getActivity().findViewById(R.id.quill_listview);


        //Initialises Adapter
        PoemAdapter adapter = new PoemAdapter(getActivity(), mPoems);

        //sets Adapter
        listView.setAdapter(adapter);



    }


    /* Getter Setters */

    public void setPoems(ArrayList<Poem> mPoems) {
        this.mPoems = mPoems;
    }
}
