package hello;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index()
        throws InterruptedException {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd G HH:mm:ss").format(Calendar.getInstance().getTime());
        Thread.sleep(10000);
        return timeStamp;
    }
    
}
