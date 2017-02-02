package com.acme.prime.eval.provider;

import org.junit.Test;

import junit.framework.TestCase;

public class EvalImplTest extends TestCase {

	@Test
	public void testSimple() throws Exception {
		EvalImpl eval = new EvalImpl();
		assertEquals(3.0, eval.eval("1 + 2"));
	}
}
