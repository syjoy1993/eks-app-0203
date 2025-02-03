package aws.eksapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8SApiController {

    @GetMapping(value = "/api/status")
    public String k8sApiTest() {
        return "Status - returned by Pod";
    }

    @GetMapping(value = "/api/status2")
    public String k8sApiTest2() {
        return "Status2 - returned by Pod";
    }
}
