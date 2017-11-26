package rrdl.greatergood;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by maher on 26/11/2017.
 */

public class Task {

    private User creater;
    private String Description;
    private int numberOfJoiner;
    private ArrayList<User> joiner = new ArrayList<>();
    private int rewards;
    private static int id = 0;
    private boolean isDone = false;
    private Date date;

    public Task(User creater,int numberOfJoiner,int rewards){
        this.creater = creater;
        this.numberOfJoiner = numberOfJoiner;
        this.rewards = rewards;
        id ++;

    }

    public void setDescription(String Description){
        this.Description = Description;
    }
    public String getDescription(){
        return Description;
    }

    public int getId(){
        return id;
    }
    public User getCreater(){
        return creater;
    }
    public int getRewards(){
        return rewards;
    }
    public void addUser(User joiner){
        if(this.joiner.size()<this.numberOfJoiner){
        this.joiner.add(joiner);}
    }

    public ArrayList<User> getJoiner(){
        return this.joiner;
    }

    public void done(){
        this.isDone = true;
    }
    public Boolean getIsDone(){
        return isDone;
    }

}
