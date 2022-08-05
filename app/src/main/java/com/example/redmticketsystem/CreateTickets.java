package com.example.redmticketsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class CreateTickets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_tickets);
    }

    private static ArrayList<CreateTickets> createTicketsArrayList = new ArrayList<>();

    private String id;
    private String name;

    public CreateTickets(String id,String name) {
        this.id = id;
        this.name = name;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;

    }
    public static void initCreateTickets(){
        CreateTickets createtickets1 = new CreateTickets( "0",  "A");
        createTicketsArrayList.add(createtickets1);
        CreateTickets createtickets2 = new CreateTickets( "0",  "B");
        createTicketsArrayList.add(createtickets2);
        CreateTickets createtickets3 = new CreateTickets( "0",  "C");
        createTicketsArrayList.add(createtickets3);
        CreateTickets createtickets4 = new CreateTickets( "0", "D");
        createTicketsArrayList.add(createtickets4);

    }

    public ArrayList<CreateTickets> getCreateTicketsArrayList() {
        return createTicketsArrayList;
    }
}