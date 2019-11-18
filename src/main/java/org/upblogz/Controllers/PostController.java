package org.upblogz.Controllers;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.upblogz.models.Post;
import org.upblogz.models.data.PostDao;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;



@Controller
@RequestMapping("post")
public class PostController {
    @Autowired
    private PostDao postDao;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("title", "Add Post");
        model.addAttribute(new Post());
        return "post/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAdd(Model model , @ModelAttribute @Valid Post newPost, HttpSession session, Errors errors){
        if (errors.hasErrors()) {
            model.addAttribute("Post", "Add Post");
            return "post/add";
        }



        postDao.save(newPost);
        return "redirect:/post/add";

    }
}
