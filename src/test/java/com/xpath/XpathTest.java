package com.xpath;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTest {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "Raja");
		m.put(2, "Rome");
		m.put(3, "Darlu");
		m.put(4, "Roger");

		System.out.println(m);
Set<Integer> keySet = m.keySet();
System.out.println(keySet);
Collection<String> values = m.values();
System.out.println(values);

 String string = m.get("Raja");
System.out.println(string);
		System.out.println("==============================================");

		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			// System.out.println(entry);
			Integer key = entry.getKey();
			String value = entry.getValue();
//			System.out.println(value);
			

		}

	}
}
