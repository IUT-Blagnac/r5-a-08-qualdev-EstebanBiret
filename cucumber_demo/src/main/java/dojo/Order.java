package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String owner ;
    private String target;
    private String msg;
    private List<String> cocktails;

    public Order() {
        this.owner = null;
        this.cocktails = new ArrayList<String>();
        this.target = null;
    }

    public void declareOwner(String nom) {
        this.owner = nom;
    }

    public String getOwner() {
        return this.owner;
    }

    public void declareTarget(String nom) {
        this.target = nom;
    }

    public String getTarget() {
        return this.target;
    }

    public List<String> getCocktails() {
        return this.cocktails;
    }

    public void declareMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg(){
        return this.msg;
    }
}