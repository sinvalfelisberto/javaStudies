package app;

// import java.util.ArrayList;
// import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// import entities.Product;
// import entities.Student;
// import utils.CurrencyConverter;
// import utils.Printer;
// import entities.Account;

public class App {
	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		scanner.close();
	}

}

/*
 *  estudo sobre construtores, getters and setters
 * 
 * 		Account account;
		System.out.print("Enter account holder: ");
		String name = scanner.nextLine();

		System.out.print("Enter account number: ");
		String accountNumber = scanner.next();
		
		System.out.print("Is there an initial deposit(y/n)? ");
		String response = scanner.next();
		Double deposit;
		if (response.toLowerCase().contains("yes") || response.toLowerCase().contains("y")) {
			System.out.print("Enter initial deposit value: ");
			deposit = scanner.nextDouble();
			account = new Account(name, accountNumber, deposit);
		} else {
			account = new Account(name, accountNumber);
		}

		System.out.println("Account data: \n" + account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		deposit = scanner.nextDouble();
		account.depositAccount(deposit);

		System.out.println();
		System.out.println("Updated data: \n" + account);
		
		System.out.println();
		System.out.print("Enter a draw value: ");

		Double draw = scanner.nextDouble();
		if(!account.drawAccount(draw)) {
			System.out.println("Insuficient balance!");
		}

		System.out.println();
		System.out.println("Updated data: \n" + account);

 */

/*
 * Estudo sobre generics
 * 
 * Product pr = new Product("video cassete", 300.00, 3);
 * Printer<Product> productPrinter = new Printer<>(pr);
 * productPrinter.print();
 * 
 * ArrayList<Product> produtos = new ArrayList<>();
 * produtos.add(new Product("Tv", 900.00, 10));
 * produtos.add(pr);
 * produtos.add(new Product("Geladeira", 1200.00, 12));
 * 
 * printList(produtos);
 * private static void printList(List<?> myList) {
 * for(var iten: myList ) {
 * System.out.println(iten);
 * }
 * }
 */

/*
 * Problema do uso de encapsulamento
 * System.out.println("Enter Product data:");
 * System.out.print("Name: ");
 * String name = scanner.next();
 * System.out.print("Price: ");
 * Double price = scanner.nextDouble();
 * // System.out.print("Quantity in stock: ");
 * // Integer stock = scanner.nextInt();
 * // Product p = new Product(name, price, stock);
 * Product p = new Product(name, price);
 * System.out.println("Product data: " + p);
 * 
 * System.out.print("Enter the number of products to be added in stock: ");
 * p.addToStock(scanner.nextInt());
 * System.out.println("Updated data: " + p);
 * 
 * System.out.print("Enter the number of products to be removed from stock: ");
 * p.removeFromStock(scanner.nextInt());
 * System.out.print("Updated data: " + p);
 * scanner.close();
 */

/*
 * Problema do conversor de moedas
 * System.out.print("What is the dollar price? ");
 * Double dollarPrice = scanner.nextDouble();
 * System.out.print("How many dollars will be bought? ");
 * Double dollarsToBuy = scanner.nextDouble();
 * System.out.print("Amount to be paid in reais = " + String.format("%.2f",
 * CurrencyConverter.convertDollarToReal(dollarsToBuy, dollarPrice)));
 */

/*
 * Problema dos Alunos
 * 
 * Student stu = new Student();
 * stu.setName(scanner.nextLine());
 * stu.setFirstGrade(scanner.nextDouble());
 * stu.setSecondGrade(scanner.nextDouble());
 * stu.setThirdGrade(scanner.nextDouble());
 * 
 * System.out.println(stu);
 */

/*
 * Problema dos Empregados
 * 
 * Employee emp = new Employee();
 * System.out.print("Name: ");
 * emp.setName(scanner.nextLine());
 * System.out.print("Gross salary: ");
 * emp.setGrossSalary(scanner.nextDouble());
 * System.out.print("Tax: ");
 * emp.setTax(scanner.nextDouble());
 * System.out.println("Employee: " + emp);
 * 
 * System.out.print("Wich percentage to increase salary? ");
 * emp.increaseSalary(scanner.nextDouble());
 * 
 * System.out.println("Updated data: " + emp);
 */

/*
 * Exercio dos produtos
 * 
 * Product p = new Product();
 * 
 * // p1 = new Product();
 * // p2 = new Product();
 * 
 * // p1.setName("TV");
 * // p1.setPrice(900.00);
 * // p1.setStock(10);
 * 
 * // p2.setName("TV");
 * // p2.setPrice(900.00);
 * // p2.setStock(10);
 * 
 * // System.out.println("P1 == P2? " + p1.equals(p2));
 * 
 * System.out.println("Enter Product data:");
 * System.out.print("Name: ");
 * p.setName(scanner.next());
 * System.out.print("Price: ");
 * p.setPrice(scanner.nextDouble());
 * System.out.print("Quantity in stock: ");
 * p.setStock(scanner.nextInt());
 * System.out.println("Product data: " + p);
 * 
 * System.out.print("Enter the number of products to be added in stock: ");
 * p.addToStock(scanner.nextInt());
 * System.out.println("Updated data: " + p);
 * 
 * System.out.print("Enter the number of products to be removed from stock: ");
 * p.removeFromStock(scanner.nextInt());
 * System.out.print("Updated data: " + p);
 * scanner.close();
 */

/*
 * Exercicio do Retângulo
 * Rectangle r = new Rectangle();
 *
 * System.out.println("Enter rectangle width and height: ");
 * r.setWidth(scanner.nextDouble());
 * r.setHeight(scanner.nextDouble());
 * System.out.println(r);
 *
 * 
 */