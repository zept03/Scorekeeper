package tech.hyperdev.scorekeeper.activities;

import android.app.Fragment;
import android.os.Bundle;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.fragments.ScoreFragment;
public class MainActivity extends AppCompatActivity {

    FrameLayout frameOne;
    FrameLayout frameTwo;
    private FragmentTransaction mFragmentTransaction;
    private FragmentManager mFragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
//        mFragmentManager = getFragmentManager();
//        mFragmentTransaction = mFragmentManager.beginTransaction();
//        mFragmentTransaction.replace(R.id.TeamOneFragment, new ScoreFragment());
//        mFragmentTransaction.commit();
//
//
//        mFragmentManager = getFragmentManager();
//        mFragmentTransaction = mFragmentManager.beginTransaction();
//        mFragmentTransaction.replace(R.id.TeamTwoFragment, new ScoreFragment());
//        mFragmentTransaction.commit();


        Fragment score_one = ScoreFragment.newInstance("Team 1");
        Fragment score_two = ScoreFragment.newInstance("Team 2");

        FragmentTransaction one = getFragmentManager().beginTransaction();
        one.add(R.id.TeamOneFragment, score_one).commit();

        getFragmentManager().beginTransaction()
                .add(R.id.TeamTwoFragment, score_two).commit();



    }

}
