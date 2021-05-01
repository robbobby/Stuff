package com.wellingtonblack;

import java.util.ArrayList;

public class Competition {
    private ArrayList<Specialisation> specialisationList;

    public void removeSpecialisation(Specialisation specialisation) {
        specialisationList.remove(specialisation);
    }

    public void addSpecialisation(Specialisation specialisation) {
        specialisationList.add(specialisation);
    }

    public Competition(ArrayList<Specialisation> specialisationList) {
        this.specialisationList = specialisationList;
    }

    public ArrayList<Specialisation> getSpecialisationList() {
        return specialisationList;
    }
}
