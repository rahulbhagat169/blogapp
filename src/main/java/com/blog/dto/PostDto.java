package com.blog.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostDto {
    public Long id;

    @NotEmpty(message = "title cannot be empty")
    private String title;

    private String url;

    @NotEmpty(message = "Post content should not be empty")
    private String content;

    @NotEmpty(message = "Post short description should be empty")
    private String shortDescription;


    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
