package com.example.etats_lot3.mappers;
import com.example.etats_lot3.Entity.Ligne;
import com.example.etats_lot3.Entity.Pam;
import com.example.etats_lot3.Utils.PddExtract;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class PddMapper {
    InputStream pdd_file;
    PddExtract pddExtract;
    public Map<String,Ligne> getLignes() throws IOException {
        return pddExtract.extract_ligne();

    }
  public  Map<String,Pam>  get_PAm() throws IOException {
       return pddExtract.extract_pam();
    }
    public PddMapper(InputStream pdd_file) throws IOException {
        this.pdd_file = pdd_file;
        this.pddExtract =new PddExtract(pdd_file);
    }
}
