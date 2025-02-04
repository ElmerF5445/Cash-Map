package com.example.cashmap.data;

public class cashmap_onboarding_data {
    public String Bank_Name;
    public int Bank_Background;
    public int Bank_Logo;
    public cashmap_onboarding_data(String Bank_Name, int Bank_Background, int Bank_Logo){
        this.Bank_Name = Bank_Name;
        this.Bank_Background = Bank_Background;
        this.Bank_Logo = Bank_Logo;
    }

    public String getBank_Name(){
        return Bank_Name;
    }

    public int getBank_Background(){
        return Bank_Background;
    }

    public int getBank_Logo(){
        return Bank_Logo;
    }
}
