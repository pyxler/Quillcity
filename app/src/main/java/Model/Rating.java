package Model;

/**
 * Created by Peter on 15-02-21.
 */
public class Rating {

    private int mViews;
    private int mNeg;
    private int mPos;
    private int mNeut;

    public Rating(){

    }

    public int getViews(){
        return mViews;
    }

    public int getNeg(){
        return mNeg;
    }

    public int getPos(){
        return mPos;
    }

    public int getNeut(){
        return mNeut;
    }

    public int getRating(){
        return mPos/(mPos + mNeg);
    }
    
}
