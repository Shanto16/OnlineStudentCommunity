package nsublack.onlinestudentcommunity.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import nsublack.onlinestudentcommunity.DataModels.FeedDataModel;
import nsublack.onlinestudentcommunity.R;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.FeedViewHolder> {

    private List<FeedDataModel> objectList;
    private LayoutInflater inflater;

    public FeedAdapter(List<FeedDataModel> objectList, Context context) {
        this.objectList = objectList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public FeedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.model_post, parent, false);
        FeedViewHolder holder = new FeedViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(FeedViewHolder holder, int position) {

        FeedDataModel current = objectList.get(position);
        holder.setData(current,position);

    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    class FeedViewHolder extends RecyclerView.ViewHolder {

        private TextView name,varsity,caption,follwoing,comments;
        private ImageView profilepic,posts;
        private Button subject;

        private int position;
        private FeedDataModel currentObject;


        public FeedViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.username);
            varsity = itemView.findViewById(R.id.university);
            caption = itemView.findViewById(R.id.caption);
            follwoing = itemView.findViewById(R.id.following);
            comments = itemView.findViewById(R.id.comments);
            profilepic = itemView.findViewById(R.id.profile_picture);
            posts = itemView.findViewById(R.id.problem);
            subject = itemView.findViewById(R.id.subject);

        }

        public void setData(FeedDataModel current, int position) {

            this.name.setText(current.getNameID());
            this.varsity.setText(current.getVarsityID());
            this.caption.setText(current.getCaptionID());
            this.follwoing.setText(current.getFollowingID());
            this.comments.setText(current.getCommentsID());
            this.profilepic.setImageResource(current.getImageID());
            this.subject.setText(current.getSubjectID());
            this.position = position;
            this.currentObject = current;





        }
    }
}
