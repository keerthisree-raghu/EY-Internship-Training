package day17;

import java.util.ListResourceBundle;

public class Dictionary_hi extends ListResourceBundle {
	Object obj[][] = {
			{"hello", "namaste"}
	};
	@Override
	protected Object[][] getContents() {
		return obj;
	}
}