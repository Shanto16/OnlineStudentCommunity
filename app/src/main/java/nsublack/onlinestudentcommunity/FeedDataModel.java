package nsublack.onlinestudentcommunity;

import java.util.ArrayList;
import java.util.List;

public class FeedDataModel {


    public int getProblemID() {
        return problemID;
    }

    public void setProblemID(int problemID) {
        this.problemID = problemID;
    }

    private int problemID, imageID;
    private String nameID, varsityID, captionID, subjectID, followingID, commentsID;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getNameID() {
        return nameID;
    }

    public void setNameID(String nameID) {
        this.nameID = nameID;
    }

    public String getVarsityID() {
        return varsityID;
    }

    public void setVarsityID(String varsityID) {
        this.varsityID = varsityID;
    }

    public String getCaptionID() {
        return captionID;
    }

    public void setCaptionID(String captionID) {
        this.captionID = captionID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getFollowingID() {
        return followingID;
    }

    public void setFollowingID(String followingID) {
        this.followingID = followingID;
    }

    public String getCommentsID() {
        return commentsID;
    }

    public void setCommentsID(String commentsID) {
        this.commentsID = commentsID;
    }


    public static List<FeedDataModel> getObjectList() {
        List<FeedDataModel> dataList = new ArrayList<>();

        int[] images = getImages();
        String[] varsity = getVarsity();
        String[] names = getNames();

        for (int i = 0; i < images.length; i++) {
            FeedDataModel feed = new FeedDataModel();
            feed.setImageID(images[i]);
            feed.setVarsityID(varsity[i]);
            feed.setNameID(names[i]);

            dataList.add(feed);
        }
        return dataList;
    }

    private static int[] getImages() {

        int[] images = {

                R.drawable.abir,
                R.drawable.hasib,
                R.drawable.hritu,
                R.drawable.niaz,
                R.drawable.anya,
                R.drawable.maria,
                R.drawable.rakib,
                R.drawable.sadi,
                R.drawable.profile_pic,
                R.drawable.rayhan,
                R.drawable.sohan,
                R.drawable.bonny,
                R.drawable.edson,
                R.drawable.kawshiq,
                R.drawable.emon,

        };

        return images;
    }


    private static String[] getVarsity() {
        String[] varsities = {

                "North South University",
                "South East University",
                "Bangladesh University of Professionals",
                "Dhaka University",
                "Lappeenranta University of Technology",
                "North South University",
                "North South University",
                "North South University",
                "North South University",
                "East West University",
                "National University",
                "Bangladesh University of Engineering and Technology",
                "Lappeenranta University of Technology",
                "North South University",
                "North South University",


        };

        return varsities;
    }


    private static String[] getNames() {
        String[] names = {

                "Abir Hasan",
                "Hasib Khondokar",
                "Hrituparna Devmoni",
                "Niaz Khan",
                "Anya Diaz",
                "Mumin Az Zahira",
                "Tanvir Hasan",
                "Saiful Sadi",
                "Shakil Mahmud",
                "Rayhan Rakin",
                "Sohan Khan",
                "Bonny Ahmed",
                "Edson Silva",
                "Kawshiq Hasan",
                "Kaisar Emon",


        };

        return names;
    }
}
