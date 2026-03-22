package com.openai.sample.SpringBootOpenAIExample.controller;

import com.openai.sample.SpringBootOpenAIExample.service.AIService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/ai")
public class AIController {

    private final AIService aiService;

    public AIController(AIService aiService) {
        this.aiService = aiService;
    }


    @GetMapping("/chat")
    public String chat(@RequestParam String prompt)
    {
        return aiService.chat(prompt);
    }
}
