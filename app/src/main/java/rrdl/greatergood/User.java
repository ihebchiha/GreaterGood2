package rrdl.greatergood;

/**
 * Created by maher on 26/11/2017.
 */

public class User {
    private String name;
    private int points;
    private static int Id= 0;

    public User(String name,int points){
        this.name = name;
        this.points = 500;
        Id ++;


    }
    public int onCreateTask(int points) throws Exception {
        if ((this.points - points) < 0){
            throw new Exception("Not enough Points");
        }
       return this.points -= points;
    }
    public int onJointTask(int points){
        return this.points += points;
    }

    public String getName(){
        return name;
    }
    public int getPoints(){
        return points;
    }

}
