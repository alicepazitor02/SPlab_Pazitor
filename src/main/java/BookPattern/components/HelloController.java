package BookPattern.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)

public class HelloController {

    private final ClientComponent clientComponent;

    @GetMapping("/")
    public String operation() {
        return "Hello from ClientComponent = " + clientComponent.toString();
    }
}
