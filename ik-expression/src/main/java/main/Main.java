package main;

import java.util.ArrayList;
import java.util.List;

import org.wltea.expression.ExpressionEvaluator;
import org.wltea.expression.datameta.Variable;


public class Main {
	/** 
	 * Hello World Example 
	 * @param args 
	 */  
	public static void main(String[] args){  
	    if(args.length == 0){  
	        args = new String[1];  
	        args[0] = "IK Expression";  
	    }  
	    //定义表达式  
	    String expression = "\"Hello World \" + 用户名";  
	    //给表达式中的变量 "用户名" 付上下文的值  
	    List<Variable> variables = new ArrayList<Variable>();  
	    variables.add(Variable.createVariable("用户名", args[0]));  
	    //执行表达式  
	    Object result = ExpressionEvaluator.evaluate(expression, variables);  
	    System.out.println("Result = " + result);         
	}   
}
