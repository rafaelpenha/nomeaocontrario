package com.example.psrafa.adivinhar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class mainController<temporaria> {
    String nome = "";
    private Object temporaria;


    @GetMapping
    public String inicio(Model model) {
        model.addAttribute("nome",nome);
        model.addAttribute("formulario",new Formulario());
        return "jogo";


    }



    @PostMapping("/enviar")
    public String enviar (Formulario formulario) {

    }
        public static String reverse (String o) {
            for (int i = o.length() - 1; i >= 0; i--)
              nome += o.charAt(i);
            return nome;

        System.out.println(nome);


        return "redirect:/";
    }


}






