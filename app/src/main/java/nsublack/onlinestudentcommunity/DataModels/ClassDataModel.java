package nsublack.onlinestudentcommunity.DataModels;

import java.util.ArrayList;
import java.util.List;

public class ClassDataModel {

    private String course;
    private String faculty;

    public String getCourse() {
        return course;
    }

    public void setCourse(String classname) {
        this.course = classname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getNotices() {
        return notices;
    }

    public void setNotices(String notices) {
        this.notices = notices;
    }

    private String notices;


    public static List<ClassDataModel> getObjectList() {
        List<ClassDataModel> dataList = new ArrayList<>();

        String[] classes = getClasses();
        String[] faculties = getFaculties();
        String[] notice = getNotice();


        for (int i = 0; i < classes.length; i++) {
            ClassDataModel classroom = new ClassDataModel();
            classroom.setCourse(classes[i]);
            classroom.setFaculty(faculties[i]);
            classroom.setNotices(notice[i]);


            dataList.add(classroom);
        }
        return dataList;
    }

    private static String[] getClasses() {
        String[] classes = {

                "CSE327",
                "CSE311",
                "PHY108",

        };

        return classes;
    }


    private static String[] getFaculties() {
        String[] classes = {

                "ABH3",
                "TRR",
                "ZUM",

        };

        return classes;
    }

    private static String[] getNotice() {
        String[] notice = {

                "0 Notices",
                "2 Notices",
                "4 Notices",

        };

        return notice;
    }
}

