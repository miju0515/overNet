package Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/collections")
public class CollectionsController {
    @GetMapping("/")
    public String moveToCollections(){
        return "collections";
    }

    @GetMapping("/collection")
    public String moveToCollection(){
        return "collection";
    }

    @GetMapping("/ticket")
    public String moveToTicket(){
        return "ticket";
    }
}
