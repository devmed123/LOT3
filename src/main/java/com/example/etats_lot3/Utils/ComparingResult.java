package com.example.etats_lot3.Utils;

import com.example.etats_lot3.Entity.Ligne;
import com.example.etats_lot3.Entity.Pam;
import java.util.ArrayList;
import java.util.Iterator;
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
        List<Ligne> ligneMap = new ArrayList();
        Iterator var2 = this.awbLigneMap.entrySet().iterator();

        while(var2.hasNext()) {
            Entry<String, Ligne> entry = (Entry)var2.next();
            if (this.lsLigneMap.get(entry.getKey()) != null && this.lsLigneMap.get(entry.getKey()).equals(entry.getValue())) {
                ligneMap.add(entry.getValue());
            }
        }

        return ligneMap;
    }

    public List<Ligne> lignenotvalid() {
        List<Ligne> ligneMap = new ArrayList();
        Iterator var2 = this.awbLigneMap.entrySet().iterator();

        while(var2.hasNext()) {
            Entry<String, Ligne> entry = (Entry)var2.next();
            if (this.lsLigneMap.get(entry.getKey()) != null && !this.lsLigneMap.get(entry.getKey()).equals(entry.getValue())) {
                Ligne l = this.lsLigneMap.get(entry.getKey());
                ligneMap.add(entry.getValue().generateDiff(l));
            }
        }

        return ligneMap;
    }

    public List<Pam> pamvalid() {
        List<Pam> pamMap = new ArrayList();
        Iterator var2 = this.awbPamMap.entrySet().iterator();

        while(var2.hasNext()) {
            Entry<String, Pam> entry = (Entry)var2.next();
            if (this.lsPamMap.get(entry.getKey()) != null && this.lsPamMap.get(entry.getKey()).equals(entry.getValue())) {
                pamMap.add(entry.getValue());
            }
        }

        return pamMap;
    }

    public List<Pam> pamnotvalid() {
        List<Pam> pamMap = new ArrayList();
        Iterator var2 = this.awbPamMap.entrySet().iterator();

        while(var2.hasNext()) {
            Entry<String, Pam> entry = (Entry)var2.next();
            if (this.lsPamMap.get(entry.getKey()) != null && !this.lsPamMap.get(entry.getKey()).equals(entry.getValue())) {
                Pam p = this.lsPamMap.get(entry.getKey());
                pamMap.add(entry.getValue().generateDiff(p));
            }
        }

        return pamMap;
    }
}