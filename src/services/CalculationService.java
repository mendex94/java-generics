package services;

import java.util.List;

public class CalculationService {
		public static <T extends Comparable<? super T>> T max(List<T> list) {
//			? super T, type T or any superclass of T.
				if (list.isEmpty()) {
						throw new IllegalStateException("List can't be empty");
				}
				T max = list.getFirst();
				for (T item : list) {
						if (item.compareTo(max) > 0) {
								max = item;
						}
				}
				return max;
		}
}
