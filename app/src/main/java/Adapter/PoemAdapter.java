package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.peter.myapplication.R;

import java.util.ArrayList;

import Model.Poem;

/**
 * Created by Richard Sarde on 2/21/2015.
 */
public class PoemAdapter extends ArrayAdapter<Poem> {

    /* Fields */
    private Context mContext;
    private ArrayList<Poem> mPoems;

    /* Constructors */
    public PoemAdapter(Context context, ArrayList<Poem> poems){
        super(context, R.layout.row_quilllist, poems);

        mContext = context;
        mPoems = poems;

    }
    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        View rowView = convertView;

        if (convertView == null) {

            //initialise inflater
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //inflate row layout
            rowView = inflater.inflate(R.layout.row_quilllist, parent, false);

            TextView author = (TextView) rowView.findViewById(R.id.row_quillist_author);
            TextView summary = (TextView) rowView.findViewById(R.id.row_quilllist_summary);

            author.setText(mPoems.get(position).getAuthor());
            summary.setText(mPoems.get(position).getPoem());
        }

        return rowView;

    }

}
