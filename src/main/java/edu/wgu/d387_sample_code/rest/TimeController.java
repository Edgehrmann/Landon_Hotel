package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.convertor.TimeConvert;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class TimeController {

    @GetMapping("/time")
    public ResponseEntity<List<String>> timePresentation() {
        List<String> times = TimeConvert.getTime();
        return new ResponseEntity<>(times, HttpStatus.OK);
    }


}

