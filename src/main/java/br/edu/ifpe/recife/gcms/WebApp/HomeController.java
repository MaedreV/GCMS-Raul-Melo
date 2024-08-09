package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HomeController {
	@RequestMapping("/")
	public @ResponseBody String greetingFulano() {
	return "Hello, fulano!";
	}
	@RequestMapping("/Raul")
	public @ResponseBody String greetingRaul() {
	return "Hello, Raul da Cópia!";
	}

}
