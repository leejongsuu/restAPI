package fastcampus.projectboard.service;

import fastcampus.projectboard.dto.ArticleCommentDto;
import fastcampus.projectboard.repository.ArticleCommentRepository;
import fastcampus.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    public List<ArticleCommentDto> searchArticleComment(Long articleId) {
        return List.of();
    }

//    @Transactional(readOnly = true)
//    public Page<ArticleDto> serachArticles(SearchType searchType, String searchKeyword) {
//        return Page.empty();
//    }
//
//    @Transactional(readOnly = true)
//    public ArticleDto searchArticle(long l) {
//        return null;
//    }
//
//    public void saveArticle(ArticleDto dto) {
////        articleRepository.save();
//    }
//
//    public void updateArticle(long articleId, ArticleUpdateDto dto) {
//    }
//
//    public void deleteArticle(long articleId) {
//
//    }
}
