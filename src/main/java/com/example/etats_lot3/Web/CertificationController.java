package com.example.etats_lot3.Web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("certification")
public class CertificationController {
    @GetMapping("")
    public String do_compare(HttpServletResponse response, @RequestParam("data_ls") MultipartFile data_ls , @RequestParam("extract_ligne") MultipartFile extract_ligne , @RequestParam("extract_pam") MultipartFile extract_pam, @RequestParam("extract_remise") MultipartFile extract_remise){
        return "hello";
    }

}
