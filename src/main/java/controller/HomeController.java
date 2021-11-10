package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Control Sayfasi
public class HomeController {
	
	@RequestMapping("/") // "/"-> get istegi ile anasayfada index i gor
	public String Home() { // Basit bir metod yazalım
		return "index"; //Properties deki ekledigimiz sey sayesinde 
		// index i gör dememiz, index.jsp ye gelmesini saglar
	}
}
// JSP (JavaServer Sayfaları)
// JSP, server da çalışan ve istemci tarafı dillerinde 
//(HTML, CSS, JavaScript, vb.) Şablon metni yazmanıza izin veren bir Java görünüm teknolojisidir . 