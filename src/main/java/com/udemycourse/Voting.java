package com.udemycourse;

import java.util.List;

public class Voting {

    private String title;
    private List<Candidate> candidates;


    public boolean voting(String name, List<Candidate> candidates){
        for(int i = 0; i < candidates.size(); i++){
            if(candidates.get(i).equals(name)){
                return true;
            }
        }
        return false;
    }
}
