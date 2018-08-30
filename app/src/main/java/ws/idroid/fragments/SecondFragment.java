package ws.idroid.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.*;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragmentb_my, parentViewGroup, false);
        return rootView;
    }
}