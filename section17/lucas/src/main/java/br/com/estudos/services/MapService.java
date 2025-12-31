package br.com.estudos.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import br.com.estudos.model.Voter;

public class MapService {

    private List<Voter> votes = new ArrayList<>();
    
    public MapService(List<Voter> votes) {
        this.votes = votes;
    }

    public Map<String, Integer> resolvedCount() {
        
        Map<String, Integer> resolved = new TreeMap<>();
        
        for (Voter voter : votes) {
            if (resolved.containsKey(voter.getVoter())) {
                resolved.put(voter.getVoter(), voter.getVote() + resolved.get(voter.getVoter()));
            } else {
                resolved.put(voter.getVoter(), voter.getVote());
            }
        }

        return resolved;
    }
}
