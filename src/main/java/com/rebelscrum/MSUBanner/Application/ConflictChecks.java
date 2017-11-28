package com.rebelscrum.MSUBanner.Application;

import com.rebelscrum.MSUBanner.Application.Entity.Schedule;
import com.rebelscrum.MSUBanner.Application.Entity.Section;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ConflictChecks {



    //Checks time and day conflicts for course to be added against courses already in course list
    public boolean conflicts(Section sectionToAdd){
        boolean checkDays = true;
        boolean checkTimes = true;
        int j = Schedule.sectionList.size();
        Schedule[] sectionArray=Schedule.sectionList.toArray(new Schedule[j]);

        for (int i = 0; i < Schedule.sectionList.size(); i++){
            if (sectionToAdd.getDays() != sectionArray[i].getDays()){
                checkDays = false;
            }

            if (!(sectionToAdd.getTimeStart() > sectionArray[i].getTimeStart) &&
                    !(sectionToAdd.getTimeEnd() < sectionArray[i].getTimeEnd())){
                checkTimes = false;
            }

            if (checkDays && checkTimes){
                return true;
            }

        }
        return false;
    }
}
