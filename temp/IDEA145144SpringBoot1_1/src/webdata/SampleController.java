package temp.IDEA145144SpringBoot1_1.src.webdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CityService;

@Controller
public class SampleController {

    @Autowired
    private CityService cityService;

    //@GetMapping("/")
    @ResponseBody
    @Transactional(readOnly = true)
    public String helloWorld() {
        return this.cityService.getCity("Bath", "UK").getName();
    }

}
