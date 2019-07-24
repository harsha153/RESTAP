package com.amdocs.restapicontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class Calculator {
	@GetMapping("addition")
	@ResponseBody
public double addition(@RequestParam double firstOperand,double secondOperand)
{
	return firstOperand+secondOperand;
}
}
