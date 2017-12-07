package com.rebelscrum.MSUBanner.Application;
import com.rebelscrum.MSUBanner.Application.Entity.Schedule;
import com.rebelscrum.MSUBanner.Application.Entity.Section;

    public class ConflictChecks {
        /**
         * Checks time and day conflicts for course to be added against
         * courses already in course list.
         *
         * @param courseToAdd
         * @return boolean
         */
        public boolean conflicts(Section courseToAdd) {
            boolean checkDays = true;
            boolean checkTimes = true;
            Section[] sectionList = new Section[Schedule.sectionList.size()];
            Schedule.sectionList.toArray(sectionList);
            for (int i = 0; i < Schedule.sectionList.size(); i++) {
                if (courseToAdd.getDays() != sectionList[i].getDays()) {
                    checkDays = false;
                }
                if (!(courseToAdd.getTimeStart() > sectionList[i].getTimeStart()) &&
                        !(courseToAdd.getTimeEnd() < sectionList[i].getTimeEnd())) {
                    checkTimes = false;
                }
                if (checkDays && checkTimes) {

                    if (!(courseToAdd.getTimeStart() > sectionList[i].getTimeStart())
                            && !(courseToAdd.getTimeEnd()
                            < sectionList[i].getTimeEnd())) {
                        checkTimes = false;
                    }

                    if (checkDays && checkTimes) {
                        return true;
                    }
                }
                return false;
            }
        if (checkDays && checkTimes) {
            return true;
        }
        else {
                return false;
        }
        }
    }

