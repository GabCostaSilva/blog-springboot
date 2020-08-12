package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeBlogRepository codeBlogRepository;

    //    @PostConstruct
    public void savePosts() {

        List<Post> postList = new ArrayList<>();
        String autor1 = "Bruno Alexandre";
        String titulo1 = "Docker";
        String texto1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        LocalDate data1 = LocalDate.now();
        Post post1 = new Post(titulo1, autor1, data1, texto1);

        String autor2 = "Michelli Brito";
        String titulo2 = "API REST";
        String texto2 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        LocalDate data2 = LocalDate.now();
        Post post2 = new Post(titulo2, autor2, data2, texto2);

        postList.add(post1);
        postList.add(post2);

        for (Post post : postList) {
            Post postSaved = codeBlogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}