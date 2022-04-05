package model;

import java.sql.Timestamp;

public class Vote {

    private int Id;
    private String userName;

    public Vote( int Id,String userName) {
        this.Id = Id;
        this.userName = userName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
