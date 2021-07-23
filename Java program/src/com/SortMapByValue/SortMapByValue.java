package com.SortMapByValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class SortMapByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "swati");
		map.put(5, "asmi");
		map.put(7, "neha");
		map.put(2, "jyoti");
		map.put(9, "mina");

		List<Map.Entry<Integer, String>> list = new ArrayList(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Map.Entry<Integer, String> e1, Map.Entry<Integer, String> e2) {
				// TODO Auto-generated method stub
				return e1.getKey() - e2.getKey();
			}

		});

		for (Map.Entry<Integer, String> e : list) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

	}

}
