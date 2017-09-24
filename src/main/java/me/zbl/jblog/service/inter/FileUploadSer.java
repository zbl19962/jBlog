package me.zbl.jblog.service.inter;

import me.zbl.jblog.domain.Info;
import me.zbl.jblog.domain.UploadPic;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;

public interface FileUploadSer {
    UploadPic uploadPic(HttpServletRequest request);
    Info updateAvatar(HttpServletRequest request);
    ResponseEntity<byte[]> gainPic(String dir, String picName);
}
