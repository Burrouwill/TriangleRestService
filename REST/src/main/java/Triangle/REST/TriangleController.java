package Triangle.REST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriangleController {

    @GetMapping("/triangle")
    public String classifyTriangle(
            @RequestParam double a,
            @RequestParam double b,
            @RequestParam double c
    ) {
        try {
            if (a <= 0 || b <= 0 || c <= 0) {
                return "Error: Side lengths must be positive values.";
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                return "Error: Invalid triangle. The sum of any two sides must be greater than the third side.";
            }

            if (a == b && b == c) {
                return "EQUILATERAL";
            } else if (a == b || b == c || a == c) {
                return "ISOCELES";
            } else {
                return "SCALENE";
            }
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}

