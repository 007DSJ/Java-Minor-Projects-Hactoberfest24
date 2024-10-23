package Database;

import java.util.ArrayList;

public class PersonDetails {
    
    private String name;
    private String address;
    private String gender;
    
    private String meal1;
    private int quantity1;

    private String meal2;
    private int quantity2;

    private double total_bill;

    public PersonDetails(String name,String address,String gender,String meal1,int quantity1,String meal2,int quantity2)
    {
        this.name=name;
        this.address=address;
        this.gender=gender;
        this.meal1=meal1;
        this.quantity1=quantity1;
        this.meal2=meal2;
        this.quantity2=quantity2;
    }

    String getName()
    {
        return name;
    }

    String getAddress()
    {
        return address;
    }

    String getGender()
    {
        return gender;
    }

    String getMeal1()
    {
        return meal1;
    }

    int getQuantity1()
    {
        return quantity1;
    }

    String getMeal2()
    {
        return meal2;
    }

    int getQuantity2()
    {
        return quantity2;
    }

    @Override
    public String toString()
    {
        return this.name+" "+this.address+" "+this.gender
               +" "+this.meal1+" :"+this.quantity1+" | "+this.meal2+" :"+this.quantity2;
    }



}
