package com.KHRacer.KSHRD.Controller;

import com.KHRacer.KSHRD.Model.KHContentModel;
import com.KHRacer.KSHRD.Model.TypingContentModel;
import com.KHRacer.KSHRD.Repository.IContentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/KHRacer/v1")
public class ContentController {
    private IContentRepo iContentRepo;
    @Autowired
    public void setIContentRepo(IContentRepo iContentRepo){
        this.iContentRepo=iContentRepo;
    }
    @GetMapping("/content")
    public TypingContentModel getRandomContent(){
        return iContentRepo.selectRandomContent();
    }

    @PostMapping("/content")
    public boolean setContent(@RequestBody TypingContentModel typingContentModel){
        System.out.println("hi");
        return iContentRepo.InsertContent(typingContentModel);
    }
    @DeleteMapping("/content-{id}")
    public boolean deleteContent(@PathVariable int id){
        return iContentRepo.DeleteContent(id);
    }
    @PatchMapping("/content")
    public boolean updateKhContent(@RequestBody KHContentModel khContentModel){
        return iContentRepo.UpdateKHContent(khContentModel);
    }
}
