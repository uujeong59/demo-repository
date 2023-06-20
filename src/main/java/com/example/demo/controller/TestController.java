import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("test")
@@ -12,4 +13,9 @@ public class TestController {
	public String testController(){
		return "Hello World!(안녕하세요!)"; 
	}
	@GetMapping("/{id}")
	public String testContollerWithPathVariables(@PathVariable(required =false) int id){
		return "Hello World! ID "+ id; 
	}

}