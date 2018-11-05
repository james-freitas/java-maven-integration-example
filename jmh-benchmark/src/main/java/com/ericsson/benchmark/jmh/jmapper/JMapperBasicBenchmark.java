package com.ericsson.benchmark.jmh.jmapper;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Warmup;

import com.example.jmapperexample.Example;

public class JMapperBasicBenchmark {

	@Benchmark
	@Fork(value = 1, warmups = 1)
	@BenchmarkMode(Mode.Throughput)
	@Warmup(iterations = 1)
	@Measurement(iterations = 1)
	public void measuringJmapper(){
		Example.main(null);
	}
	
}
