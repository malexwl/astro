package com.atom.bean.json.login;

public class Server {

    private int id;
    private String name;
    private String addr;
    private int status;
    private int empire_id;
    private int number;
    private int concur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getEmpire_id() {
        return empire_id;
    }

    public void setEmpire_id(int empire_id) {
        this.empire_id = empire_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getConcur() {
        return concur;
    }

    public void setConcur(int concur) {
        this.concur = concur;
    }
}
