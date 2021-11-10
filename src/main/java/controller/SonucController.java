package controller;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SonucController {
	
	//bu yazım ilkel
//	@RequestMapping("submit")
//	public String islemYap(HttpServletRequest req) {
//		int s1 = Integer.parseInt(req.getParameter("sayi1"));
//		int s2 = Integer.parseInt(req.getParameter("sayi2"));
//		int toplam = s1 + s2;
//		int carpim = s1 * s2;
//		HttpSession session = req.getSession();
//		session.setAttribute("sayilarinToplami", toplam);
//		session.setAttribute("sayilarinCarpimi", carpim);
//		return "sonuc";
//	}
	//sen bunu submit işleminde çalıştır
	@RequestMapping("submit") //buradaki submit ile index.jsp deki form un içi (submit) aynı olmalı
	public String islemYap1(@RequestParam("sayi1") int s1, @RequestParam("sayi2") int s2, Model m) { 
		
		// requestten sayı1 parametresini alıyor, int s1 olarak saklıyor
		// int toplam = s1 + s2; 
        // Model: verileri saklayıcı
        // int carpim = s1 * s2;
		// alta toplam ve carpımda yazabiliriz
		// yukarıdaki işlemleri Model m nin içine gömecez. alttada ekliyoruz. 
		// sayıların toplamı->sonuc.jsx deki adı, buradan ona toplam gönderiliyor
		m.addAttribute("numbersToplam", s1+s2); // sayilarinToplami=s1+s2
		m.addAttribute("numbersCarpim", s1*s2); // bunlar model kısmı
		return "sonuc";                            //burası view kısmı
	}//sonuc.jsp ye gönderir
}
























































