package com.example.etats_lot3.Web;
import com.example.etats_lot3.Entity.Ligne;
import com.example.etats_lot3.Entity.Pam;
import com.example.etats_lot3.Utils.ComparingResult;
import com.example.etats_lot3.mappers.CsvMapper;
import com.example.etats_lot3.Utils.CsvOutput;
import com.example.etats_lot3.mappers.PddMapper;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.*;

@RestController
public class CertificationController {

    @PostMapping("/store")
    public   void doss(HttpServletResponse response, @RequestParam("file") MultipartFile ls_pdd , @RequestParam("ligne_extraction") MultipartFile ligne_extraction , @RequestParam("pam_extraction") MultipartFile pam_extraction ) throws Exception {

        CsvMapper csvExtractor=new CsvMapper(ligne_extraction.getInputStream(), pam_extraction.getInputStream());
        Map<String,Ligne> awb_Lignes= csvExtractor.ReadLignes();
        Map<String,Pam> awb_Pams= csvExtractor.ReadPams();

        PddMapper mapper=new PddMapper(ls_pdd.getInputStream());
        Map<String,Ligne> ls_Lignes= mapper.getLignes();
        Map<String,Pam> ls_pams= mapper.get_PAm();


        ComparingResult comparingResult= new  ComparingResult(awb_Lignes,ls_Lignes,awb_Pams ,ls_pams);


        Map<String,Ligne> ligne_valide=comparingResult.lignevalid();
        Map<String,Ligne> ligne_nvalide=comparingResult.lignenotvalid();

        Map<String,Pam> pam_valide=comparingResult.pamvalid();
        Map<String,Pam> pam_nvalide=comparingResult.pamnotvalid();
        response.setHeader("Content-Disposition", "attachment; filename=" + "identifications" + ".xlsx");
        CsvOutput csvOutput=new CsvOutput(ligne_valide,ligne_nvalide,pam_valide,pam_nvalide);
        Workbook w=csvOutput.exportAsCsv();
        w.write(response.getOutputStream());
        w.close();

    }



}
