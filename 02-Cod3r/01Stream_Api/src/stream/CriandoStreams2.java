package stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams2 {

	public static void main(String[] args) {

		Consumer<String> print = System.out::println;
		
		Stream<String> langs = Stream.of("Java", "JavaScript", "Lua");
		langs.forEach(print);
		
		
		
		
		
	}

}
