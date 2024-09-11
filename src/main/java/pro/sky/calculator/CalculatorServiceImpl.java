package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hello() {
        return "<b>Добро пожаловать в калькулятор! </b>";
    }
    @Override
    public String calculator() {
        return "<b>Добро пожаловать в калькулятор! </b>";
    }

    @Override
    public int plus(int num1, int num2) {
            return num1 + num2;
        }

    @Override
    public int minus (int num1, int num2) {
        return num1 - num2;

    }
    @Override
    public int multiply(int num1, int num2) {
            return num1 * num2;
        }

    @Override
    public int divide (int num1, int num2) {
        if (num2 == 0) throw new IllegalArgumentException("На ноль делить нельзя!");
        return num1 / num2;
        }
    }




