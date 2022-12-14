package app;

import utils.Datas;

public class App {

	public static void main(String[] args) throws Exception {
		// Locale.setDefault(Locale.US);
		Datas data = new Datas();

		data.mostrarDatas();

	}

}
/*
 * Exercício com Matrizes
 * 
 * int n = scanner.nextInt();
 * int m = scanner.nextInt();
 * int[][] matriz = new int[n][m];
 * 
 * for(int i = 0; i < matriz.length; i++){
 * for(int j = 0; j < matriz[i].length; j++){
 * matriz[i][j] = scanner.nextInt();
 * }
 * }
 * 
 * int valorASerPesquisado = scanner.nextInt();
 * 
 * for(int i = 0; i < matriz.length; i++){
 * for(int j = 0; j < matriz[i].length; j++){
 * if(matriz[i][j] == valorASerPesquisado){
 * System.out.println("Position " + i + "," + j);
 * if(j > 0){
 * System.out.println("Left: " + matriz[i][j-1]);
 * }
 * if(j < matriz[i].length - 1){
 * System.out.println("Right: " + matriz[i][j + 1]);
 * }
 * if(i > 0){
 * System.out.println("Up: " + matriz[i-1][j]);
 * }
 * if(i < matriz.length - 1) {
 * System.out.println("Down: " + matriz[i + 1][j] + "\n");
 * }
 * }
 * 
 * }
 * }
 */

/*
 * Estudo com Matrizes -
 * 
 * int[][] matriz = new int[n][n];
 * 
 * for(int i = 0; i < matriz.length; i++){
 * for(int j = 0; j < matriz[i].length; j++){
 * matriz[i][j] = scanner.nextInt();
 * }
 * }
 * System.out.println("Main Diagonal:");
 * for(int i = 0; i < matriz.length; i++){
 * for(int j = 0; j < matriz[i].length; j++){
 * if(i == j)
 * System.out.print(matriz[i][j] + " ");
 * }
 * }
 * System.out.println();
 * System.out.print("Quantity of negative numbers = ");
 * int count = 0;
 * for(int i = 0; i < matriz.length; i++){
 * for(int j = 0; j < matriz[i].length; j++){
 * if(matriz[i][j] < 0)
 * count++;
 * }
 * }
 * System.out.print(count);
 * 
 * 
 */

/*
 * Estudo sobre listas
 * 
 * List<EmployeeManagement> empregados = new ArrayList<>();
 * 
 * System.out.print("How many employees will be registered? ");
 * int quantity = scanner.nextInt();
 * System.out.println();
 * 
 * int i = 0;
 * while(i < quantity) {
 * System.out.printf("Employee #%d \n", i + 1);
 * System.out.print("Id: ");
 * String id = scanner.next();
 * System.out.print("Name: ");
 * scanner.nextLine();
 * String name = scanner.nextLine();
 * System.out.print("Salary: ");
 * double salary = scanner.nextDouble();
 * 
 * empregados.add(new EmployeeManagement(id, name, salary));
 * System.out.println();
 * i++;
 * }
 * 
 * System.out.print("Enter the employee ID to increase salary: ");
 * String idEmployee = scanner.next();
 * EmployeeManagement employeeFound = empregados.stream().filter(x ->
 * x.getId().equals(idEmployee)).findFirst().orElse(null);
 * if(employeeFound == null){
 * System.out.println("This id does not exist!");
 * }
 * else{
 * empregados.remove(employeeFound);
 * System.out.print("Enter the percentage: ");
 * double percentage = scanner.nextDouble();
 * employeeFound.increaseSalary(percentage);
 * // double increasedSalary = employeeFound.increaseSalary(percentage);
 * // employeeFound.setSalary(increasedSalary);
 * empregados.add(employeeFound);
 * }
 * 
 * System.out.println("List of employess:");
 * empregados.stream().forEach(e -> System.out.println(e));
 */

// Implementação do método Capitalize
// System.out.println(Capitalize.capitalize("phrase"));
/*
 * Box, Unbox e Wrapper
 * 
 * int x = 20;
 * Object obj = x;
 * 
 * System.out.println(obj);
 * 
 * int y = (int) obj;
 * 
 * System.out.println(y);
 * 
 * Wrapper Classes
 * Double, Integer, Float...
 * Eles aceitam valores nulos, além de se
 * comportarem como objetos.
 * 
 */

/*
 * Exercício pensionato
 * 
 * Scanner scanner = new Scanner(System.in);
 * System.out.print("How many rooms will be rented? ");
 * int rents= scanner.nextInt();
 * Pensionato[] alugueis = new Pensionato[10];
 * 
 * for (int i = 0; i < rents; i++) {
 * System.out.printf("Rent #%d", (i + 1));
 * System.out.println();
 * System.out.print("Name: ");
 * scanner.nextLine();
 * String name = scanner.nextLine();
 * System.out.print("Email: ");
 * String email = scanner.next();
 * System.out.print("Room: ");
 * int room = scanner.nextInt();
 * System.out.println();
 * 
 * alugueis[room] = new Pensionato(name, email, room);
 * 
 * }
 * System.out.println();
 * System.out.println("Busy rooms:");
 * 
 * for (Pensionato pensionato : alugueis) {
 * if (pensionato != null) {
 * System.out.println(pensionato);
 * }
 * }
 * System.out.println();
 * 
 * scanner.close();
 * 
 */

/*
 * 
 * Ex: 05 Array
 * 
 * System.out.print("Quantos valores vai ter cada vetor? ");
 * int quantidadeItens = scanner.nextInt();
 * int[] a, b, c;
 * 
 * System.out.println("Digite os valores do vetor A:");
 * a = new int[quantidadeItens];
 * for(int i = 0; i < a.length; i++) {
 * a[i] = scanner.nextInt();
 * }
 * 
 * System.out.println("Digite os valores do vetor B:");
 * b = new int[quantidadeItens];
 * for(int i = 0; i < b.length; i++) {
 * b[i] = scanner.nextInt();
 * }
 * 
 * c = new int[quantidadeItens];
 * for(int i = 0; i < c.length; i++) {
 * c[i] = a[i] + b[i];
 * }
 * System.out.println("VALOR RESULTANTE:");
 * for(int i = 0; i < c.length; i++) {
 * System.out.println(c[i]);
 * }
 * 
 */

/*
 * Ex: 04 Array
 * 
 * 
 * 
 * System.out.print("Quantos numeros vc vai digitar? ");
 * int quantidadeNumeros = scanner.nextInt();
 * 
 * int[] numeros = new int[quantidadeNumeros];
 * for(int i = 0; i < numeros.length; i++) {
 * System.out.printf("%do numero: ", (i + 1));
 * numeros[i] = scanner.nextInt();
 * }
 * int quantidadePares = 0;
 * System.out.println("NUMEROS PARES: ");
 * for(int numero: numeros){
 * if(numero % 2 == 0) {
 * quantidadePares++;
 * System.out.print(numero + "    ");
 * }
 * }
 * System.out.println();
 * System.out.println("Quantidade DE PARES = " + quantidadePares);
 * 
 */

/*
 * Ex: 03 Array
 * 
 * Atleta atleta;
 * System.out.print("Quantos atletas serão digitados? ");
 * int quantidadeAtletas = scanner.nextInt();
 * Atleta[] arrayAtletas = new Atleta[quantidadeAtletas];
 * for(int i = 0; i < arrayAtletas.length; i++) {
 * System.out.printf("Dados da %da pessoa:\n", (i + 1));
 * System.out.print("Nome: ");
 * String nome = scanner.next();
 * System.out.print("Idade: ");
 * int idade = scanner.nextInt();
 * System.out.print("Altura: ");
 * double altura = scanner.nextDouble();
 * arrayAtletas[i] = new Atleta(nome, idade, altura);
 * }
 * double somaAlturas = 0.0;
 * for(Atleta atl: arrayAtletas) {
 * somaAlturas += atl.getAltura();
 * }
 * double mediaAlturas = somaAlturas / arrayAtletas.length;
 * 
 * System.out.println();
 * System.out.printf("Altura média: %.2f%n", mediaAlturas);
 * 
 * int menorDezesseis = 0;
 * for(Atleta a: arrayAtletas) {
 * if(a.getIdade() < 16) {
 * menorDezesseis++;
 * }
 * }
 * double percentualDezesseis = ((double) menorDezesseis / (double)
 * arrayAtletas.length) * 100.0;
 * System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f",
 * percentualDezesseis) + "%");
 * 
 * for(Atleta a: arrayAtletas) {
 * if(a.getIdade() < 16) {
 * System.out.println(a.getNome());
 * }
 * }
 * 
 */

/*
 * Ex: 02 Array
 * 
 * System.out.print("Quantos numeros você vai digitar? ");
 * int quantidade = scanner.nextInt();
 * double[] valores = new double[quantidade];
 * 
 * for (int i = 0; i < valores.length; i++) {
 * System.out.print("Digite um numero: ");
 * valores[i] = scanner.nextDouble();
 * }
 * 
 * String valoresImpressao = "VALORES = ";
 * double soma = 0.0;
 * for(double i: valores) {
 * valoresImpressao += (i + " ");
 * soma += i;
 * }
 * double media = soma / valores.length;
 * System.out.println(valoresImpressao);
 * System.out.println("SOMA = " + String.format("%.2f", soma));
 * System.out.println("MEDIA = " + String.format("%.2f", media));
 */

/*
 * Ex: 01 - Array
 * System.out.print("Quantos numeros você vai digitar? ");
 * int lenReader = scanner.nextInt();
 * 
 * int[] vect = new int[lenReader];
 * 
 * int negativeCount = 0;
 * for (int i = 0; i < vect.length; i++) {
 * System.out.print("Digite um numero: ");
 * vect[i] = scanner.nextInt();
 * if (vect[i] < 0) {
 * negativeCount++;
 * }
 * }
 * if (negativeCount > 0) {
 * int j = 0;
 * int[] vectNeg = new int[negativeCount];
 * for (int i = 0; i < vect.length; i++) {
 * if (vect[i] < 0) {
 * vectNeg[j] = vect[i];
 * j++;
 * }
 * }
 * System.out.println("NUMEROS NEGATIVOS:");
 * for (int numero : vectNeg) {
 * System.out.println(numero);
 * }
 * }
 * 
 */

/*
 * Estudo Arrays - pt 2
 * int quantidadeCursos = scanner.nextInt();
 * Course[] cursos = new Course[quantidadeCursos];
 * String nomeCurso;
 * double precoCurso;
 * for(int i = 0; i < cursos.length; i++) {
 * nomeCurso = scanner.next();
 * precoCurso = scanner.nextDouble();
 * cursos[i] = new Course(nomeCurso, precoCurso);
 * }
 * double soma = 0.0;
 * // for(Course curso: cursos) {
 * // soma += curso.getPrice();
 * // }
 * 
 * for(int i = 0; i < cursos.length; i++) {
 * soma += cursos[i].getPrice();
 * }
 * 
 * double media = soma / cursos.length;
 * 
 * System.out.printf("AVERAGE PRICE = %.2f%n", media);
 */

/*
 * Estudo Arrays - parte 1
 * 
 * int pessoas = scanner.nextInt();
 * double[] alturas = new double[pessoas];
 * double alturasSoma = 0.0;
 * for(int i = 0; i < alturas.length; i++) {
 * alturas[i] = scanner.nextDouble();
 * alturasSoma += alturas[i];
 * }
 * double mediaAlturas = alturasSoma / alturas.length;
 * System.out.println("AVERAGE HEIGHT = " + String.format("%.2f",
 * mediaAlturas));
 * 
 */

/*
 * estudo sobre construtores, getters and setters
 * 
 * Account account;
 * System.out.print("Enter account holder: ");
 * String name = scanner.nextLine();
 * 
 * System.out.print("Enter account number: ");
 * String accountNumber = scanner.next();
 * 
 * System.out.print("Is there an initial deposit(y/n)? ");
 * String response = scanner.next();
 * Double deposit;
 * if (response.toLowerCase().contains("yes") ||
 * response.toLowerCase().contains("y")) {
 * System.out.print("Enter initial deposit value: ");
 * deposit = scanner.nextDouble();
 * account = new Account(name, accountNumber, deposit);
 * } else {
 * account = new Account(name, accountNumber);
 * }
 * 
 * System.out.println("Account data: \n" + account);
 * 
 * System.out.println();
 * System.out.print("Enter a deposit value: ");
 * deposit = scanner.nextDouble();
 * account.depositAccount(deposit);
 * 
 * System.out.println();
 * System.out.println("Updated data: \n" + account);
 * 
 * System.out.println();
 * System.out.print("Enter a draw value: ");
 * 
 * Double draw = scanner.nextDouble();
 * if(!account.drawAccount(draw)) {
 * System.out.println("Insuficient balance!");
 * }
 * 
 * System.out.println();
 * System.out.println("Updated data: \n" + account);
 * 
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