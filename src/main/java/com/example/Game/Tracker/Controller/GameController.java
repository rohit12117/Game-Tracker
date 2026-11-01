package com.example.Game.Tracker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.yaml.snakeyaml.nodes.NodeId.mapping;

@RestController
public class GameController {

    @RequestMapping(method = GET , value = "/games" )
         String getALL2(){
            return "ALL GAMES";
        }


//    @GetMapping("/games")
//        public String getALL() {
//            return "ALL GAMES";
//        }

}
