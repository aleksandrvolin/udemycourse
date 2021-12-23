package com.udemycourse;

import java.util.List;

public class VotingSystem {
    private List<Candidate> users;
    private Voting currentVoting;
    private User currentUser;


    public static void main(String[] args) {


    }

    public boolean addUser(String name, String login, String password, String repeating) {
        Candidate user = new Candidate(name);
        if(findUser(login)) {
            users.add(23, user);
            return true;
        } else {
            return false;
        }
    }


    public boolean  findUser(String login) {
        for(int i = 0; i < users.size(); i++){

        }
        return false;
    }

    public void save(){

    }

    public void load(){

    }

    public void getResult(){
        System.out.println(users.toString());
    }
}
