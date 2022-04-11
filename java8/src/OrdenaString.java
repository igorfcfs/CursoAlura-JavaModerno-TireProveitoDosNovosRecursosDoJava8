import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

// Lambdas com Comparator
//		palavras.sort(new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				if (s1.length() < s2.length()) {
//					return -1;
//				}
//				if (s1.length() > s2.length()) {
//					return 1;
//				}
//				return 0;
//			}
//		});

		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length()) {
				return -1;
			}
			if (s1.length() > s2.length()) {
				return 1;
			}
			return 0;
		});

//		palavras.sort((s1, s2) -> {
//			return Integer.compare(s1.length(), s2.length());
//		});
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println(palavras);
		
//		for (String p : palavras) {
//			System.out.println(p);
//		}

//Lambda com variavel Consumer
//		Consumer<String> consumidor = new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		};

//Lambdas com Consumer
//		palavras.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		});

//		palavras.forEach((String s) -> {
//			System.out.println(s);
//		});

//		palavras.forEach(s -> {
//			System.out.println(s);
//		});
		
		Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);
		
		palavras.forEach(s -> System.out.println(s));
	}
}
