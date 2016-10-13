package com.wyc.algorth.captcher1.runner;

import com.wyc.algorth.captcher1.model.FixedCapacityStack;
import com.wyc.algorth.captcher1.model.FixedCapacityStack2;

/**
 * Created by Administrator on 2016/10/13.
 */
public class Evaluate {
    public static void main(String[] args) {
        FixedCapacityStack2<String> ops = new FixedCapacityStack2<String>();
        FixedCapacityStack2<Double> vals = new FixedCapacityStack2<Double>();
        // TODO: 2016/10/13
        //问题1  只能运算最末结尾为)的表达式
        //问题2  不能处理算数运算符  如 (1 * 2 + 3 ) 这种表达式是会运行错误的
        String[] evals = new String[]{"(","1","+","(","(","2","+","3",")","*","(","4","*","5",")",")",")"};
        for(String e : evals){
            eval(ops,vals,e);
        }
        System.out.println(vals.pop());
    }

    public static void eval(FixedCapacityStack2<String> ops, FixedCapacityStack2<Double> vals , String value){
        if(value.equals("(")) ;
        else if (value.equals("+")) ops.push(value);
        else if (value.equals("-")) ops.push(value);
        else if (value.equals("*")) ops.push(value);
        else if (value.equals("/")) ops.push(value);
        else if (value.equals("sqrt")) ops.push(value);
        else if (value.equals(")")){
            String op = ops.pop();
            double v = vals.pop();
            if(op.equals("+"))  v = vals.pop() + v;
            else if (op.equals("-")) v = vals.pop() - v;
            else if (op.equals("-")) v = vals.pop() - v;
            else if (op.equals("*")) v = vals.pop() * v;
            else if (op.equals("/")) v = vals.pop() / v;
            else if (op.equals("sqrt")) v = Math.sqrt(v);
            vals.push(v);
        }else vals.push(Double.parseDouble(value));
    }
}
