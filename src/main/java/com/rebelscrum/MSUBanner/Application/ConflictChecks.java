package com.rebelscrum.MSUBanner.Application;

import com.rebelscrum.MSUBanner.Application.Entity.Schedule;
import com.rebelscrum.MSUBanner.Application.Entity.Section;

public class ConflictChecks {

    

    //Checks time and day conflicts for course to be added against courses already in course list
    public boolean conflicts(Section courseToAdd){
        boolean checkDays = true;
        boolean checkTimes = true;
        for (int i = 0; i < Schedule.courseList.size(); i++){
            if (courseToAdd.getDays() != Schedule.courseList[i].getDays()){
                checkDays = false;
            }

            if (!(courseToAdd.getTimeStart() > Schedule.courseList[i].getTimeStart()) &&
                    !(courseToAdd.getTimeEnd() < Schedule.courseList[i].getTimeEnd())){
                checkTimes = false;
            }

            if (checkDays && checkTimes){
                return true;
            }

        }
        return false;
    }
}
