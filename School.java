package com.example.mathcompetencysurvey;

public class School {
    // attributes
    private String name;

    private Address address;

    private String principal;
    private Marks marks;

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName( ) {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public void setNumParticipants(int num) {
        marks = new Marks(num);
    }
}
