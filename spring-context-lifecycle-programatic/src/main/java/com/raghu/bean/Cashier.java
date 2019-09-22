package com.raghu.bean;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cashier implements InitializingBean, DisposableBean {
	private double totalPrice = 0.0;
	private String fileName;
	private String filePath;
	private PrintWriter printWriter;

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void openStream() {
		try {
			printWriter = new PrintWriter(filePath + "/" + fileName + ".txt");
		} catch (FileNotFoundException fnfe) {
			System.out.println("Exception Occured while executing " + "the openStream() ::" + fnfe.getMessage());
		}
	}

	public void calculateTotalPrice(ShoppingCart cart) {
		List<Product> list = cart.getProducts();
		System.out.println(list.getClass());
		for (Product product : list) {
			totalPrice = totalPrice + product.getPrice();
			writeProductToFile(product);
		}
		printWriter.println("================");
		printWriter.println("Total Price :" + totalPrice);
		printWriter.flush();
	}

	public void writeProductToFile(Product product) {
		printWriter.println(new Date() + "\t" + product.getProductName() + "\t" + product.getPrice());
	}

	public void closeStream() {
		System.out.println("** called destroy() method**");
		System.out.println("** closing the stream**");
		
		printWriter.close();
	}

	@Override
	public void destroy() throws Exception {
		
		closeStream();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("** called afterPropertiesSet() method**");
		System.out.println("** opening the stream**");

		openStream();
	}
}
