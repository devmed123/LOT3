package com.example.etats_lot3.Utils;

import com.example.etats_lot3.Entity.Ligne;
import com.example.etats_lot3.Entity.Pam;

import java.util.HashMap;
import java.util.Map;
public class ComparingResult {
    Map<String, Ligne>  awbLigneMap;
    Map<String, Ligne>  lsLigneMap;
    Map<String, Pam>  awbPamMap;
    Map<String, Pam>  lsPamMap;

    public ComparingResult(Map<String, Ligne> awbLigneMap, Map<String, Ligne> lsLigneMap, Map<String, Pam> awbPamMap, Map<String, Pam> lsPamMap) {
        this.awbLigneMap = awbLigneMap;
        this.lsLigneMap = lsLigneMap;
        this.awbPamMap = awbPamMap;
        this.lsPamMap = lsPamMap;
    }

    public Map<String,Ligne> lignevalid(){
        Map<String,Ligne> ligneMap=new HashMap<>();
        for(Map.Entry<String,Ligne> entry:awbLigneMap.entrySet()){
            if(lsLigneMap.get(entry.getKey()).equals(entry.getValue())){
                ligneMap.put(entry.getKey(),entry.getValue());
            }
        }
        return ligneMap;
    }


    public Map<String,Ligne> lignenotvalid(){
        Map<String,Ligne> ligneMap=new HashMap<>();
        for(Map.Entry<String,Ligne> entry:awbLigneMap.entrySet()){
            if(!lsLigneMap.get(entry.getKey()).equals(entry.getValue())){
                Ligne l= lsLigneMap.get(entry.getKey());
                ligneMap.put(entry.getKey(),entry.getValue().generateDiff(l));
            }
        }
        return ligneMap;
    }



    public Map<String,Pam> pamvalid(){
        Map<String,Pam> pamMap=new HashMap<>();
        for(Map.Entry<String,Pam> entry:awbPamMap.entrySet()){
            if(lsPamMap.get(entry.getKey()).equals(entry.getValue())){
                pamMap.put(entry.getKey(),entry.getValue());
            }
        }
        return pamMap;
    }


    public Map<String,Pam> pamnotvalid(){
        Map<String,Pam> pamMap=new HashMap<>();
        for(Map.Entry<String,Pam> entry:awbPamMap.entrySet()){
            if(!lsPamMap.get(entry.getKey()).equals(entry.getValue())){
                Pam p= lsPamMap.get(entry.getKey());
                pamMap.put(entry.getKey(),entry.getValue().generateDiff(p));
            }
        }
        return pamMap;
    }
}
