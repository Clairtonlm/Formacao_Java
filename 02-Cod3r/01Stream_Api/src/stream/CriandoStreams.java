package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::println;
		
		Stream<String> langs = Stream.of("Java", "JavaScript", "Lua");
		langs.forEach(print);
		
		// Criando Stream usando Array
		String[] mainLangs = {" \nPython", "Go", "PHP\n "};
		Stream.of(mainLangs).forEach(print);
		
		Arrays.stream(mainLangs).forEach(print);
		
		Arrays.stream(mainLangs, 1, 2).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("HTML", "CSS", "Kotlin", "Docker", "Linus\n ");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		
		
	}

}
