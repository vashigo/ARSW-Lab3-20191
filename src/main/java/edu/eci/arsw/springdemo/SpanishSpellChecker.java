package edu.eci.arsw.springdemo;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component("spanish")
public class SpanishSpellChecker implements SpellChecker {

	@Override
	public String checkSpell(String text) {
		return "revisando ("+text+") con el verificador de sintaxis del espanol";
                
                
	}

}
