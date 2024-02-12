package com.example.etats_lot3.Utils;

import com.example.etats_lot3.Entity.Ligne;
import com.example.etats_lot3.Entity.Pam;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ComparingResult {
    Map<String, Ligne> awbLigneMap;
    Map<String, Ligne> lsLigneMap;
    Map<String, Pam> awbPamMap;
    Map<String, Pam> lsPamMap;

    public ComparingResult(Map<String, Ligne> awbLigneMap, Map<String, Ligne> lsLigneMap, Map<String, Pam> awbPamMap, Map<String, Pam> lsPamMap) {
        this.awbLigneMap = awbLigneMap;
        this.lsLigneMap = lsLigneMap;
        this.awbPamMap = awbPamMap;
        this.lsPamMap = lsPamMap;
    }

    public List<Ligne> lignevalid() {
        List<Ligne> ligneMap = new ArrayList<>();
        for (Entry<String ,Ligne> entry : awbLigneMap.entrySet()){
            if (this.lsLigneMap.get(entry.getKey()) != null && this.lsLigneMap.get(entry.getKey()).equals(entry.getValue())) {
                Ligne l = this.lsLigneMap.get(entry.getKey());
                ligneMap.add(entry.getValue().generateDiff(l));
            }
        }

        return ligneMap;
    }

    public List<Ligne> lignenotvalid() {
        List<Ligne> ligneMap = new ArrayList<>();
        for (Entry<String ,Ligne> entry : awbLigneMap.entrySet()){
            if (this.lsLigneMap.get(entry.getKey()) != null && !this.lsLigneMap.get(entry.getKey()).equals(entry.getValue())) {
                Ligne l = this.lsLigneMap.get(entry.getKey());
                ligneMap.add(entry.getValue().generateDiff(l));
            }
        }

        return ligneMap;
    }

    public List<Pam> pamvalid() {
        List<Pam> pamMap = new ArrayList<>();

         for(Entry<String ,Pam> entry: awbPamMap.entrySet() ){
             if (this.lsPamMap.get(entry.getKey()) != null && this.lsPamMap.get(entry.getKey()).equals(entry.getValue())) {
                 pamMap.add(entry.getValue());
             }
         }
        return pamMap;
    }

    public List<Pam> pamnotvalid() {
        List<Pam> pamMapn = new ArrayList<>();
        for(Entry<String ,Pam> entry: awbPamMap.entrySet() ){
            if (this.lsPamMap.get(entry.getKey()) != null && !this.lsPamMap.get(entry.getKey()).equals(entry.getValue())) {
                pamMapn.add(entry.getValue());
            }
        }
        return pamMapn;
    }
}