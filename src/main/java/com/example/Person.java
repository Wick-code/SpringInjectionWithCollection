package com.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

    private String name;

    private List<Address> addressList;

    private Set<Address> addressSet;

    private Map<String, Address> stringAddressMap;

    private Map<String, String> stringStringMap;

    private List<String> names;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Set<Address> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set<Address> addressSet) {
        this.addressSet = addressSet;
    }

    public Map<String, Address> getStringAddressMap() {
        return stringAddressMap;
    }

    public void setStringAddressMap(Map<String, Address> stringAddressMap) {
        this.stringAddressMap = stringAddressMap;
    }

    public Map<String, String> getStringStringMap() {
        return stringStringMap;
    }

    public void setStringStringMap(Map<String, String> stringStringMap) {
        this.stringStringMap = stringStringMap;
    }

    public void display(){
        System.out.println("Name = "+getName());
        System.out.println("Address List = "+getAddressList());
        System.out.println("Address Set = "+getAddressSet());
        System.out.println("Address Map = "+getStringAddressMap());
        System.out.println("Address prop = "+getStringStringMap());
        System.out.println("String names = "+getNames());
    }

}
