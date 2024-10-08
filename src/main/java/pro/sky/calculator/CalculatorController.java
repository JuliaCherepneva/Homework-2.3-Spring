package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController (CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String  hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/calculator")
    public String calculator () {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/plus")
    public String plus (@RequestParam (value = "num1", required = false) Integer num1, @RequestParam (value = "num2", required = false) Integer num2) {
            var sum = calculatorService.plus(num1,num2);
            return num1 + " + " + num2 + " = " + sum;
    }

    @GetMapping(path = "/minus")
    public String minus (@RequestParam (value = "num1", required = false) Integer num1, @RequestParam (value = "num2", required = false) Integer num2) {
          var diff = calculatorService.minus(num1, num2);
          return num1 + " - " + num2 + " = " + diff;
    }

    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam (value = "num1", required = false) Integer num1, @RequestParam (value = "num2", required = false) Integer num2) {
        var product = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + product;
    }

    @GetMapping(path = "/divide")
    public String divide (@RequestParam (value = "num1", required = false) Integer num1, @RequestParam (value = "num2", required = false) Integer num2) {
        var result = calculatorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }

}
