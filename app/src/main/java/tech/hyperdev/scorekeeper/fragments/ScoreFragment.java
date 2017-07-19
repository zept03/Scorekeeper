package tech.hyperdev.scorekeeper.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import tech.hyperdev.scorekeeper.R;

/**
 * A simple {@link
 * } subclass.
 */
public class ScoreFragment extends Fragment {

    private int score = 0;
    private String name;


  /*  public ScoreFragment() {
        // Required empty public constructor
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_score, container, false);

        readBundle(getArguments());

        TextView tvName = (TextView) view.findViewById(R.id.tvTeamName);
        tvName.setText(name);

//
//        mNameTextView.setText(String.format(name));
        return view;

    }

    public static ScoreFragment newInstance(String name) {
        Bundle bundle = new Bundle();
        bundle.putString("name", name);

        ScoreFragment fragment = new ScoreFragment();
        fragment.setArguments(bundle);

        return fragment;
    }

    private void readBundle(Bundle bundle) {
        if (bundle != null) {
            name = bundle.getString("name");
        }
    }



//    @Override
//    public void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putInt("score", score);
//    }




    public void SetText() {

    }

}
