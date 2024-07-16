package application;


import entities.Product;
import services.CalculationService;

import java.util.ArrayList;
import java.util.List;

public class Program {
		public static void main(String[] args) {
				List<Product> list = new ArrayList<>();
				list.add(new Product("TV", 900.0));
				list.add(new Product("Notebook", 1200.0));
				list.add(new Product("Tablet", 450.0));

				Product max = CalculationService.max(list);

				System.out.println("Most expensive:");
				System.out.println(max);
		}
}
