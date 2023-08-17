@RestController
@RequestMapping("/api/v1/user")
public class ApiController {
    @GetMapping("/welcome")
	public String welcome(){
		return "Welcome String Boot";
	}
}
