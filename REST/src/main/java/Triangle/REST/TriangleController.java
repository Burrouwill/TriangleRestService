package Triangle.REST;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TriangleController {

    @GetMapping("/triangle")
    public ResponseEntity<String> classifyTriangle(
            @RequestParam double a,
            @RequestParam double b,
            @RequestParam double c
    ) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error: Side lengths must be positive values.");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error: Invalid triangle. The sum of any two sides must be greater than the third side.");
        }

        if (a == b && b == c) {
            return ResponseEntity.ok("EQUILATERAL");
        } else if (a == b || b == c || a == c) {
            return ResponseEntity.ok("ISOSCELES");
        } else {
            return ResponseEntity.ok("SCALENE");
        }
    }
}

