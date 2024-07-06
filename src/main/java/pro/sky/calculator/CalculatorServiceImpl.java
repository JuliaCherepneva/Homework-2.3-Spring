package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello () {
        return "<b>Добро пожаловать в калькулятор! </b>";
    }

    public String calculator () {
        return "<b>Добро пожаловать в калькулятор! </b>";
    }

    public String plus (Integer num1, Integer num2) {
        if (num1 != null && num2 != null) {
            int sum = num1 + num2;
            return "<b>Добро пожаловать в калькулятор! </b>" + num1 + "+" + num2 + "=" + sum;
        } else {
            return "<b>Добро пожаловать в калькулятор! </b>" + "Введите значение переменной!";
        }
    }

    public String minus (Integer num1, Integer num2) {
        if (num1 != null && num2 != null) {
            int diff = num1 - num2;
            return "<b>Добро пожаловать в калькулятор! </b>" + num1 + "-" + num2 + "=" + diff;
        } else {
            return "<b>Добро пожаловать в калькулятор! </b>" + "Введите значение переменной!";
        }
    }


    public String multiply (Integer num1, Integer num2) {
        if (num1 != null && num2 != null) {
            int product = num1 * num2;
            return "<b>Добро пожаловать в калькулятор! </b>" + num1 + "*" + num2 + "=" + product;
        } else {
            return "<b>Добро пожаловать в калькулятор! </b>" + "Введите значение переменной!";
        }
    }

    public String divide (Integer num1, Integer num2) {
        if (num1 != null && num2 != null) {
            if (num2 == 0) {
                return "<b>Добро пожаловать в калькулятор! </b>" + "Делить на ноль нельзя!";
            }
        } else {
            return "<b>Добро пожаловать в калькулятор! </b>" + "Введите значение переменной!";
        }
        int quotient = num1 / num2;
        return "<b>Добро пожаловать в калькулятор! </b>" + num1 + "/" + num2 + "=" + quotient;
    }
}
