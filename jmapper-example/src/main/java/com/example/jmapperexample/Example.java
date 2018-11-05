package com.example.jmapperexample;

import com.example.jmapperexample.model.Destination;
import com.example.jmapperexample.model.Source;
import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.enums.ChooseConfig;

public class Example {

	public static void main(String[] args) {

		Source source = new Source("id1", "name1");

		JMapper<Destination, Source> jmapper = new JMapper<>(Destination.class, Source.class, ChooseConfig.DESTINATION,
				"com/example/jmapperexample/mapper.xml");

		Destination destination = jmapper.getDestination(source);

		System.out.println(destination);
	}
}
