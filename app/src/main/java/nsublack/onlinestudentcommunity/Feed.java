package nsublack.onlinestudentcommunity;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Feed extends Fragment {

    private RecyclerView feedRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        final View rootView = inflater.inflate(R.layout.fragment_feed, container, false);

        feedRecyclerView = rootView.findViewById(R.id.feed_recycler);


        FeedAdapter adapter = new FeedAdapter(FeedDataModel.getObjectList(),getContext());
        feedRecyclerView.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        feedRecyclerView.setLayoutManager(layoutManager);


        feedRecyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }
}
