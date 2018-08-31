package nsublack.onlinestudentcommunity.DataModels;

import java.util.ArrayList;
import java.util.List;

import nsublack.onlinestudentcommunity.R;

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
        String[] subjects = getSubjects();
        String[] captions = getCaptions();
        String[] following = getfollowing();
        String[] comments = getComments();
        int[] problems = getProblems();

        for (int i = 0; i < images.length; i++) {
            FeedDataModel feed = new FeedDataModel();
            feed.setImageID(images[i]);
            feed.setVarsityID(varsity[i]);
            feed.setProblemID(problems[i]);
            feed.setFollowingID(following[i]);
            feed.setSubjectID(subjects[i]);
            feed.setCommentsID(comments[i]);
            feed.setCaptionID(captions[i]);
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

    private static String[] getfollowing() {
        String[] following = {

                "Following : 2 ",
                "Following : 3 ",
                "Following : 0 ",
                "Following : 8",
                "Following : 0 ",
                "Following : 2 ",
                "Following : 3 ",
                "Following : 0 ",
                "Following : 8",
                "Following : 0 ",
                "Following : 2 ",
                "Following : 3 ",
                "Following : 0 ",
                "Following : 8",
                "Following : 0 ",


        };

        return following;
    }

    private static String[] getComments() {
        String[] following = {

                "Comments : 0 ",
                "Comments : 4 ",
                "Comments : 3 ",
                "Comments : 8",
                "Comments : 4 ",
                "Comments : 8 ",
                "Comments : 6 ",
                "Comments : 9 ",
                "Comments : 1",
                "Comments : 0 ",
                "Comments : 0 ",
                "Comments : 2 ",
                "Comments : 5 ",
                "Comments : 4",
                "Comments : 7",


        };

        return following;
    }

    private static String[] getSubjects() {
        String[] subjects = {

                "CSE327",
                "CSE311",
                "PHY108",
                "CSE327",
                "CSE215",
                "Android", "Mat116",
                "CSE225",
                "PHY108", "EEE111",
                "CSE311",
                "Android", "CSE327",
                "CSE311",
                "CSE115",


        };

        return subjects;
    }

    private static String[] getCaptions() {
        String[] captions = {

                "How do I solve this ??",
                "Can someone give me important formulas to solve this issue ?",
                "Any souls to help ? :3 ",
                "What formula should I use for this one ?",
                "",
                "I tried to solve it for the whole night but couldn't. Anybody help ?", "  I was up the whole night for this",
                "HOW DO I SOLVE IT ?",
                "Can some give me the solution for number two ?", "Please help :( ",
                "CSE311",
                "Why is this error showing ?", "CSE327",
                "CSE311",
                "How do I solve it ?",


        };

        return captions;
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

    private static int[] getProblems() {
        int[] problems = {

                R.drawable.problemone,
                R.drawable.problemtwo,
                R.drawable.problemthree,
                R.drawable.problemfour,
                R.drawable.problemfive,
                R.drawable.problemsix,
                R.drawable.problemseven,
                R.drawable.problemeight,
                R.drawable.problemnine,
                R.drawable.problemten,
                R.drawable.problemeleven,
                R.drawable.problemtwelve,
                R.drawable.problemthirteen,
                R.drawable.problemfourteen,
                R.drawable.problemfifteen,

        };

        return problems;
    }
}
