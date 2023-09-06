package com.todo.springboot.springboottodolist.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

    @Controller
    public class SayHelloController {
        @RequestMapping("/hello")
        @ResponseBody
        public String helloWorld(){
            return "Hello World";
        }

        @RequestMapping("/hello-html")
        public String helloHtml(){
            StringBuilder sb = new StringBuilder();
            sb.append("<html>");
            sb.append("<head>");
            sb.append("<title>HTML page</title>");
            sb.append("</head>");
            sb.append("<body>");
            sb.append("<h1>");
            sb.append("My HTML page");
            sb.append("</h1>");
            sb.append("</body>");
            sb.append("</html>");

            return sb.toString();
        }
        @RequestMapping("/say-hello-jsp")
        public String sayHelloJsp(){
            return "sayHello";
        }
    }