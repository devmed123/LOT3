 package com.example.etats_lot3.Web;

        import com.example.etats_lot3.Entity.Ligne;
        import com.example.etats_lot3.Entity.Pam;
        import com.example.etats_lot3.Utils.ComparingResult;
        import com.example.etats_lot3.mappers.CsvMapper;
        import com.example.etats_lot3.mappers.PddMapper;
        import java.io.ByteArrayOutputStream;
        import java.io.OutputStreamWriter;
        import java.util.Iterator;
        import java.util.List;
        import java.util.Map;
        import java.util.zip.ZipEntry;
        import java.util.zip.ZipOutputStream;
        import javax.servlet.http.HttpServletResponse;
        import org.springframework.http.HttpHeaders;
        import org.springframework.http.MediaType;
        import org.springframework.http.ResponseEntity;
        import org.springframework.http.ResponseEntity.BodyBuilder;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;
        import org.springframework.web.multipart.MultipartFile;

@RestController
public class CertificationController {
    @PostMapping({"/store"})
    public ResponseEntity<byte[]> doss(HttpServletResponse response, @RequestParam("file") MultipartFile ls_pdd, @RequestParam("ligne_extraction") MultipartFile ligne_extraction, @RequestParam("pam_extraction") MultipartFile pam_extraction) throws Exception {
        CsvMapper csvExtractor = new CsvMapper(ligne_extraction.getInputStream(), pam_extraction.getInputStream());
        Map<String, Ligne> awb_Lignes = csvExtractor.ReadLignes();
        Map<String, Pam> awb_Pams = csvExtractor.ReadPams();
        PddMapper mapper = new PddMapper(ls_pdd.getInputStream());
        Map<String, Ligne> ls_Lignes = mapper.getLignes();
        Map<String, Pam> ls_pams = mapper.get_PAm();
        ComparingResult comparingResult = new ComparingResult(awb_Lignes, ls_Lignes, awb_Pams, ls_pams);
        List<Ligne> ligne_valide = comparingResult.lignevalid();
        List<Ligne> ligne_nvalide = comparingResult.lignenotvalid();
        List<Pam> pam_valide = comparingResult.pamvalid();
        List<Pam> pam_nvalide = comparingResult.pamnotvalid();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        Throwable var18 = null;

        try {
            zipOutputStream.putNextEntry(new ZipEntry("PamNv.csv"));
            Iterator var19 = pam_nvalide.iterator();

            Pam p;
            while(var19.hasNext()) {
                p = (Pam)var19.next();
                zipOutputStream.write((p.toString() + "\n").getBytes());
            }

            zipOutputStream.closeEntry();
            zipOutputStream.putNextEntry(new ZipEntry("PamV.csv"));
            var19 = pam_valide.iterator();

            while(var19.hasNext()) {
                p = (Pam)var19.next();
                zipOutputStream.write((p.toString() + "\n").getBytes());
            }

            zipOutputStream.closeEntry();
            zipOutputStream.putNextEntry(new ZipEntry("LigneNv.csv"));
            var19 = ligne_nvalide.iterator();

            Ligne l;
            while(var19.hasNext()) {
                l = (Ligne)var19.next();
                zipOutputStream.write((l.toString() + "\n").getBytes());
            }

            zipOutputStream.closeEntry();
            zipOutputStream.putNextEntry(new ZipEntry("LigneV.csv"));
            var19 = ligne_valide.iterator();

            while(true) {
                if (!var19.hasNext()) {
                    zipOutputStream.closeEntry();
                    break;
                }

                l = (Ligne)var19.next();
                zipOutputStream.write((l.toString() + "\n").getBytes());
            }
        } catch (Throwable var28) {
            var18 = var28;
            throw var28;
        } finally {
            if (zipOutputStream != null) {
                if (var18 != null) {
                    try {
                        zipOutputStream.close();
                    } catch (Throwable var27) {
                        var18.addSuppressed(var27);
                    }
                } else {
                    zipOutputStream.close();
                }
            }

        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", "files.zip");
        return ResponseEntity.ok().headers(headers).body(byteArrayOutputStream.toByteArray());
    }

    @GetMapping({"/said"})
    public ResponseEntity<byte[]> getdoss() throws Exception {
        String textContent = "Hello;thisis;aextfile";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(byteArrayOutputStream);
        Throwable var4 = null;

        try {
            writer.write(textContent);
        } catch (Throwable var13) {
            var4 = var13;
            throw var13;
        } finally {
            if (writer != null) {
                if (var4 != null) {
                    try {
                        writer.close();
                    } catch (Throwable var12) {
                        var4.addSuppressed(var12);
                    }
                } else {
                    writer.close();
                }
            }

        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        headers.setContentDispositionFormData("attachment", "textfile.csv");
        return ResponseEntity.ok().headers(headers).body(byteArrayOutputStream.toByteArray());
    }
}
