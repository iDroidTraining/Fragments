package ws.idroid.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.*;

public class MainActivity extends AppCompatActivity {


    @OnClick(R.id.tv_main_activity)
     void onMyTextPressed(){
        SecondFragment fragmentB = new SecondFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name","Arab Bank");
        fragmentB.setArguments(bundle);
        getFragmentManager().beginTransaction()
                .replace(R.id.fragmentParentViewGroup, fragmentB)
                .commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        if (savedInstanceState == null) {
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragmentParentViewGroup, new FirstFragment())
                    .commit();
        }
    }
}
