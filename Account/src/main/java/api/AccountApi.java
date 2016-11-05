package api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ed_ao on 04.11.2016.
 */
@RestController
@RequestMapping("/")
public class AccountApi {
    @RequestMapping(value = "/accounts")
    public ResponseEntity<String> getAllAccounts(){
        return new ResponseEntity<String>("Success", HttpStatus.ACCEPTED);
    }
}
