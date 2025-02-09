package com.example.cashmap.data;

public class cashmap_home_data {
    private String ATM_Location;
    private String ATM_Status;
    public cashmap_home_data(String ATM_Location, String ATM_Status){
        this.ATM_Location = ATM_Location;
        this.ATM_Status = ATM_Status;
    }

    public String getATM_Location(){
        return ATM_Location;
    }

    public String getATM_Status(){
        return ATM_Status;
    }
}
