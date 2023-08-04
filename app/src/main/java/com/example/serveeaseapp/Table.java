package com.example.serveeaseapp;

public class Table {

    private int numTable;
    private String codeTable;

    public Table(int numTable, String codeTable) {
        this.numTable = numTable;
        this.codeTable = codeTable;
    }

    public int getNumTable() {
        return numTable;
    }

    public String getCodeTable() {
        return codeTable;
    }

    public void setNumTable(int numTable) {
        this.numTable = numTable;
    }

    public void setCodeTable(String codeTable) {
        this.codeTable = codeTable;
    }
}
