package br.com.estudos.model;

import com.opencsv.bean.CsvBindByName;

public class Voter {
    
    @CsvBindByName(column = "Voter")
    private String voter;

    @CsvBindByName(column = "Vote")
    private Integer vote;

    public Voter() {

    }

    public Integer getVote() {
        return vote;
    }

    public String getVoter() {
        return voter;
    }
}
