package Triangle.REST;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
public class GeneralErrorController implements ErrorController {

    @RequestMapping("/error")
    public ResponseEntity<String> handleError() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Error: The requested page does not exist.");
    }

    public String getErrorPath() {
        return "/error";
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("Error: Please ensure url is correctly formatted and contains all three values / triangle sides.");
    }
}
